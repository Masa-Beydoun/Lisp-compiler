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
        return "Defvar{" +
                "name='" + name + '\'' +
                ", possibleNumberHelper=" + possibleNumberHelper +
                '}';
    }
}
