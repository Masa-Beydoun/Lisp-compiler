package AST;

import java.util.ArrayList;

public class Minus {
    ArrayList<String> parameters;
    ArrayList<PossibleNumberHelper> possibleNumbers;


    public ArrayList<String> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<String> parameters) {
        this.parameters = parameters;
    }

    public ArrayList<PossibleNumberHelper> getPossibleNumbers() {
        return possibleNumbers;
    }

    public void setPossibleNumbers(ArrayList<PossibleNumberHelper> possibleNumbers) {
        this.possibleNumbers = possibleNumbers;
    }

    @Override
    public String toString() {
        return "Minus{" +
                "parameters=" + parameters +
                ", possibleNumbers=" + possibleNumbers +
                '}';
    }
}
