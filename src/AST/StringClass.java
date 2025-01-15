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
}
