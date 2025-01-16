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
        return "Dotimes{" +
                "number='" + number + '\'' +
                ", identifier='" + identifier + '\'' +
                ", programs=" + program +
                '}';
    }
}
