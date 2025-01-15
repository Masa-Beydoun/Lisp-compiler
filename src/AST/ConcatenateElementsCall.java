package AST;

public class ConcatenateElementsCall {
    ElementAccess elementAccess;
    String string;
    Either either;

    public ElementAccess getElementAccess() {
        return elementAccess;
    }

    public void setElementAccess(ElementAccess elementAccess) {
        this.elementAccess = elementAccess;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Either getEither() {
        return either;
    }

    public void setEither(Either either) {
        this.either = either;
    }
}
