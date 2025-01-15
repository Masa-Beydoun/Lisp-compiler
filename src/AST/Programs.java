package AST;

import java.util.ArrayList;

public class Programs extends NodeAST {

    ArrayList<Program> programs;

    public Programs() {
        programs = new ArrayList<>();
    }

    public void addProgram(Program program) {
        programs.add(program);
    }

    public ArrayList<Program> getPrograms() {
        return programs;
    }

    public void setPrograms(ArrayList<Program> programs) {
        this.programs = programs;
    }

    @Override
    public String toString() {
        return "Programs{" +
                "programs=" + programs +
                '}';
    }
}
