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
        StringBuilder result = new StringBuilder("Binding{");
        boolean firstField = true;

        if (variable != null) {
            result.append("variable=").append(variable);
            firstField = false;
        }
        if (valueHelper != null) {
            if (!firstField) result.append(", ");
            result.append("valueHelper=").append(valueHelper);
        }

        result.append('}');
        return result.toString();
    }

}
