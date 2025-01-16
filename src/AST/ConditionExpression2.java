package AST;

import java.util.ArrayList;

public class ConditionExpression2 {
    ArrayList<Program> programList = new ArrayList<Program>();
    ArrayList<Either> eithers = new ArrayList<>();

    public ArrayList<Program> getProgramList() {
        return programList;
    }

    public void setProgramList(ArrayList<Program> programList) {
        this.programList = programList;
    }

    public ArrayList<Either> getEithers() {
        return eithers;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ConditionExpression2{");
        boolean firstField = true;

        if (programList != null) {
            result.append("programList=").append(programList);
            firstField = false;
        }
        if (eithers != null) {
            if (!firstField) result.append(", ");
            result.append("eithers=").append(eithers);
        }

        result.append('}');
        return result.toString();
    }

    public void setEithers(ArrayList<Either> eithers) {
        this.eithers = eithers;
    }
}
