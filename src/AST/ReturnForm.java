package AST;

public class ReturnForm {
    Either either;
    String IDENTIFIER;

    public Either getEither() {
        return either;
    }

    public void setEither(Either either) {
        this.either = either;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ReturnForm{");
        boolean firstField = true;

        if (either != null) {
            result.append("either=").append(either);
            firstField = false;
        }
        if (IDENTIFIER != null) {
            if (!firstField) result.append(", ");
            result.append("IDENTIFIER='").append(IDENTIFIER).append('\'');
        }

        result.append('}');
        return result.toString();
    }

}
