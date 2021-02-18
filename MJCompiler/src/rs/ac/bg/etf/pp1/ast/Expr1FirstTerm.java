// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:28


package rs.ac.bg.etf.pp1.ast;

public class Expr1FirstTerm implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private TermExprSign TermExprSign;
    private Term Term;

    public Expr1FirstTerm (TermExprSign TermExprSign, Term Term) {
        this.TermExprSign=TermExprSign;
        if(TermExprSign!=null) TermExprSign.setParent(this);
        this.Term=Term;
        if(Term!=null) Term.setParent(this);
    }

    public TermExprSign getTermExprSign() {
        return TermExprSign;
    }

    public void setTermExprSign(TermExprSign TermExprSign) {
        this.TermExprSign=TermExprSign;
    }

    public Term getTerm() {
        return Term;
    }

    public void setTerm(Term Term) {
        this.Term=Term;
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
        if(TermExprSign!=null) TermExprSign.accept(visitor);
        if(Term!=null) Term.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(TermExprSign!=null) TermExprSign.traverseTopDown(visitor);
        if(Term!=null) Term.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(TermExprSign!=null) TermExprSign.traverseBottomUp(visitor);
        if(Term!=null) Term.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Expr1FirstTerm(\n");

        if(TermExprSign!=null)
            buffer.append(TermExprSign.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Term!=null)
            buffer.append(Term.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Expr1FirstTerm]");
        return buffer.toString();
    }
}
