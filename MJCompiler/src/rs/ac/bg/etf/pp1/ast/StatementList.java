// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:28


package rs.ac.bg.etf.pp1.ast;

public class StatementList extends StmntList {

    private StmntList StmntList;
    private Stmnt Stmnt;

    public StatementList (StmntList StmntList, Stmnt Stmnt) {
        this.StmntList=StmntList;
        if(StmntList!=null) StmntList.setParent(this);
        this.Stmnt=Stmnt;
        if(Stmnt!=null) Stmnt.setParent(this);
    }

    public StmntList getStmntList() {
        return StmntList;
    }

    public void setStmntList(StmntList StmntList) {
        this.StmntList=StmntList;
    }

    public Stmnt getStmnt() {
        return Stmnt;
    }

    public void setStmnt(Stmnt Stmnt) {
        this.Stmnt=Stmnt;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(StmntList!=null) StmntList.accept(visitor);
        if(Stmnt!=null) Stmnt.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(StmntList!=null) StmntList.traverseTopDown(visitor);
        if(Stmnt!=null) Stmnt.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(StmntList!=null) StmntList.traverseBottomUp(visitor);
        if(Stmnt!=null) Stmnt.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementList(\n");

        if(StmntList!=null)
            buffer.append(StmntList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Stmnt!=null)
            buffer.append(Stmnt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementList]");
        return buffer.toString();
    }
}
