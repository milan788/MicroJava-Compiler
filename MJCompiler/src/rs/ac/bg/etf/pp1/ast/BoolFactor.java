// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:29


package rs.ac.bg.etf.pp1.ast;

public class BoolFactor extends Factor {

    private Boolean boolConst;

    public BoolFactor (Boolean boolConst) {
        this.boolConst=boolConst;
    }

    public Boolean getBoolConst() {
        return boolConst;
    }

    public void setBoolConst(Boolean boolConst) {
        this.boolConst=boolConst;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("BoolFactor(\n");

        buffer.append(" "+tab+boolConst);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [BoolFactor]");
        return buffer.toString();
    }
}
