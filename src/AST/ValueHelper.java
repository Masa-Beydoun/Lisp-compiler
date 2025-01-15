package AST;

public class ValueHelper {
    String number;
    String string;
    Program program;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ValueHelper{");
        boolean firstField = true;

        if (number != null) {
            result.append("number='").append(number).append('\'');
            firstField = false;
        }
        if (string != null) {
            if (!firstField) result.append(", ");
            result.append("string='").append(string).append('\'');
        }
        if (program != null) {
            if (!firstField) result.append(", ");
            result.append("program=").append(program);
        }

        result.append('}');
        return result.toString();
    }

}
