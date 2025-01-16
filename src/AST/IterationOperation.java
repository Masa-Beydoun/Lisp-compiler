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
        StringBuilder result = new StringBuilder("IterationOperation{");
        boolean firstField = true;

        if (dolist != null) {
            result.append("dolist=").append(dolist);
            firstField = false;
        }
        if (dotimes != null) {
            if (!firstField) result.append(", ");
            result.append("dotimes=").append(dotimes);
            firstField = false;
        }
        if (loop != null) {
            if (!firstField) result.append(", ");
            result.append("loop=").append(loop);
        }

        result.append('}');
        return result.toString();
    }

}
