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
        StringBuilder result = new StringBuilder("Mapcar{");
        boolean firstField = true;

        if (program != null) {
            result.append("program=").append(program);
            firstField = false;
        }
        if (list != null) {
            if (!firstField) result.append(", ");
            result.append("list=").append(list);
        }

        result.append('}');
        return result.toString();
    }

}
