package AST;

public class ComparisonFunction {

    ComparisonOperator comparison_operator;

    public ComparisonOperator getComparison_operator() {
        return comparison_operator;
    }

    @Override
    public String toString() {
        return "ComparisonFunction{" +
                "comparison_operator=" + comparison_operator +
                '}';
    }

    public void setComparison_operator(ComparisonOperator comparison_operator) {
        this.comparison_operator = comparison_operator;
    }
}
