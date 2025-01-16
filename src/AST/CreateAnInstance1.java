package AST;

public class CreateAnInstance1 {
    Either either ;

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("CreaateAnInstance1{");

        if (either != null) {
            result.append("either=").append(either);
        }

        result.append('}');
        return result.toString();
    }


    public Either getEither() {
        return either;
    }

    public void setEither(Either either) {
        this.either = either;
    }
}
