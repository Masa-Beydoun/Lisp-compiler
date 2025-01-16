package AST;

public class ReturnFrom {

    String identifier;
    Either either;

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
        return "ReturnFrom{" +
                "identifier='" + identifier + '\'' +
                ", either=" + either +
                '}';
    }
}
