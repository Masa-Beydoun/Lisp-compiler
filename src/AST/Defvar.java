package AST;

public class Defvar {

    String name;
    PossibleNumberHelper possibleNumberHelper;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PossibleNumberHelper getPossibleNumberHelper() {
        return possibleNumberHelper;
    }

    public void setPossibleNumberHelper(PossibleNumberHelper possibleNumberHelper) {
        this.possibleNumberHelper = possibleNumberHelper;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Defvar{");
        boolean firstField = true;

        if (name != null) {
            result.append("name='").append(name).append('\'');
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
