package AST;

public class TerminationCondition {

    Condition condition;
    String identifier;

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "TerminationCondition{" +
                "condition=" + condition +
                ", identifier='" + identifier + '\'' +
                '}';
    }
}
