package AST;

import java.util.ArrayList;

public class IfStatement2 {
    ComparisonType comparisonType;
    ArrayList<ExpressionSequence> expressionSequences = new ArrayList<>();


    public ComparisonType getComparisonType() {
        return comparisonType;
    }

    public void setComparisonType(ComparisonType comparisonType) {
        this.comparisonType = comparisonType;
    }

    public ArrayList<ExpressionSequence> getExpressionSequences() {
        return expressionSequences;
    }

    public void setExpressionSequences(ArrayList<ExpressionSequence> expressionSequences) {
        this.expressionSequences = expressionSequences;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("IfStatement2{");
        boolean firstField = true;

        if (comparisonType != null) {
            result.append("comparisonType=").append(comparisonType);
            firstField = false;
        }
        if (expressionSequences != null) {
            if (!firstField) result.append(", ");
            result.append("expressionSequences=").append(expressionSequences);
        }

        result.append('}');
        return result.toString();
    }

}
