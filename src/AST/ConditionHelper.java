package AST;

public class ConditionHelper {
    String t;
    String Nil;
    PossibleNumberHelper possibleNumberHelper;

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getNil() {
        return Nil;
    }

    public void setNil(String nil) {
        Nil = nil;
    }

    public PossibleNumberHelper getPossibleNumberHelper() {
        return possibleNumberHelper;
    }

    public void setPossibleNumberHelper(PossibleNumberHelper possibleNumberHelper) {
        this.possibleNumberHelper = possibleNumberHelper;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ConditionHelper{");
        boolean firstField = true;

        if (t != null) {
            result.append("t='").append(t).append('\'');
            firstField = false;
        }
        if (Nil != null) {
            if (!firstField) result.append(", ");
            result.append("Nil='").append(Nil).append('\'');
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
