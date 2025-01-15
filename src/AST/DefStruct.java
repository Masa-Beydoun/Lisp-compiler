package AST;

import java.util.ArrayList;

public class DefStruct {
    String identifier;
    ArrayList<Field> fields = new ArrayList<>();

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ArrayList<Field> getFields() {
        return fields;
    }

    public void setFields(ArrayList<Field> fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("DefStruct{");
        boolean firstField = true;

        if (identifier != null) {
            result.append("identifier='").append(identifier).append('\'');
            firstField = false;
        }
        if (fields != null) {
            if (!firstField) result.append(", ");
            result.append("fields=").append(fields);
        }

        result.append('}');
        return result.toString();
    }

}
