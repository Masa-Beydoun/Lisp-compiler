package AST;

public class IfStatement1 {
  ConditionHelper condition1;
  ConditionHelper condition2;
  ConditionHelper condition3;

  public ConditionHelper getCondition1() {
    return condition1;
  }

  @Override
  public String toString() {
    return "IfStatement1{" +
            "condition1=" + condition1 +
            ", condition2=" + condition2 +
            ", condition3=" + condition3 +
            '}';
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
}
