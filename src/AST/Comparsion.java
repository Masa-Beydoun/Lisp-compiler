package AST;

public class Comparsion {
    GreaterThan greaterThan ;
    GreaterOrEqual greaterOrEqual ;
    LessThan lessThan ;
    LessOrEqual lessOrEqual ;

    @Override
    public String toString() {
        return "Comparsion{" +
                "greaterThan=" + greaterThan +
                ", greaterOrEqual=" + greaterOrEqual +
                ", lessThan=" + lessThan +
                ", lessOrEqual=" + lessOrEqual +
                '}';
    }

    public GreaterThan getGreaterThan() {
        return greaterThan;
    }

    public void setGreaterThan(GreaterThan greaterThan) {
        this.greaterThan = greaterThan;
    }

    public GreaterOrEqual getGreaterOrEqual() {
        return greaterOrEqual;
    }

    public void setGreaterOrEqual(GreaterOrEqual greaterOrEqual) {
        this.greaterOrEqual = greaterOrEqual;
    }

    public LessThan getLessThan() {
        return lessThan;
    }

    public void setLessThan(LessThan lessThan) {
        this.lessThan = lessThan;
    }

    public LessOrEqual getLessOrEqual() {
        return lessOrEqual;
    }

    public void setLessOrEqual(LessOrEqual lessOrEqual) {
        this.lessOrEqual = lessOrEqual;
    }
}
