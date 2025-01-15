package AST;

import java.util.ArrayList;

public class When {
 Condition condition;
ArrayList <Program> programs = new ArrayList<>();

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public ArrayList<Program> getPrograms() {
        return programs;
    }

    public void setPrograms(ArrayList<Program> programs) {
        this.programs = programs;
    }

    @Override
    public String toString() {
        return "When{" +
                "condition=" + condition +
                ", programs=" + programs +
                '}';
    }
}
