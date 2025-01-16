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
        StringBuilder result = new StringBuilder("VariableBinding{");
        boolean firstField = true;

        if (variable1 != null) {
            result.append("variable1=").append(variable1);
            firstField = false;
        }
        if (variable2 != null) {
            if (!firstField) result.append(", ");
            result.append("variable2=").append(variable2);
        }

        result.append("\n");
        return result.toString();
    }

}
