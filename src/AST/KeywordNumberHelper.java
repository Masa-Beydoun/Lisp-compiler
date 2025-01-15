package AST;

public class KeywordNumberHelper {

    String keyword;
    String number;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("KeywordNumberHelper{");
        boolean firstField = true;

        if (keyword != null) {
            result.append("keyword='").append(keyword).append('\'');
            firstField = false;
        }
        if (number != null) {
            if (!firstField) result.append(", ");
            result.append("number='").append(number).append('\'');
        }

        result.append('}');
        return result.toString();
    }

}
