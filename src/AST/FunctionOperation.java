package AST;

public class FunctionOperation {

    DefiningFunction definingFunction;
    CallingFunction callingFunction;

    public CallingFunction getCallingFunction() {
        return callingFunction;
    }

    public void setCallingFunction(CallingFunction callingFunction) {
        this.callingFunction = callingFunction;
    }


    public DefiningFunction getDefiningFunction() {
        return definingFunction;
    }

    public void setDefiningFunction(DefiningFunction definingFunction) {
        this.definingFunction = definingFunction;
    }


    @Override
    public String toString() {
        return "FunctionOperation{" +
                "definingFunction=" + definingFunction +
                ", callingFinction=" + callingFunction +
                '}';
    }
}
