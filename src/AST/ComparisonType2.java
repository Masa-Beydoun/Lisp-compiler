package AST;

public class ComparisonType2 {
    String Nil;
    String True;
    ConditionHelper condition;

    public String getNil() {
        return Nil;
    }

    @Override
    public String toString() {
        return "ComparisonType2{" +
                "Nil='" + Nil + '\'' +
                ", True='" + True + '\'' +
                ", condition=" + condition +
                '}';
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
}
