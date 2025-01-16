package AST;

import java.util.ArrayList;

public class Dotimes {
    String identifier;
    String number;
    ArrayList<Program> program = new ArrayList<>();

    public ArrayList<Program> getProgram() {
        return program;
    }

    public void setProgram(ArrayList<Program> program) {
        this.program = program;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Dotimes{");
        boolean firstField = true;

        if (number != null) {
            result.append("number='").append(number).append('\'');
            firstField = false;
        }
        if (identifier != null) {
            if (!firstField) result.append(", ");
            result.append("identifier='").append(identifier).append('\'');
            firstField = false;
        }
        if (program != null) {
            if (!firstField) result.append(", ");
            result.append("programs=").append(program);
        }

        result.append('}');
        return result.toString();
    }

}
