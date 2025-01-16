package AST;

public class ColonPair {
    private String identifier;
    private Either either;

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
        return "(COLON identifier: " + identifier + ", either: " + either + ")";
    }

}
