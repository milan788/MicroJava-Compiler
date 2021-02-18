// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:28


package rs.ac.bg.etf.pp1.ast;

public class ConstDeclarionForInt extends ConstDeclForType {

    private String constName;
    private Integer numConst;

    public ConstDeclarionForInt (String constName, Integer numConst) {
        this.constName=constName;
        this.numConst=numConst;
    }

    public String getConstName() {
        return constName;
    }

    public void setConstName(String constName) {
        this.constName=constName;
    }

    public Integer getNumConst() {
        return numConst;
    }

    public void setNumConst(Integer numConst) {
        this.numConst=numConst;
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
        buffer.append("ConstDeclarionForInt(\n");

        buffer.append(" "+tab+constName);
        buffer.append("\n");

        buffer.append(" "+tab+numConst);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDeclarionForInt]");
        return buffer.toString();
    }
}
