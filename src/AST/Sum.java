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
        return "Sum{" +
                "number1='" + number1 + '\'' +
                ", number2=" + number2 +
                ", possibleNumberHelper=" + possibleNumberHelper +
                ", possibleNumbers2=" + possibleNumbers2 +
                '}';
    }
}
