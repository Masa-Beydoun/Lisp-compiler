package AST;

import java.util.ArrayList;

public class CreateAnInstance2 {
    private String identifier;
    private ArrayList<ColonPair> colonPairs;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ArrayList<ColonPair> getColonPairs() {
        return colonPairs;
    }

    public void setColonPairs(ArrayList<ColonPair> colonPairs) {
        this.colonPairs = colonPairs;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("CreateAnInstance2{");
        boolean firstField = true;

        if (identifier != null) {
            result.append("identifier='").append(identifier).append('\'');
            firstField = false;
        }
        if (colonPairs != null) {
            if (!firstField) result.append(", ");
            result.append("colonPairs=").append(colonPairs);
        }

        result.append('}');
        return result.toString();
    }

}
