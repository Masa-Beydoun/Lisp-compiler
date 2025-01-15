package AST;

public class Expt {
    String number1;
    String number2;
    PossibleNumberHelper possibleNumberHelper1;
    PossibleNumberHelper possibleNumberHelper2;


    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public PossibleNumberHelper getPossibleNumberHelper1() {
        return possibleNumberHelper1;
    }

    public void setPossibleNumberHelper1(PossibleNumberHelper possibleNumberHelper1) {
        this.possibleNumberHelper1 = possibleNumberHelper1;
    }

    public PossibleNumberHelper getPossibleNumberHelper2() {
        return possibleNumberHelper2;
    }

    public void setPossibleNumberHelper2(PossibleNumberHelper possibleNumberHelper2) {
        this.possibleNumberHelper2 = possibleNumberHelper2;
    }

    @Override
    public String toString() {
        return "Expt{" +
                "number1='" + number1 + '\'' +
                ", number2='" + number2 + '\'' +
                ", possibleNumberHelper1=" + possibleNumberHelper1 +
                ", possibleNumberHelper2=" + possibleNumberHelper2 +
                '}';
    }
}
