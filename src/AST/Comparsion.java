package AST;

public class Comparsion {
    GreaterThan greaterThan ;
    GreaterOrEqual greaterOrEqual ;
    LessThan lessThan ;
    LessOrEqual lessOrEqual ;

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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Comparsion{");
        boolean firstField = true;

        if (greaterThan != null) {
            result.append("greaterThan=").append(greaterThan);
            firstField = false;
        }
        if (greaterOrEqual != null) {
            if (!firstField) result.append(", ");
            result.append("greaterOrEqual=").append(greaterOrEqual);
            firstField = false;
        }
        if (lessThan != null) {
            if (!firstField) result.append(", ");
            result.append("lessThan=").append(lessThan);
            firstField = false;
        }
        if (lessOrEqual != null) {
            if (!firstField) result.append(", ");
            result.append("lessOrEqual=").append(lessOrEqual);
        }

        result.append('}');
        return result.toString();
    }

}
