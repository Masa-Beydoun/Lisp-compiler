package AST;

public class ComparisonType2 {
    String Nil;
    String True;
    ConditionHelper condition;

    public String getNil() {
        return Nil;
    }

    public void setNil(String nil) {
        Nil = nil;
    }

    public String getTrue() {
        return True;
    }

    public void setTrue(String aTrue) {
        True = aTrue;
    }

    public ConditionHelper getCondition() {
        return condition;
    }

    public void setCondition(ConditionHelper condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ComparisonType2{");
        boolean firstField = true;

        if (Nil != null) {
            result.append("Nil='").append(Nil).append('\'');
            firstField = false;
        }
        if (True != null) {
            if (!firstField) result.append(", ");
            result.append("True='").append(True).append('\'');
            firstField = false;
        }
        if (condition != null) {
            if (!firstField) result.append(", ");
            result.append("condition=").append(condition);
        }

        result.append('}');
        return result.toString();
    }

}
