// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:28


package rs.ac.bg.etf.pp1.ast;

public class SingleVarDeclarationForType extends VarDeclListForType {

    private VarDeclForType VarDeclForType;

    public SingleVarDeclarationForType (VarDeclForType VarDeclForType) {
        this.VarDeclForType=VarDeclForType;
        if(VarDeclForType!=null) VarDeclForType.setParent(this);
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
        if(VarDeclForType!=null) VarDeclForType.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclForType!=null) VarDeclForType.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclForType!=null) VarDeclForType.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleVarDeclarationForType(\n");

        if(VarDeclForType!=null)
            buffer.append(VarDeclForType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleVarDeclarationForType]");
        return buffer.toString();
    }
}
