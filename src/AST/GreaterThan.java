package AST;

public class GreaterThan {
    Either either1;
    Either either2;


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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("GreaterThan{");
        boolean firstField = true;

        if (either1 != null) {
            result.append("either1=").append(either1);
            firstField = false;
        }
        if (either2 != null) {
            if (!firstField) result.append(", ");
            result.append("either2=").append(either2);
        }

        result.append('}');
        return result.toString();
    }

}
