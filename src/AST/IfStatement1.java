package AST;

public class IfStatement1 {
    ConditionHelper condition1;
    ConditionHelper condition2;
    ConditionHelper condition3;

    public ConditionHelper getCondition1() {
        return condition1;
    }


    public void setCondition1(ConditionHelper condition1) {
        this.condition1 = condition1;
    }

    public ConditionHelper getCondition2() {
        return condition2;
    }

    public void setCondition2(ConditionHelper condition2) {
        this.condition2 = condition2;
    }

    public ConditionHelper getCondition3() {
        return condition3;
    }

    public void setCondition3(ConditionHelper condition3) {
        this.condition3 = condition3;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("IfStatement1{");
        boolean firstField = true;

        if (condition1 != null) {
            result.append("condition1=").append(condition1);
            firstField = false;
        }
        if (condition2 != null) {
            if (!firstField) result.append(", ");
            result.append("condition2=").append(condition2);
            firstField = false;
        }
        if (condition3 != null) {
            if (!firstField) result.append(", ");
            result.append("condition3=").append(condition3);
        }

        result.append('}');
        return result.toString();
    }


}
