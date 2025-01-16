package AST;

public class ConditionExpression {
    Program program;
    ConditionExpression2 conditionExpression2;

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public ConditionExpression2 getConditionExpression2() {
        return conditionExpression2;
    }

    public void setConditionExpression2(ConditionExpression2 conditionExpression2) {
        this.conditionExpression2 = conditionExpression2;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ConditionExpression{");
        boolean firstField = true;

        if (program != null) {
            result.append("program=").append(program);
            firstField = false;
        }
        if (conditionExpression2 != null) {
            if (!firstField) result.append(", ");
            result.append("conditionExpression2=").append(conditionExpression2);
        }

        result.append('}');
        return result.toString();
    }

}