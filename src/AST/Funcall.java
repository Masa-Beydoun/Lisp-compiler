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
        StringBuilder result = new StringBuilder("Funcall{");
        boolean firstField = true;

        if (program != null) {
            result.append("program=").append(program);
            firstField = false;
        }
        if (either != null) {
            if (!firstField) result.append(", ");
            result.append("either=").append(either);
        }

        result.append('}');
        return result.toString();
    }

}
