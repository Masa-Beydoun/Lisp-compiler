package AST;

public class Return {
    Either either ;

    public Either getEither() {
        return either;
    }

    public void setEither(Either either) {
        this.either = either;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Return{");
        boolean firstField = true;

        if (either != null) {
            result.append("either=").append(either);
            firstField = false;
        }

        result.append('}');
        return result.toString();
    }

}
