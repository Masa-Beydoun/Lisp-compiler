package AST;

public class Binding {
    Variable variable;
    ValueHelper valueHelper;

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public ValueHelper getValueHelper() {
        return valueHelper;
    }

    public void setValueHelper(ValueHelper valueHelper) {
        this.valueHelper = valueHelper;
    }

    @Override
    public String toString() {
        return "Binding{" +
                "variable=" + variable +
                ", valueHelper=" + valueHelper +
                '}';
    }
}
