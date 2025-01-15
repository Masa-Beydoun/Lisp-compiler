package AST;

public class StringClass {

    ConcatenateDefinition concatenateDefinition;
    ConcatenateElementsCall concatenateElementsCall;

    public ConcatenateDefinition getConcatenateDefinition() {
        return concatenateDefinition;
    }

    public void setConcatenateDefinition(ConcatenateDefinition concatenateDefinition) {
        this.concatenateDefinition = concatenateDefinition;
    }

    public ConcatenateElementsCall getConcatenateElementsCall() {
        return concatenateElementsCall;
    }

    public void setConcatenateElementsCall(ConcatenateElementsCall concatenateElementsCall) {
        this.concatenateElementsCall = concatenateElementsCall;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("StringClass{");
        boolean firstField = true;

        if (concatenateDefinition != null) {
            result.append("concatenateDefinition=").append(concatenateDefinition);
            firstField = false;
        }
        if (concatenateElementsCall != null) {
            if (!firstField) result.append(", ");
            result.append("concatenateElementsCall=").append(concatenateElementsCall);
        }

        result.append('}');
        return result.toString();
    }

}
