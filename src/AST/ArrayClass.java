package AST;

public class ArrayClass {

    ArrayDefinition arrayDefinition;
    ArrayElementsAccess arrayElementsAccess;
    ArrayElementOperation arrayElementOperation;

    public ArrayDefinition getArrayDefinition() {
        return arrayDefinition;
    }

    public void setArrayDefinition(ArrayDefinition arrayDefinition) {
        this.arrayDefinition = arrayDefinition;
    }

    public ArrayElementsAccess getArrayElenmentsAccess() {
        return arrayElementsAccess;
    }

    public void setArrayElenmentsAccess(ArrayElementsAccess arrayElementsAccess) {
        this.arrayElementsAccess = arrayElementsAccess;
    }

    public ArrayElementOperation getArrayElementOperation() {
        return arrayElementOperation;
    }

    public void setArrayElementOperation(ArrayElementOperation arrayElementOperation) {
        this.arrayElementOperation = arrayElementOperation;
    }
}
