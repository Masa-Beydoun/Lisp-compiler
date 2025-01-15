package AST;

public class IfStatement {
    IfStatement1 ifStatement1;
    IfStatement2 ifStatement2;
    IfStatement3 ifStatement3;

    public IfStatement1 getIfStatement1() {
        return ifStatement1;
    }

    @Override
    public String toString() {
        return "IfStatement{" +
                "ifStatement1=" + ifStatement1 +
                ", ifStatement2=" + ifStatement2 +
                ", ifStatement3=" + ifStatement3 +
                '}';
    }

    public void setIfStatement1(IfStatement1 ifStatement1) {
        this.ifStatement1 = ifStatement1;
    }

    public IfStatement2 getIfStatement2() {
        return ifStatement2;
    }

    public void setIfStatement2(IfStatement2 ifStatement2) {
        this.ifStatement2 = ifStatement2;
    }

    public IfStatement3 getIfStatement3() {
        return ifStatement3;
    }

    public void setIfStatement3(IfStatement3 ifStatement3) {
        this.ifStatement3 = ifStatement3;
    }
}
