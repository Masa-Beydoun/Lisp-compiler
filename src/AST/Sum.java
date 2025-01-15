package AST;

import java.util.ArrayList;

public class Sum {


    String number1;
    ArrayList<String> number2 = new ArrayList<>();
    PossibleNumberHelper possibleNumberHelper;
    ArrayList<PossibleNumberHelper> possibleNumbers2 = new ArrayList<>();


    public ArrayList<PossibleNumberHelper> getPossibleNumbers2() {
        return possibleNumbers2;
    }

    public void setPossibleNumbers2(ArrayList<PossibleNumberHelper> possibleNumbers2) {
        this.possibleNumbers2 = possibleNumbers2;
    }

    public PossibleNumberHelper getPossibleNumberHelper() {
        return possibleNumberHelper;
    }

    public void setPossibleNumberHelper(PossibleNumberHelper possibleNumberHelper) {
        this.possibleNumberHelper = possibleNumberHelper;
    }
    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public ArrayList<String> getNumber2() {
        return number2;
    }

    public void setNumber2(ArrayList<String> number2) {
        this.number2 = number2;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Sum{");
        boolean firstField = true;

        if (number1 != null) {
            result.append("number1='").append(number1).append('\'');
            firstField = false;
        }
        if (number2 != null) {
            if (!firstField) result.append(", ");
            result.append("number2=").append(number2);
            firstField = false;
        }
        if (possibleNumberHelper != null) {
            if (!firstField) result.append(", ");
            result.append("possibleNumberHelper=").append(possibleNumberHelper);
            firstField = false;
        }
        if (possibleNumbers2 != null) {
            if (!firstField) result.append(", ");
            result.append("possibleNumbers2=").append(possibleNumbers2);
        }

        result.append('}');
        return result.toString();
    }

}
