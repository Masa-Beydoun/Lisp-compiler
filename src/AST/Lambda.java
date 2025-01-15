package AST;

import java.util.ArrayList;

public class Lambda {
    ArrayList<String> identifier = new ArrayList<>();
    ArrayList<Program> programs = new ArrayList<>();

    public ArrayList<String> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(ArrayList<String> identifier) {
        this.identifier = identifier;
    }

    public ArrayList<Program> getPrograms() {
        return programs;
    }

    public void setPrograms(ArrayList<Program> programs) {
        this.programs = programs;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Lambda{");
        boolean firstField = true;

        if (identifier != null) {
            result.append("identifier=").append(identifier);
            firstField = false;
        }
        if (programs != null) {
            if (!firstField) result.append(", ");
            result.append("programs=").append(programs);
        }

        result.append('}');
        return result.toString();
    }

}
