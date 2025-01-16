package AST;

import java.util.ArrayList;

public class Dolist {
    String identifier;
    String singleQuote;
    String identifier2;
    ListClass listClass;
    ArrayList<Program> program = new ArrayList<>();


    public String getIdentifier2() {
        return identifier2;
    }

    public void setIdentifier2(String identifier2) {
        this.identifier2 = identifier2;
    }

    public ListClass getListClass() {
        return listClass;
    }

    public void setListClass(ListClass listClass) {
        this.listClass = listClass;
    }

    public String getSingleQuote() {
        return singleQuote;
    }

    public void setSingleQuote(String singleQuote) {
        this.singleQuote = singleQuote;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ArrayList<Program> getProgram() {
        return program;
    }

    public void setProgram(ArrayList<Program> program) {
        this.program = program;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Dolist{");
        boolean firstField = true;

        if (identifier != null) {
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
            firstField = false;

        }
        if(identifier2 != null) {
            if (!firstField) result.append(", ");
            result.append("identifier2='").append(identifier2).append('\'');
            firstField = false;
        }
        if(listClass != null) {
            if (!firstField) result.append(", ");
            result.append("listClass=").append(listClass);
            firstField = false;
        }

        result.append('}');
        return result.toString();
    }

}
