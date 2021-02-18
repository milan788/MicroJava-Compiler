// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:28


package rs.ac.bg.etf.pp1.ast;

public class ConditionalExpression extends Expr {

    private CondFact CondFact;
    private AltExpr1 AltExpr1;
    private AltExpr2 AltExpr2;

    public ConditionalExpression (CondFact CondFact, AltExpr1 AltExpr1, AltExpr2 AltExpr2) {
        this.CondFact=CondFact;
        if(CondFact!=null) CondFact.setParent(this);
        this.AltExpr1=AltExpr1;
        if(AltExpr1!=null) AltExpr1.setParent(this);
        this.AltExpr2=AltExpr2;
        if(AltExpr2!=null) AltExpr2.setParent(this);
    }

    public CondFact getCondFact() {
        return CondFact;
    }

    public void setCondFact(CondFact CondFact) {
        this.CondFact=CondFact;
    }

    public AltExpr1 getAltExpr1() {
        return AltExpr1;
    }

    public void setAltExpr1(AltExpr1 AltExpr1) {
        this.AltExpr1=AltExpr1;
    }

    public AltExpr2 getAltExpr2() {
        return AltExpr2;
    }

    public void setAltExpr2(AltExpr2 AltExpr2) {
        this.AltExpr2=AltExpr2;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(CondFact!=null) CondFact.accept(visitor);
        if(AltExpr1!=null) AltExpr1.accept(visitor);
        if(AltExpr2!=null) AltExpr2.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(CondFact!=null) CondFact.traverseTopDown(visitor);
        if(AltExpr1!=null) AltExpr1.traverseTopDown(visitor);
        if(AltExpr2!=null) AltExpr2.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(CondFact!=null) CondFact.traverseBottomUp(visitor);
        if(AltExpr1!=null) AltExpr1.traverseBottomUp(visitor);
        if(AltExpr2!=null) AltExpr2.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConditionalExpression(\n");

        if(CondFact!=null)
            buffer.append(CondFact.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(AltExpr1!=null)
            buffer.append(AltExpr1.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(AltExpr2!=null)
            buffer.append(AltExpr2.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConditionalExpression]");
        return buffer.toString();
    }
}
