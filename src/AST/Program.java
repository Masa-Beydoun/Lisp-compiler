package AST;

public class Program extends NodeAST {
    MathOperation mathOperation;

    public MathOperation getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }


    @Override
    public String toString() {
        return "Program{" +
                "mathOperation=" + mathOperation +
                '}';
    }
}
