package AST;

import java.util.ArrayList;

public class Apply {

    Program program;
    ArrayList<Either> either = new ArrayList<>();
    ListClass list;

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

    public ListClass getList() {
        return list;
    }

    public void setList(ListClass list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Apply{" +
                "program=" + program +
                ", either=" + either +
                ", list=" + list +
                '}';
    }
}
