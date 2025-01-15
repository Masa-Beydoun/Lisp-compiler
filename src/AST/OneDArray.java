package AST;

public class OneDArray {
    Either either;

    public Either getEither() {
        return either;
    }

    public void setEither(Either either) {
        this.either = either;
    }

    @Override
    public String toString() {
        return "OneDArray{" +
                "either=" + either +
                '}';
    }
}
