package AST;

public class AtomHelper {
    PossibleNumberHelper possibleNumberHelper ;
    String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    public PossibleNumberHelper getPossibleNumberHelper() {
        return possibleNumberHelper;
    }

    public void setPossibleNumberHelper(PossibleNumberHelper possibleNumberHelper) {
        this.possibleNumberHelper = possibleNumberHelper;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("AtomHelper{");
        boolean firstField = true;

        if (possibleNumberHelper != null) {
            result.append("possibleNumberHelper=").append(possibleNumberHelper);
            firstField = false;
        }
        if (string != null) {
            if (!firstField) result.append(", ");
            result.append("string='").append(string).append('\'');
        }

        result.append('}');
        return result.toString();
    }

}