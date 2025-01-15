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
        return "Evenp{" +
                "number='" + number + '\'' +
                ", identifier='" + identifier + '\'' +
                '}';
    }
}
