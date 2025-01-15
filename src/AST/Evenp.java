package AST;

public class Evenp {
    String number;
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
