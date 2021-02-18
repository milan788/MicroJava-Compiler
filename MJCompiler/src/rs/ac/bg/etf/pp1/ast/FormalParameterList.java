// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:28


package rs.ac.bg.etf.pp1.ast;

public class FormalParameterList extends FormalParamList {

    private FormalParamList FormalParamList;
    private FormalParameterDeclaration FormalParameterDeclaration;

    public FormalParameterList (FormalParamList FormalParamList, FormalParameterDeclaration FormalParameterDeclaration) {
        this.FormalParamList=FormalParamList;
        if(FormalParamList!=null) FormalParamList.setParent(this);
        this.FormalParameterDeclaration=FormalParameterDeclaration;
        if(FormalParameterDeclaration!=null) FormalParameterDeclaration.setParent(this);
    }

    public FormalParamList getFormalParamList() {
        return FormalParamList;
    }

    public void setFormalParamList(FormalParamList FormalParamList) {
        this.FormalParamList=FormalParamList;
    }

    public FormalParameterDeclaration getFormalParameterDeclaration() {
        return FormalParameterDeclaration;
    }

    public void setFormalParameterDeclaration(FormalParameterDeclaration FormalParameterDeclaration) {
        this.FormalParameterDeclaration=FormalParameterDeclaration;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(FormalParamList!=null) FormalParamList.accept(visitor);
        if(FormalParameterDeclaration!=null) FormalParameterDeclaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FormalParamList!=null) FormalParamList.traverseTopDown(visitor);
        if(FormalParameterDeclaration!=null) FormalParameterDeclaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FormalParamList!=null) FormalParamList.traverseBottomUp(visitor);
        if(FormalParameterDeclaration!=null) FormalParameterDeclaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormalParameterList(\n");

        if(FormalParamList!=null)
            buffer.append(FormalParamList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(FormalParameterDeclaration!=null)
            buffer.append(FormalParameterDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormalParameterList]");
        return buffer.toString();
    }
}
