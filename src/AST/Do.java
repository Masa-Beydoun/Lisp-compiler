package AST;

import java.util.ArrayList;

public class Do {

    ArrayList<IterationSpecs> iterationSpecs = new ArrayList<>();
    TerminationCondition terminationCondition;
    ArrayList<Program> program = new ArrayList<>();

    public ArrayList<IterationSpecs> getIterationSpecs() {
        return iterationSpecs;
    }

    public void setIterationSpecs(ArrayList<IterationSpecs> iterationSpecs) {
        this.iterationSpecs = iterationSpecs;
    }

    public TerminationCondition getTerminationCondition() {
        return terminationCondition;
    }

    public void setTerminationCondition(TerminationCondition terminationCondition) {
        this.terminationCondition = terminationCondition;
    }

    public ArrayList<Program> getProgram() {
        return program;
    }

    public void setProgram(ArrayList<Program> program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Do{" +
                "iterationSpecs=" + iterationSpecs +
                ", terminationCondition=" + terminationCondition +
                ", program=" + program +
                '}';
    }
}
