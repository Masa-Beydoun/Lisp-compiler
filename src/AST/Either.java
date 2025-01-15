package AST;

public class Either {
String number;
String identifier;
String singleQuote;
        Program program;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getSingleQuote() {
        return singleQuote;
    }

    public void setSingleQuote(String singleQuote) {
        this.singleQuote = singleQuote;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Eather{" +
                "number='" + number + '\'' +
                ", identifier='" + identifier + '\'' +
                ", singleQuote='" + singleQuote + '\'' +
                ", program=" + program +
                '}';
    }
}
