package AST;

public class ComparisonType {
    Condition condition;

    public Condition getCondition() {
        return condition;
    }
    public void setCondition(Condition condition) {
        this.condition = condition;
    }


    @Override
    public String toString() {
        return "ComparisonType{" +
                "condition=" + condition +
                '}';
    }
}
