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


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ArrayElementsAccess{");
        boolean firstField = true;

        if (multiply != null) {
            result.append("multiply=").append(multiply);
            firstField = false;
        }
        if (identifier != null) {
            if (!firstField) result.append(", ");
            result.append("identifier='").append(identifier).append('\'');
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
