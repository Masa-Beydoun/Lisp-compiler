package AST;

import java.util.ArrayList;

public class MultipleExpression {
    ArrayList<Program> program = new ArrayList<>();

    public ArrayList<Program> getProgram() {
        return program;
    }

    @Override
    public String toString() {
        return "MultipleExpression{" +
                "program=" + program +
                '}';
    }

    public void setProgram(ArrayList<Program> program) {
        this.program = program;
    }
}
