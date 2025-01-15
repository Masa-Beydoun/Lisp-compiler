package AST;

public class Sqrt {
    String number;
    PossibleNumberHelper possibleNumberHelper;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PossibleNumberHelper getPossibleNumberHelper() {
        return possibleNumberHelper;
    }

    public void setPossibleNumberHelper(PossibleNumberHelper possibleNumberHelper) {
        this.possibleNumberHelper = possibleNumberHelper;
    }

    @Override
    public String toString() {
        return "Sqrt{" +
                "number='" + number + '\'' +
                ", possibleNumberHelper=" + possibleNumberHelper +
                '}';
    }
}
