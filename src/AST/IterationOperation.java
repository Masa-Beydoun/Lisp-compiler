package AST;

public class IterationOperation {

    Dolist dolist;
    Dotimes dotimes;
    Loop loop;

    public Dolist getDolist() {
        return dolist;
    }

    public void setDolist(Dolist dolist) {
        this.dolist = dolist;
    }

    public Dotimes getDotimes() {
        return dotimes;
    }

    public void setDotimes(Dotimes dotimes) {
        this.dotimes = dotimes;
    }

    public Loop getLoop() {
        return loop;
    }

    public void setLoop(Loop loop) {
        this.loop = loop;
    }

    @Override
    public String toString() {
        return "IterationOperation{" +
                "dolist=" + dolist +
                ", dotimes=" + dotimes +
                ", loop=" + loop +
                '}';
    }
}
