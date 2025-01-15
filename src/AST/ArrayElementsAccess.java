package AST;

public class ArrayElementsAccess {

    Multiply multiply;
    String identifier;
    Either either;

    public Multiply getMultiply() {
        return multiply;
    }

    public void setMultiply(Multiply multiply) {
        this.multiply = multiply;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Either getEither() {
        return either;
    }

    public void setEither(Either either) {
        this.either = either;
    }
}
