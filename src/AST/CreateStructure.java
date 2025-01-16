package AST;

import java.util.ArrayList;

public class CreateStructure {
String Identifier;
ArrayList<String> Identifiers = new ArrayList<>();

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("CreateStructure{");
        boolean firstField = true;

        if (Identifier != null) {
            result.append("Identifier='").append(Identifier).append('\'');
            firstField = false;
        }
        if (Identifiers != null) {
            if (!firstField) result.append(", ");
            result.append("Identifiers=").append(Identifiers);
        }

        result.append('}');
        return result.toString();
    }


    public ArrayList<String> getIdentifiers() {
        return Identifiers;
    }

    public void setIdentifiers(ArrayList<String> identifiers) {
        Identifiers = identifiers;
    }
}
