// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:28


package rs.ac.bg.etf.pp1.ast;

public class ConstDeclationsForType extends ConstDeclListForType {

    private ConstDeclListForType ConstDeclListForType;
    private ConstDeclForType ConstDeclForType;

    public ConstDeclationsForType (ConstDeclListForType ConstDeclListForType, ConstDeclForType ConstDeclForType) {
        this.ConstDeclListForType=ConstDeclListForType;
        if(ConstDeclListForType!=null) ConstDeclListForType.setParent(this);
        this.ConstDeclForType=ConstDeclForType;
        if(ConstDeclForType!=null) ConstDeclForType.setParent(this);
    }

    public ConstDeclListForType getConstDeclListForType() {
        return ConstDeclListForType;
    }

    public void setConstDeclListForType(ConstDeclListForType ConstDeclListForType) {
        this.ConstDeclListForType=ConstDeclListForType;
    }

    public ConstDeclForType getConstDeclForType() {
        return ConstDeclForType;
    }

    public void setConstDeclForType(ConstDeclForType ConstDeclForType) {
        this.ConstDeclForType=ConstDeclForType;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstDeclListForType!=null) ConstDeclListForType.accept(visitor);
        if(ConstDeclForType!=null) ConstDeclForType.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstDeclListForType!=null) ConstDeclListForType.traverseTopDown(visitor);
        if(ConstDeclForType!=null) ConstDeclForType.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstDeclListForType!=null) ConstDeclListForType.traverseBottomUp(visitor);
        if(ConstDeclForType!=null) ConstDeclForType.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDeclationsForType(\n");

        if(ConstDeclListForType!=null)
            buffer.append(ConstDeclListForType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstDeclForType!=null)
            buffer.append(ConstDeclForType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDeclationsForType]");
        return buffer.toString();
    }
}
