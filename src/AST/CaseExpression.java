package AST;

import java.util.List;

public class CaseExpression {
    private List<Program> programs;
    private List<Either> eithers;

    public List<Program> getPrograms() {
        return programs;
    }

    public void setPrograms() {
        this.programs = programs;
    }

    public List<Either> getEithers() {
        return eithers;
    }

    public void setEithers(List<Either> eithers) {
        this.eithers = eithers;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("CaseExp{");
        boolean firstField = true;

        if (programs != null) {
            result.append("programs=").append(programs);
            firstField = false;
        }
        if (eithers != null) {
            if (!firstField) result.append(", ");
            result.append("eithers=").append(eithers);
        }

        result.append('}');
        return result.toString();
    }

}
