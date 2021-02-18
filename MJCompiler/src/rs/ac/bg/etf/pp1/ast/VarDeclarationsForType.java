// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:28


package rs.ac.bg.etf.pp1.ast;

public class VarDeclarationsForType extends VarDeclListForType {

    private VarDeclListForType VarDeclListForType;
    private VarDeclForType VarDeclForType;

    public VarDeclarationsForType (VarDeclListForType VarDeclListForType, VarDeclForType VarDeclForType) {
        this.VarDeclListForType=VarDeclListForType;
        if(VarDeclListForType!=null) VarDeclListForType.setParent(this);
        this.VarDeclForType=VarDeclForType;
        if(VarDeclForType!=null) VarDeclForType.setParent(this);
    }

    public VarDeclListForType getVarDeclListForType() {
        return VarDeclListForType;
    }

    public void setVarDeclListForType(VarDeclListForType VarDeclListForType) {
        this.VarDeclListForType=VarDeclListForType;
    }

    public VarDeclForType getVarDeclForType() {
        return VarDeclForType;
    }

    public void setVarDeclForType(VarDeclForType VarDeclForType) {
        this.VarDeclForType=VarDeclForType;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDeclListForType!=null) VarDeclListForType.accept(visitor);
        if(VarDeclForType!=null) VarDeclForType.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclListForType!=null) VarDeclListForType.traverseTopDown(visitor);
        if(VarDeclForType!=null) VarDeclForType.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclListForType!=null) VarDeclListForType.traverseBottomUp(visitor);
        if(VarDeclForType!=null) VarDeclForType.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDeclarationsForType(\n");

        if(VarDeclListForType!=null)
            buffer.append(VarDeclListForType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclForType!=null)
            buffer.append(VarDeclForType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDeclarationsForType]");
        return buffer.toString();
    }
}
