// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:29


package rs.ac.bg.etf.pp1.ast;

public class CharFactor extends Factor {

    private Character charConst;

    public CharFactor (Character charConst) {
        this.charConst=charConst;
    }

    public Character getCharConst() {
        return charConst;
    }

    public void setCharConst(Character charConst) {
        this.charConst=charConst;
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
        buffer.append("CharFactor(\n");

        buffer.append(" "+tab+charConst);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CharFactor]");
        return buffer.toString();
    }
}
