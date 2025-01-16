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
        StringBuilder result = new StringBuilder("Loop{");

        if (program != null) {
            result.append("program=").append(program);
        }

        result.append('}');
        return result.toString();
    }

}
