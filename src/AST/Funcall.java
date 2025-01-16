package AST;

import java.util.ArrayList;

public class Funcall {

    Program program;
    ArrayList<Either> either = new ArrayList<>();

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public ArrayList<Either> getEither() {
        return either;
    }

    public void setEither(ArrayList<Either> either) {
        this.either = either;
    }

    @Override
    public String toString() {
        return "Funcall{" +
                "program=" + program +
                ", either=" + either +
                '}';
    }
}
