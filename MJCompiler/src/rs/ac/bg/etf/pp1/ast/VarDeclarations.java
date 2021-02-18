// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:28


package rs.ac.bg.etf.pp1.ast;

public class VarDeclarations extends VarDeclList {

    private VarDeclList VarDeclList;
    private VarDeclType VarDeclType;
    private VarDeclListForType VarDeclListForType;

    public VarDeclarations (VarDeclList VarDeclList, VarDeclType VarDeclType, VarDeclListForType VarDeclListForType) {
        this.VarDeclList=VarDeclList;
        if(VarDeclList!=null) VarDeclList.setParent(this);
        this.VarDeclType=VarDeclType;
        if(VarDeclType!=null) VarDeclType.setParent(this);
        this.VarDeclListForType=VarDeclListForType;
        if(VarDeclListForType!=null) VarDeclListForType.setParent(this);
    }

    public VarDeclList getVarDeclList() {
        return VarDeclList;
    }

    public void setVarDeclList(VarDeclList VarDeclList) {
        this.VarDeclList=VarDeclList;
    }

    public VarDeclType getVarDeclType() {
        return VarDeclType;
    }

    public void setVarDeclType(VarDeclType VarDeclType) {
        this.VarDeclType=VarDeclType;
    }

    public VarDeclListForType getVarDeclListForType() {
        return VarDeclListForType;
    }

    public void setVarDeclListForType(VarDeclListForType VarDeclListForType) {
        this.VarDeclListForType=VarDeclListForType;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDeclList!=null) VarDeclList.accept(visitor);
        if(VarDeclType!=null) VarDeclType.accept(visitor);
        if(VarDeclListForType!=null) VarDeclListForType.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclList!=null) VarDeclList.traverseTopDown(visitor);
        if(VarDeclType!=null) VarDeclType.traverseTopDown(visitor);
        if(VarDeclListForType!=null) VarDeclListForType.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclList!=null) VarDeclList.traverseBottomUp(visitor);
        if(VarDeclType!=null) VarDeclType.traverseBottomUp(visitor);
        if(VarDeclListForType!=null) VarDeclListForType.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDeclarations(\n");

        if(VarDeclList!=null)
            buffer.append(VarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclType!=null)
            buffer.append(VarDeclType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclListForType!=null)
            buffer.append(VarDeclListForType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDeclarations]");
        return buffer.toString();
    }
}
