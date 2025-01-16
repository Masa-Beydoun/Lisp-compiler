package AST;

import java.util.ArrayList;

public class IterationSpecs {

    String identifier;
    String number;
    ArrayList<Program> program = new ArrayList<>();

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ArrayList<Program> getProgram() {
        return program;
    }

    public void setProgram(ArrayList<Program> program) {
        this.program = program;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("IterationSpecs{");
        boolean firstField = true;

        if (identifier != null) {
            result.append("identifier='").append(identifier).append('\'');
            firstField = false;
        }
        if (number != null) {
            if (!firstField) result.append(", ");
            result.append("number=").append(number);
            firstField = false;
        }
        if (program != null) {
            if (!firstField) result.append(", ");
            result.append("program=").append(program);
        }

        result.append('}');
        return result.toString();
    }

}
