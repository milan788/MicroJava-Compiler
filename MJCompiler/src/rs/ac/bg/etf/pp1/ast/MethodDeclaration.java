// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:28


package rs.ac.bg.etf.pp1.ast;

public class MethodDeclaration extends MethodDecl {

    private MethTypeName MethTypeName;
    private FormalParams FormalParams;
    private VarDeclList VarDeclList;
    private StmntList StmntList;

    public MethodDeclaration (MethTypeName MethTypeName, FormalParams FormalParams, VarDeclList VarDeclList, StmntList StmntList) {
        this.MethTypeName=MethTypeName;
        if(MethTypeName!=null) MethTypeName.setParent(this);
        this.FormalParams=FormalParams;
        if(FormalParams!=null) FormalParams.setParent(this);
        this.VarDeclList=VarDeclList;
        if(VarDeclList!=null) VarDeclList.setParent(this);
        this.StmntList=StmntList;
        if(StmntList!=null) StmntList.setParent(this);
    }

    public MethTypeName getMethTypeName() {
        return MethTypeName;
    }

    public void setMethTypeName(MethTypeName MethTypeName) {
        this.MethTypeName=MethTypeName;
    }

    public FormalParams getFormalParams() {
        return FormalParams;
    }

    public void setFormalParams(FormalParams FormalParams) {
        this.FormalParams=FormalParams;
    }

    public VarDeclList getVarDeclList() {
        return VarDeclList;
    }

    public void setVarDeclList(VarDeclList VarDeclList) {
        this.VarDeclList=VarDeclList;
    }

    public StmntList getStmntList() {
        return StmntList;
    }

    public void setStmntList(StmntList StmntList) {
        this.StmntList=StmntList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MethTypeName!=null) MethTypeName.accept(visitor);
        if(FormalParams!=null) FormalParams.accept(visitor);
        if(VarDeclList!=null) VarDeclList.accept(visitor);
        if(StmntList!=null) StmntList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethTypeName!=null) MethTypeName.traverseTopDown(visitor);
        if(FormalParams!=null) FormalParams.traverseTopDown(visitor);
        if(VarDeclList!=null) VarDeclList.traverseTopDown(visitor);
        if(StmntList!=null) StmntList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethTypeName!=null) MethTypeName.traverseBottomUp(visitor);
        if(FormalParams!=null) FormalParams.traverseBottomUp(visitor);
        if(VarDeclList!=null) VarDeclList.traverseBottomUp(visitor);
        if(StmntList!=null) StmntList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodDeclaration(\n");

        if(MethTypeName!=null)
            buffer.append(MethTypeName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(FormalParams!=null)
            buffer.append(FormalParams.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclList!=null)
            buffer.append(VarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(StmntList!=null)
            buffer.append(StmntList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodDeclaration]");
        return buffer.toString();
    }
}
