package AST;

public class IfStatement {
    IfStatement1 ifStatement1;
    IfStatement2 ifStatement2;
    IfStatement3 ifStatement3;

    public IfStatement1 getIfStatement1() {
        return ifStatement1;
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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("IfStatement{");
        boolean firstField = true;

        if (ifStatement1 != null) {
            result.append("ifStatement1=").append(ifStatement1);
            firstField = false;
        }
        if (ifStatement2 != null) {
            if (!firstField) result.append(", ");
            result.append("ifStatement2=").append(ifStatement2);
            firstField = false;
        }
        if (ifStatement3 != null) {
            if (!firstField) result.append(", ");
            result.append("ifStatement3=").append(ifStatement3);
        }

        result.append('}');
        return result.toString();
    }

}
