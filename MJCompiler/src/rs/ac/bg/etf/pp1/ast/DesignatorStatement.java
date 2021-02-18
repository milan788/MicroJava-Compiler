// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:28


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStatement extends Stmnt {

    private DesignatorStmnt DesignatorStmnt;

    public DesignatorStatement (DesignatorStmnt DesignatorStmnt) {
        this.DesignatorStmnt=DesignatorStmnt;
        if(DesignatorStmnt!=null) DesignatorStmnt.setParent(this);
    }

    public DesignatorStmnt getDesignatorStmnt() {
        return DesignatorStmnt;
    }

    public void setDesignatorStmnt(DesignatorStmnt DesignatorStmnt) {
        this.DesignatorStmnt=DesignatorStmnt;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorStmnt!=null) DesignatorStmnt.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorStmnt!=null) DesignatorStmnt.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorStmnt!=null) DesignatorStmnt.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStatement(\n");

        if(DesignatorStmnt!=null)
            buffer.append(DesignatorStmnt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStatement]");
        return buffer.toString();
    }
}
