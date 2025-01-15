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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ConcatenateElementsCall{");
        boolean firstField = true;

        if (elementAccess != null) {
            result.append("elementAccess=").append(elementAccess);
            firstField = false;
        }
        if (string != null) {
            if (!firstField) result.append(", ");
            result.append("string='").append(string).append('\'');
            firstField = false;
        }
        if (either != null) {
            if (!firstField) result.append(", ");
            result.append("either=").append(either);
        }

        result.append('}');
        return result.toString();
    }

}
