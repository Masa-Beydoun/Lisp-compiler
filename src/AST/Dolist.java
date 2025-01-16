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
        return "Dolist{" +
                "identifier='" + identifier + '\'' +
                ", singleQuote='" + singleQuote + '\'' +
                ", number='" + number + '\'' +
                ", programs=" + program +
                '}';
    }
}
