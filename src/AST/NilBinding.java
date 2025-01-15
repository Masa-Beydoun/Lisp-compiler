package AST;

public class NilBinding {
    Variable variable;

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return "NilBinding{" +
                "variable=" + variable +
                '}';
    }
}
