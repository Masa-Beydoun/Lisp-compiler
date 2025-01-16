package AST;

public class ComparisonOperator {
    String greaterThan;
    String lessThan;
    String equals;

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ComparisonOperator{");
        boolean firstField = true;

        if (greaterThan != null) {
            result.append("greaterThan='").append(greaterThan).append('\'');
            firstField = false;
        }
        if (lessThan != null) {
            if (!firstField) result.append(", ");
            result.append("lessThan='").append(lessThan).append('\'');
            firstField = false;
        }
        if (equals != null) {
            if (!firstField) result.append(", ");
            result.append("equals='").append(equals).append('\'');
        }

        result.append('}');
        return result.toString();
    }

    public String getGreaterThan() {
        return greaterThan;
    }

    public void setGreaterThan(String greaterThan) {
        this.greaterThan = greaterThan;
    }

    public String getLessThan() {
        return lessThan;
    }

    public void setLessThan(String lessThan) {
        this.lessThan = lessThan;
    }

    public String getEquals() {
        return equals;
    }

    public void setEquals(String equals) {
        this.equals = equals;
    }
}
