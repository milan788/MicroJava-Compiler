// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:28


package rs.ac.bg.etf.pp1.ast;

public class ConstDeclarations extends ConstDeclList {

    private ConstDeclList ConstDeclList;
    private ConstDeclListType ConstDeclListType;
    private ConstDeclListForType ConstDeclListForType;

    public ConstDeclarations (ConstDeclList ConstDeclList, ConstDeclListType ConstDeclListType, ConstDeclListForType ConstDeclListForType) {
        this.ConstDeclList=ConstDeclList;
        if(ConstDeclList!=null) ConstDeclList.setParent(this);
        this.ConstDeclListType=ConstDeclListType;
        if(ConstDeclListType!=null) ConstDeclListType.setParent(this);
        this.ConstDeclListForType=ConstDeclListForType;
        if(ConstDeclListForType!=null) ConstDeclListForType.setParent(this);
    }

    public ConstDeclList getConstDeclList() {
        return ConstDeclList;
    }

    public void setConstDeclList(ConstDeclList ConstDeclList) {
        this.ConstDeclList=ConstDeclList;
    }

    public ConstDeclListType getConstDeclListType() {
        return ConstDeclListType;
    }

    public void setConstDeclListType(ConstDeclListType ConstDeclListType) {
        this.ConstDeclListType=ConstDeclListType;
    }

    public ConstDeclListForType getConstDeclListForType() {
        return ConstDeclListForType;
    }

    public void setConstDeclListForType(ConstDeclListForType ConstDeclListForType) {
        this.ConstDeclListForType=ConstDeclListForType;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstDeclList!=null) ConstDeclList.accept(visitor);
        if(ConstDeclListType!=null) ConstDeclListType.accept(visitor);
        if(ConstDeclListForType!=null) ConstDeclListForType.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstDeclList!=null) ConstDeclList.traverseTopDown(visitor);
        if(ConstDeclListType!=null) ConstDeclListType.traverseTopDown(visitor);
        if(ConstDeclListForType!=null) ConstDeclListForType.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstDeclList!=null) ConstDeclList.traverseBottomUp(visitor);
        if(ConstDeclListType!=null) ConstDeclListType.traverseBottomUp(visitor);
        if(ConstDeclListForType!=null) ConstDeclListForType.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDeclarations(\n");

        if(ConstDeclList!=null)
            buffer.append(ConstDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstDeclListType!=null)
            buffer.append(ConstDeclListType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstDeclListForType!=null)
            buffer.append(ConstDeclListForType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDeclarations]");
        return buffer.toString();
    }
}
