package AST;

import java.util.ArrayList;

public class Cond {
    ArrayList<ConditionExpression> conditionExpressions = new ArrayList<>();
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Cond{");
        boolean firstField = true;

        if (conditionExpressions != null) {
            result.append("conditionExpressions=").append(conditionExpressions);
        }

        result.append('}');
        return result.toString();
    }


    public ArrayList<ConditionExpression> getConditionExpressions() {
        return conditionExpressions;
    }

    public void setConditionExpressions(ArrayList<ConditionExpression> conditionExpressions) {
        this.conditionExpressions = conditionExpressions;
    }
}
