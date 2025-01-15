package AST;

public class ArrayElementOperation {

    OperationType operationType;
    ArrayElementsAccess arrayElementsAccess;

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public ArrayElementsAccess getArrayElementsAccess() {
        return arrayElementsAccess;
    }

    public void setArrayElementsAccess(ArrayElementsAccess arrayElementsAccess) {
        this.arrayElementsAccess = arrayElementsAccess;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ArrayElementOperation{");
        boolean firstField = true;

        if (operationType != null) {
            result.append("operationType=").append(operationType);
            firstField = false;
        }
        if (arrayElementsAccess != null) {
            if (!firstField) result.append(", ");
            result.append("arrayElementsAccess=").append(arrayElementsAccess);
        }

        result.append('}');
        return result.toString();
    }


}
