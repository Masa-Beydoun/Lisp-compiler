package AST;

public class Field {
    String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "Field{" +
                "identifier='" + identifier + '\'' +
                '}';
    }
}
