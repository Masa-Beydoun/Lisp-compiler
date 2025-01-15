package AST;

import java.util.ArrayList;

public class Div {
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
        StringBuilder result = new StringBuilder("Div{");
        boolean firstField = true;

        if (parameters != null) {
            result.append("parameters=").append(parameters);
            firstField = false;
        }
        if (possibleNumbers != null) {
            if (!firstField) result.append(", ");
            result.append("possibleNumbers=").append(possibleNumbers);
        }

        result.append('}');
        return result.toString();
    }

}
