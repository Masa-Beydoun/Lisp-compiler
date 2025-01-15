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
        return "ValueHelper{" +
                "number='" + number + '\'' +
                ", string='" + string + '\'' +
                ", program=" + program +
                '}';
    }
}
