package AST;

public class Evenp {
    String number;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    String identifier;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Evenp{");
        boolean firstField = true;

        if (number != null) {
            result.append("number='").append(number).append('\'');
            firstField = false;
        }
        if (identifier != null) {
            if (!firstField) result.append(", ");
            result.append("identifier='").append(identifier).append('\'');
        }

        result.append('}');
        return result.toString();
    }

}
