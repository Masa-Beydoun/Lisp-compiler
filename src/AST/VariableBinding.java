package AST;

public class VariableBinding {
    Variable variable1;
    Variable variable2;

    public Variable getVariable1() {
        return variable1;
    }

    public void setVariable1(Variable variable1) {
        this.variable1 = variable1;
    }

    public Variable getVariable2() {
        return variable2;
    }

    public void setVariable2(Variable variable2) {
        this.variable2 = variable2;
    }

    @Override
    public String toString() {
        return "VariableBinding{" +
                "variable1=" + variable1 +
                ", variable2=" + variable2 +
                '}';
    }
}
