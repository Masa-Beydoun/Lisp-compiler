package AST;

import java.util.ArrayList;

public class IfStatement3 {
    ComparisonType2 comparisonType2;
    ArrayList<ExpressionSequence> expressionSequences = new ArrayList<>();

    @Override
    public String toString() {
        return "IfStatement2{" +
                "comparisonType=" + comparisonType2 +
                ", expressionSequences=" + expressionSequences +
                '}';
    }

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
}
