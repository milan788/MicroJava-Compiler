package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.CounterVisitor.FormParamCounter;
import rs.ac.bg.etf.pp1.CounterVisitor.VarCounter;
import rs.ac.bg.etf.pp1.ast.*;
import rs.etf.pp1.mj.runtime.Code;
import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;

public class CodeGenerator extends VisitorAdaptor {
	private int mainPc;
	
	public int getMainPc(){
		return mainPc;
	}
	
	@Override
	public void visit(MethTypeName methodTypeName) {
		if("main".equalsIgnoreCase(methodTypeName.getName())) {
			mainPc = Code.pc;
		}
		methodTypeName.obj.setAdr(Code.pc);
		// Collect arguments and local variables
		SyntaxNode methodNode = methodTypeName.getParent();
	
		VarCounter varCnt = new VarCounter();
		methodNode.traverseTopDown(varCnt);
		
		FormParamCounter fpCnt = new FormParamCounter();
		methodNode.traverseTopDown(fpCnt);
		
		// Generate the entry
		Code.put(Code.enter);
		Code.put(fpCnt.getCount());
		Code.put(fpCnt.getCount() + varCnt.getCount());
	}
	
	@Override
	public void visit(MethodDeclaration methodDeclaration) {
		Code.put(Code.exit);
		Code.put(Code.return_);
	}

//Statements=====================================================================================================
	@Override
	public void visit(ReadStatement readStatement) {
		Designator designator = readStatement.getDesignator();
		Struct type = designator.obj.getType();
		if(type.getKind() == Struct.Array) type = type.getElemType();
		if(type == Table.charType)
			Code.put(Code.bread);
		else
			Code.put(Code.read);
		storeDesignator(designator);
	}
	
	int printIterAddr;
	
	@Override
	public void visit(PrintStatemnt printStatemnt) {
		if(printStatemnt.getExpr().struct.equals(Tab.intType)){
			Code.loadConst(5);
			Code.put(Code.print);
		}else{
			Code.loadConst(1);
			Code.put(Code.bprint);
		}
		PrintExprKind kind = printStatemnt.getPrintExprKind();
		if(kind instanceof PrintMultipleTimesExpr) {
			Code.loadConst(1);
			Code.put(Code.sub);
			Code.put(Code.dup);
			Code.loadConst(0);
			Code.putFalseJump(Code.eq, printIterAddr);
			Code.put(Code.pop);
		}
	}
	
	@Override
	public void visit(Print print) {
		PrintStatemnt printStatemnt = (PrintStatemnt)print.getParent();
		PrintExprKind kind = printStatemnt.getPrintExprKind();
		if(kind instanceof PrintMultipleTimesExpr) {
			Code.loadConst(((PrintMultipleTimesExpr) kind).getNumOfTimes().intValue());
			printIterAddr = Code.pc;
		}
	}
	
	@Override
	public void visit(AssignDesignatorStatement assignDesignatorStatement) {
		storeDesignator(assignDesignatorStatement.getDesignator());
	}
	
	@Override
	public void visit(IncDesignatorStatement incDesignatorStatement) {
		Designator designator = incDesignatorStatement.getDesignator();
		incAndDecStatements(designator, 1);
	}
	
	@Override
	public void visit(DecDesigntorStatement decDesigntorStatement) {
		Designator designator = decDesigntorStatement.getDesignator();
		incAndDecStatements(designator, -1);
	}
	
	private void incAndDecStatements(Designator designator, int value) {
		if(designator instanceof ArrayElemDesignator) {
			Code.put(Code.dup2);
		}
		loadDesignator(designator);
		Code.loadConst(value);
		Code.put(Code.add);
		storeDesignator(designator);
	}
	
	@Override
	public void visit(ArrayName arrayName) {
		Code.load(arrayName.obj);
	}
	
//Expressions=====================================================================================================
	int onElseJmp, onAfterElseJmp;
	
	@Override
	public void visit(CondFact condFact) {
		Code.loadConst(0);
		Code.putFalseJump(Code.ne, 0);
		onElseJmp = Code.pc - 2;
	}
	
	@Override
	public void visit(AltExpr1 altExpr1) {
		Code.putJump(0);
		onAfterElseJmp = Code.pc - 2;
		Code.fixup(onElseJmp);
	}
	
	@Override
	public void visit(AltExpr2 altExpr2) {
		Code.fixup(onAfterElseJmp);
	}
	
	@Override
	public void visit(Expr1FirstTerm expr1FirstTerm) {
		if(expr1FirstTerm.getTermExprSign() instanceof NegatedExpression) {
			Code.put(Code.neg);
		}
	}
	
	@Override
	public void visit(MultipleTerms multipleTerms) {
		Addop addop = multipleTerms.getAddopTerm().getAddop();
		if(addop instanceof Add) 
			Code.put(Code.add);
		else
			Code.put(Code.sub);
	}
	
//Terms and Factors=====================================================================================================
	@Override
	public void visit(MultipleFactors multipleFactors) {
		Mulop mulop = multipleFactors.getMulopFactor().getMulop();
		if(mulop instanceof Mul)
			Code.put(Code.mul);
		else if(mulop instanceof Div)
			Code.put(Code.div);
		else
			Code.put(Code.rem);
	}
	
	@Override
	public void visit(DesignatorFactor designatorFactor) {
		loadDesignator(designatorFactor.getDesignator());
	}
	
	@Override
	public void visit(NumFactor numFactor) {
		Code.loadConst(numFactor.getNumConst().intValue());
	}
	
	@Override
	public void visit(CharFactor charFactor) {
		Code.loadConst(charFactor.getCharConst().charValue());
	}
	
	@Override
	public void visit(BoolFactor boolFactor) {
		boolean value = boolFactor.getBoolConst().booleanValue();
		Code.loadConst(value ? 1 : 0);
	}
	
	@Override
	public void visit(NewArrayFactor newArrayFactor) {
		Code.put(Code.newarray);
		if(newArrayFactor.struct.getElemType() == Table.charType)
			Code.put(0); 
		else
			Code.put(1);
	}

//Private==============================================================================================================
	private void loadDesignator(Designator designator) {
		if(designator instanceof VarDesignator)
			loadVarDesignator((VarDesignator)designator);
		else
			loadArrayElemDesignator((ArrayElemDesignator)designator);
	}
	
	private void loadVarDesignator(VarDesignator varDesignator) {
		Code.load(varDesignator.obj);
	}
	
	private void loadArrayElemDesignator(ArrayElemDesignator arrayElemDesignator) {
		Struct type = arrayElemDesignator.obj.getType().getElemType();
		Code.put(type == Table.charType ? Code.baload : Code.aload);
	}
	
	private void storeDesignator(Designator designator) {
		if(designator instanceof VarDesignator)
			storeVarDesignator((VarDesignator)designator);
		else
			storeArrayElemDesignator((ArrayElemDesignator)designator);
	}

	private void storeVarDesignator(VarDesignator varDesignator) {
		Code.store(varDesignator.obj);
	}
	
	private void storeArrayElemDesignator(ArrayElemDesignator arrayElemDesignator) {
		Struct type = arrayElemDesignator.obj.getType().getElemType();
		Code.put(type == Table.charType ? Code.bastore : Code.astore);
	}

}