package AST;

public class ExpressionSequence {
    Program program;
    MultipleExpression expression;

    public Program getProgram() {
        return program;
    }

    @Override
    public String toString() {
        return "ExpressionSequence{" +
                "program=" + program +
                ", expression=" + expression +
                '}';
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
}
