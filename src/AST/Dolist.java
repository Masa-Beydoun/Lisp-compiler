package AST;

import java.util.ArrayList;

public class Dolist {
    String identifier;
    String singleQuote;
    ArrayList<Program> program = new ArrayList<>();

    public String getSingleQuote() {
        return singleQuote;
    }

    public void setSingleQuote(String singleQuote) {
        this.singleQuote = singleQuote;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ArrayList<Program> getProgram() {
        return program;
    }

    public void setProgram(ArrayList<Program> program) {
        this.program = program;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Dolist{");
        boolean firstField = true;

        if (identifier != null) {
            result.append("identifier='").append(identifier).append('\'');
            firstField = false;
        }
        if (singleQuote != null) {
            if (!firstField) result.append(", ");
            result.append("singleQuote='").append(singleQuote).append('\'');
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
