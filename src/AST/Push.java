package AST;

public class Push {
    AtomHelper atomHelper;
    Variable variable;

    public AtomHelper getAtomHelper() {
        return atomHelper;
    }

    public void setAtomHelper(AtomHelper atomHelper) {
        this.atomHelper = atomHelper;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Push{");
        boolean firstField = true;

        if (atomHelper != null) {
            result.append("atomHelper=").append(atomHelper);
            firstField = false;
        }
        if (variable != null) {
            if (!firstField) result.append(", ");
            result.append("variable=").append(variable);
        }

        result.append('}');
        return result.toString();
    }

}
