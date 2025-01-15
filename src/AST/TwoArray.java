package AST;

public class TwoArray {
    String number;
    String number2;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("TwoArray{");
        boolean firstField = true;

        if (number != null) {
            result.append("number='").append(number).append('\'');
            firstField = false;
        }
        if (number2 != null) {
            if (!firstField) result.append(", ");
            result.append("number2='").append(number2).append('\'');
        }

        result.append('}');
        return result.toString();
    }

}
