package AST;

public class Variable {

    String identifier;
    String specialVariable;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getSpecialVariable() {
        return specialVariable;
    }

    public void setSpecialVariable(String specialVariable) {
        this.specialVariable = specialVariable;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Variable{");
        boolean firstField = true;

        if (identifier != null) {
            result.append("identifier='").append(identifier).append('\'');
            firstField = false;
        }
        if (specialVariable != null) {
            if (!firstField) result.append(", ");
            result.append("specialVariable='").append(specialVariable).append('\'');
        }

        result.append('}');
        return result.toString();
    }

}
