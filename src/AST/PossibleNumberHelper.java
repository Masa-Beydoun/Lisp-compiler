package AST;

public class PossibleNumberHelper {
    String number;
    Variable variable;
    Program program;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }


    @Override
    public String toString() {
        return "PossibleNumberHelper{" +
                "number=" + number +
                ", variable=" + variable +
                ", program=" + program +
                '}';
    }
}
