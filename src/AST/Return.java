package AST;

public class Return {

    Either either;

    public Either getEither() {
        return either;
    }

    public void setEither(Either either) {
        this.either = either;
    }

    @Override
    public String toString() {
        return "Return{" +
                "either=" + either +
                '}';
    }
}
