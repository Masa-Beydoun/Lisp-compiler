package AST;

public class Cos {

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
        StringBuilder result = new StringBuilder("Cos{");
        boolean firstField = true;

        if (number != null) {
            result.append("number='").append(number).append('\'');
            firstField = false;
        }
        if (possibleNumberHelper != null) {
            if (!firstField) result.append(", ");
            result.append("possibleNumberHelper=").append(possibleNumberHelper);
        }

        result.append('}');
        return result.toString();
    }


}
