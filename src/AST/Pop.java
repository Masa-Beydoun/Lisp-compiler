package AST;

public class Pop {
    Variable variable;

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return "Pop{" +
                "variable=" + variable +
                '}';
    }
}
