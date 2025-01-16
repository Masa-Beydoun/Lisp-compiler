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
        return "IterationSpecs{" +
                "identifier='" + identifier + '\'' +
                ", number=" + number +
                ", program=" + program +
                '}';
    }
}
