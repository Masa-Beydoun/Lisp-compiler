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
        StringBuilder result = new StringBuilder("Expt{");
        boolean firstField = true;

        if (number1 != null) {
            result.append("number1='").append(number1).append('\'');
            firstField = false;
        }
        if (number2 != null) {
            if (!firstField) result.append(", ");
            result.append("number2='").append(number2).append('\'');
            firstField = false;
        }
        if (possibleNumberHelper1 != null) {
            if (!firstField) result.append(", ");
            result.append("possibleNumberHelper1=").append(possibleNumberHelper1);
            firstField = false;
        }
        if (possibleNumberHelper2 != null) {
            if (!firstField) result.append(", ");
            result.append("possibleNumberHelper2=").append(possibleNumberHelper2);
        }

        result.append('}');
        return result.toString();
    }

}
