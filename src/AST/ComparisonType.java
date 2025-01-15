package AST;

public class ComparisonType {
    Condition condition;

    public Condition getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "ComparisonType{" +
                "condition=" + condition +
                '}';
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}
