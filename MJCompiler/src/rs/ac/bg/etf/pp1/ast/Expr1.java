// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:28


package rs.ac.bg.etf.pp1.ast;

public class Expr1 implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    public rs.etf.pp1.symboltable.concepts.Struct struct = null;

    private Expr1FirstTerm Expr1FirstTerm;
    private AddopTermList AddopTermList;

    public Expr1 (Expr1FirstTerm Expr1FirstTerm, AddopTermList AddopTermList) {
        this.Expr1FirstTerm=Expr1FirstTerm;
        if(Expr1FirstTerm!=null) Expr1FirstTerm.setParent(this);
        this.AddopTermList=AddopTermList;
        if(AddopTermList!=null) AddopTermList.setParent(this);
    }

    public Expr1FirstTerm getExpr1FirstTerm() {
        return Expr1FirstTerm;
    }

    public void setExpr1FirstTerm(Expr1FirstTerm Expr1FirstTerm) {
        this.Expr1FirstTerm=Expr1FirstTerm;
    }

    public AddopTermList getAddopTermList() {
        return AddopTermList;
    }

    public void setAddopTermList(AddopTermList AddopTermList) {
        this.AddopTermList=AddopTermList;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Expr1FirstTerm!=null) Expr1FirstTerm.accept(visitor);
        if(AddopTermList!=null) AddopTermList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Expr1FirstTerm!=null) Expr1FirstTerm.traverseTopDown(visitor);
        if(AddopTermList!=null) AddopTermList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Expr1FirstTerm!=null) Expr1FirstTerm.traverseBottomUp(visitor);
        if(AddopTermList!=null) AddopTermList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Expr1(\n");

        if(Expr1FirstTerm!=null)
            buffer.append(Expr1FirstTerm.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(AddopTermList!=null)
            buffer.append(AddopTermList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Expr1]");
        return buffer.toString();
    }
}
