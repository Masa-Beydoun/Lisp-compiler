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
}
