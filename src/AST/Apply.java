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
        StringBuilder result = new StringBuilder("Apply{");
        boolean firstField = true;

        if (program != null) {
            result.append("program=").append(program);
            firstField = false;
        }
        if (either != null) {
            if (!firstField) result.append(", ");
            result.append("either=").append(either);
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
