// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:28


package rs.ac.bg.etf.pp1.ast;

public class FormalParameterDeclaration implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private VarDeclType VarDeclType;
    private VarDeclForType VarDeclForType;

    public FormalParameterDeclaration (VarDeclType VarDeclType, VarDeclForType VarDeclForType) {
        this.VarDeclType=VarDeclType;
        if(VarDeclType!=null) VarDeclType.setParent(this);
        this.VarDeclForType=VarDeclForType;
        if(VarDeclForType!=null) VarDeclForType.setParent(this);
    }

    public VarDeclType getVarDeclType() {
        return VarDeclType;
    }

    public void setVarDeclType(VarDeclType VarDeclType) {
        this.VarDeclType=VarDeclType;
    }

    public VarDeclForType getVarDeclForType() {
        return VarDeclForType;
    }

    public void setVarDeclForType(VarDeclForType VarDeclForType) {
        this.VarDeclForType=VarDeclForType;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDeclType!=null) VarDeclType.accept(visitor);
        if(VarDeclForType!=null) VarDeclForType.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclType!=null) VarDeclType.traverseTopDown(visitor);
        if(VarDeclForType!=null) VarDeclForType.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclType!=null) VarDeclType.traverseBottomUp(visitor);
        if(VarDeclForType!=null) VarDeclForType.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormalParameterDeclaration(\n");

        if(VarDeclType!=null)
            buffer.append(VarDeclType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclForType!=null)
            buffer.append(VarDeclForType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormalParameterDeclaration]");
        return buffer.toString();
    }
}
