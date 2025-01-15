package AST;

import java.util.ArrayList;

public class IfStatement3 {
    ComparisonType2 comparisonType2;
    ArrayList<ExpressionSequence> expressionSequences = new ArrayList<>();


    public ComparisonType2 getComparisonType() {
        return comparisonType2;
    }

    public void setComparisonType(ComparisonType2 comparisonType) {
        this.comparisonType2 = comparisonType;
    }

    public ArrayList<ExpressionSequence> getExpressionSequences() {
        return expressionSequences;
    }

    public void setExpressionSequences(ArrayList<ExpressionSequence> expressionSequences) {
        this.expressionSequences = expressionSequences;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("IfStatement3{");
        boolean firstField = true;

        if (comparisonType2 != null) {
            result.append("comparisonType2=").append(comparisonType2);
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
