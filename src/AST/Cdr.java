package AST;

public class Cdr {
    PossibleNumberHelper possibleNumberHelper;

    public PossibleNumberHelper getPossibleNumberHelper() {
        return possibleNumberHelper;
    }

    public void setPossibleNumberHelper(PossibleNumberHelper possibleNumberHelper) {
        this.possibleNumberHelper = possibleNumberHelper;
    }

    @Override
    public String toString() {
        return "Cdr{" +
                "possibleNumberHelper=" + possibleNumberHelper +
                '}';
    }
}
