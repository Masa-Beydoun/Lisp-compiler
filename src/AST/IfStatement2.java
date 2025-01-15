package AST;

import java.util.ArrayList;

public class IfStatement2 {
    ComparisonType comparisonType;
    ArrayList<ExpressionSequence> expressionSequences = new ArrayList<>();

    @Override
    public String toString() {
        return "IfStatement2{" +
                "comparisonType=" + comparisonType +
                ", expressionSequences=" + expressionSequences +
                '}';
    }

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
}
