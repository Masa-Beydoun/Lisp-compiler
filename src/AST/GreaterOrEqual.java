package AST;

public class GreaterOrEqual{
    Either either1;
    Either either2;

    @Override
    public String toString() {
        return "GreaterOrEqual{" +
                "either1=" + either1 +
                ", either2=" + either2 +
                '}';
    }

    public Either getEither1() {
        return either1;
    }

    public void setEither1(Either either1) {
        this.either1 = either1;
    }

    public Either getEither2() {
        return either2;
    }

    public void setEither2(Either either2) {
        this.either2 = either2;
    }
}
