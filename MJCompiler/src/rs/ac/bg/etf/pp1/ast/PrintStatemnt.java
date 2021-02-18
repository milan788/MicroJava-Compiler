// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:28


package rs.ac.bg.etf.pp1.ast;

public class PrintStatemnt extends Stmnt {

    private Print Print;
    private Expr Expr;
    private PrintExprKind PrintExprKind;

    public PrintStatemnt (Print Print, Expr Expr, PrintExprKind PrintExprKind) {
        this.Print=Print;
        if(Print!=null) Print.setParent(this);
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
        this.PrintExprKind=PrintExprKind;
        if(PrintExprKind!=null) PrintExprKind.setParent(this);
    }

    public Print getPrint() {
        return Print;
    }

    public void setPrint(Print Print) {
        this.Print=Print;
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public PrintExprKind getPrintExprKind() {
        return PrintExprKind;
    }

    public void setPrintExprKind(PrintExprKind PrintExprKind) {
        this.PrintExprKind=PrintExprKind;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Print!=null) Print.accept(visitor);
        if(Expr!=null) Expr.accept(visitor);
        if(PrintExprKind!=null) PrintExprKind.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Print!=null) Print.traverseTopDown(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
        if(PrintExprKind!=null) PrintExprKind.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Print!=null) Print.traverseBottomUp(visitor);
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        if(PrintExprKind!=null) PrintExprKind.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("PrintStatemnt(\n");

        if(Print!=null)
            buffer.append(Print.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(PrintExprKind!=null)
            buffer.append(PrintExprKind.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [PrintStatemnt]");
        return buffer.toString();
    }
}
