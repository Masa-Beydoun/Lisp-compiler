package AST;

import java.util.ArrayList;

public class Loop {

    ArrayList<Program> program = new ArrayList<>();

    public ArrayList<Program> getProgram() {
        return program;
    }

    public void setProgram(ArrayList<Program> program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Loop{" +
                "program=" + program +
                '}';
    }
}
