package AST;

public class Function {
    FunctionReference reference;
    Lambda lambda;
    DefiningFunction definingFunction;

    public FunctionReference getReference() {
        return reference;
    }

    public void setReference(FunctionReference reference) {
        this.reference = reference;
    }

    public Lambda getLambda() {
        return lambda;
    }

    public void setLambda(Lambda lambda) {
        this.lambda = lambda;
    }

    public DefiningFunction getDefiningFunction() {
        return definingFunction;
    }

    public void setDefiningFunction(DefiningFunction definingFunction) {
        this.definingFunction = definingFunction;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Function{");
        boolean firstField = true;

        if (reference != null) {
            result.append("reference=").append(reference);
            firstField = false;
        }
        if (lambda != null) {
            if (!firstField) result.append(", ");
            result.append("lambda=").append(lambda);
        }
        if (definingFunction != null) {
            if (!firstField) result.append(", ");
            result.append("definingFunction=").append(definingFunction);
        }

        result.append('}');
        return result.toString();
    }

}
