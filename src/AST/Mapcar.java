package AST;

public class Mapcar {

    Program program;
    ListClass list;

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public ListClass getList() {
        return list;
    }

    public void setList(ListClass list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Mapcar{" +
                "program=" + program +
                ", list=" + list +
                '}';
    }
}
