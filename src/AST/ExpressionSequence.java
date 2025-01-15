package AST;

public class ExpressionSequence {
    Program program;
    MultipleExpression expression;

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public MultipleExpression getExpression() {
        return expression;
    }

    public void setExpression(MultipleExpression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ExpressionSequence{");
        boolean firstField = true;

        if (program != null) {
            result.append("program=").append(program);
            firstField = false;
        }
        if (expression != null) {
            if (!firstField) result.append(", ");
            result.append("expression=").append(expression);
        }

        result.append('}');
        return result.toString();
    }



}
