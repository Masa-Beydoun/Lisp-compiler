package AST;

public class Program extends NodeAST {
    MathOperation mathOperation;
    Setq setQ;
    Let let;
    LetStar letStar;
    ListOperation listOperation;
    FunctionOperation functionOperation;

    public FunctionOperation getFunctionOpration() {
        return functionOperation;
    }

    public void setFunctionOpration(FunctionOperation functionOperation) {
        this.functionOperation = functionOperation;
    }

    public ListOperation getListOperation() {
        return listOperation;
    }

    public void setListOperation(ListOperation listOperation) {
        this.listOperation = listOperation;
    }

    public Let getLet() {
        return let;
    }

    public void setLet(Let let) {
        this.let = let;
    }

    public LetStar getLetStar() {
        return letStar;
    }

    public void setLetStar(LetStar letStar) {
        this.letStar = letStar;
    }

    public Setq getSetQ() {
        return setQ;
    }

    public void setSetQ(Setq setQ) {
        this.setQ = setQ;
    }

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
