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
        return "ConditionHelper{" +
                "t='" + t + '\'' +
                ", Nil='" + Nil + '\'' +
                ", possibleNumberHelper=" + possibleNumberHelper +
                '}';
    }
}
