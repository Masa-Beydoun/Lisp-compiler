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
        StringBuilder result = new StringBuilder("Eather{");
        boolean firstField = true;

        if (number != null) {
            result.append("number='").append(number).append('\'');
            firstField = false;
        }
        if (identifier != null) {
            if (!firstField) result.append(", ");
            result.append("identifier='").append(identifier).append('\'');
            firstField = false;
        }
        if (singleQuote != null) {
            if (!firstField) result.append(", ");
            result.append("singleQuote='").append(singleQuote).append('\'');
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
