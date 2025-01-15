package AST;

public class ConcatenateDefinition {

    ConcatenateType concatenateType;

    public ConcatenateType getConcatenateType() {
        return concatenateType;
    }

    public void setConcatenateType(ConcatenateType concatenateType) {
        this.concatenateType = concatenateType;
    }


    @Override
    public String toString() {
        return "ConcatenateDefinition{" +
                "concatenateType=" + concatenateType +
                '}';
    }
}
