// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:29


package rs.ac.bg.etf.pp1.ast;

public class NewArrayFactor extends Factor {

    private String typeName;
    private Expr Expr;

    public NewArrayFactor (String typeName, Expr Expr) {
        this.typeName=typeName;
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName=typeName;
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Expr!=null) Expr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NewArrayFactor(\n");

        buffer.append(" "+tab+typeName);
        buffer.append("\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [NewArrayFactor]");
        return buffer.toString();
    }
}
