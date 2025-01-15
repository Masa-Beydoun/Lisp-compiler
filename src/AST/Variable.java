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
        return "Variable{" +
                "identifier='" + identifier + '\'' +
                ", specialVariable='" + specialVariable + '\'' +
                '}';
    }
}
