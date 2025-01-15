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
}
