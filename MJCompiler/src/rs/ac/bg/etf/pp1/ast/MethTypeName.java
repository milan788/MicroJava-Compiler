// generated with ast extension for cup
// version 0.8
// 9/1/2021 23:15:28


package rs.ac.bg.etf.pp1.ast;

public class MethTypeName implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    public rs.etf.pp1.symboltable.concepts.Obj obj = null;

    private MethRetType MethRetType;
    private String name;

    public MethTypeName (MethRetType MethRetType, String name) {
        this.MethRetType=MethRetType;
        if(MethRetType!=null) MethRetType.setParent(this);
        this.name=name;
    }

    public MethRetType getMethRetType() {
        return MethRetType;
    }

    public void setMethRetType(MethRetType MethRetType) {
        this.MethRetType=MethRetType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
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
        if(MethRetType!=null) MethRetType.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethRetType!=null) MethRetType.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethRetType!=null) MethRetType.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethTypeName(\n");

        if(MethRetType!=null)
            buffer.append(MethRetType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+name);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethTypeName]");
        return buffer.toString();
    }
}
