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
        StringBuilder result = new StringBuilder("PossibleNumberHelper{");
        boolean firstField = true;

        if (number != null) {
            result.append("number=").append(number);
            firstField = false;
        }
        if (variable != null) {
            if (!firstField) result.append(", ");
            result.append("variable=").append(variable);
            firstField = false;
        }
        if (program != null) {
            if (!firstField) result.append(", ");
            result.append("program=").append(program);
        }

        result.append('}');
        return result.toString();
    }

}
