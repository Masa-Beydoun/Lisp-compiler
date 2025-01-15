package AST;

public class OperationType {
    String push;
    Either either;
    String pop;
    String INCF;

    public String getPush() {
        return push;
    }

    public void setPush(String push) {
        this.push = push;
    }

    public Either getEither() {
        return either;
    }

    public void setEither(Either either) {
        this.either = either;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public String getINCF() {
        return INCF;
    }

    public void setINCF(String INCF) {
        this.INCF = INCF;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("OperationType{");
        boolean firstField = true;

        if (push != null) {
            result.append("push='").append(push).append('\'');
            firstField = false;
        }
        if (either != null) {
            if (!firstField) result.append(", ");
            result.append("either=").append(either);
            firstField = false;
        }
        if (pop != null) {
            if (!firstField) result.append(", ");
            result.append("pop='").append(pop).append('\'');
            firstField = false;
        }
        if (INCF != null) {
            if (!firstField) result.append(", ");
            result.append("INCF='").append(INCF).append('\'');
        }

        result.append('}');
        return result.toString();
    }

}
