package AST;

import java.util.ArrayList;

public class Condition {
    ArrayList<Comparsion>  comparsion = new ArrayList<Comparsion>();
    ArrayList<String>  identifier = new ArrayList<String>();
    ArrayList<String>  number = new ArrayList<String>();


    public ArrayList<String> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(ArrayList<String> identifier) {
        this.identifier = identifier;
    }

    public ArrayList<Comparsion> getComparsion() {
        return comparsion;
    }

    public void setComparsion(ArrayList<Comparsion> comparsion) {
        this.comparsion = comparsion;
    }

    public ArrayList<String> getNumber() {
        return number;
    }

    public void setNumber(ArrayList<String> number) {
        this.number = number;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Condition{");
        boolean firstField = true;

        if (comparsion != null) {
            result.append("comparsion=").append(comparsion);
            firstField = false;
        }
        if (identifier != null) {
            if (!firstField) result.append(", ");
            result.append("identifier=").append(identifier);
            firstField = false;
        }
        if (number != null) {
            if (!firstField) result.append(", ");
            result.append("number=").append(number);
        }

        result.append('}');
        return result.toString();
    }

}
