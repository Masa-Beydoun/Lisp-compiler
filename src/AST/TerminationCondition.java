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
        StringBuilder result = new StringBuilder("TerminationCondition{");
        boolean firstField = true;

        if (condition != null) {
            result.append("condition=").append(condition);
            firstField = false;
        }
        if (identifier != null) {
            if (!firstField) result.append(", ");
            result.append("identifier='").append(identifier).append('\'');
        }

        result.append('}');
        return result.toString();
    }

}
