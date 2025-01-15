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
        StringBuilder result = new StringBuilder("FunctionOperation{");
        boolean firstField = true;

        if (definingFunction != null) {
            result.append("definingFunction=").append(definingFunction);
            firstField = false;
        }
        if (callingFunction != null) {
            if (!firstField) result.append(", ");
            result.append("callingFunction=").append(callingFunction);
        }

        result.append('}');
        return result.toString();
    }

}
