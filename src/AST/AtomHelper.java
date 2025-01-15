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

    @Override
    public String toString() {
        return "AtomHelper{" +
                "possibleNumberHelper=" + possibleNumberHelper +
                ", string='" + string + '\'' +
                '}';
    }

    public PossibleNumberHelper getPossibleNumberHelper() {
        return possibleNumberHelper;
    }

    public void setPossibleNumberHelper(PossibleNumberHelper possibleNumberHelper) {
        this.possibleNumberHelper = possibleNumberHelper;
    }
}