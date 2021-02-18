// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:28


package rs.ac.bg.etf.pp1.ast;

public class ConstDeclarionForBool extends ConstDeclForType {

    private String constName;
    private Boolean boolConst;

    public ConstDeclarionForBool (String constName, Boolean boolConst) {
        this.constName=constName;
        this.boolConst=boolConst;
    }

    public String getConstName() {
        return constName;
    }

    public void setConstName(String constName) {
        this.constName=constName;
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
        buffer.append("ConstDeclarionForBool(\n");

        buffer.append(" "+tab+constName);
        buffer.append("\n");

        buffer.append(" "+tab+boolConst);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDeclarionForBool]");
        return buffer.toString();
    }
}
