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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ArrayClass{");
        boolean firstField = true;

        if (arrayDefinition != null) {
            result.append("arrayDefinition=").append(arrayDefinition);
            firstField = false;
        }
        if (arrayElementsAccess != null) {
            if (!firstField) result.append(", ");
            result.append("arrayElementsAccess=").append(arrayElementsAccess);
            firstField = false;
        }
        if (arrayElementOperation != null) {
            if (!firstField) result.append(", ");
            result.append("arrayElementOperation=").append(arrayElementOperation);
        }

        result.append('}');
        return result.toString();
    }

}
