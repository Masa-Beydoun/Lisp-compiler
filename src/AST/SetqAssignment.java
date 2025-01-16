package AST;

public class SetqAssignment {
    String Identifier;
    Either either;

    public String getIdentifier() {
        return Identifier;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("SetqAssignment{");
        boolean firstField = true;

        if (Identifier != null) {
            result.append("Identifier='").append(Identifier).append('\'');
            firstField = false;
        }
        if (either != null) {
            if (!firstField) result.append(", ");
            result.append("either=").append(either);
        }

        result.append('}');
        return result.toString();
    }


    public Either getEither(Either either) {
        return this.either;
    }

    public void setEither(Either either) {
        this.either = either;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }
}
