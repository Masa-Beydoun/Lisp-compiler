package AST;

import java.util.List;

public class CallingFunction {

    String name;
    List<KeywordNumberHelper> keywordNumberHelperList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<KeywordNumberHelper> getKeywordNumberHelperList() {
        return keywordNumberHelperList;
    }

    public void setKeywordNumberHelperList(List<KeywordNumberHelper> keywordNumberHelperList) {
        this.keywordNumberHelperList = keywordNumberHelperList;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("CallingFunction{");
        boolean firstField = true;

        if (name != null) {
            result.append("name='").append(name).append('\'');
            firstField = false;
        }
        if (keywordNumberHelperList != null) {
            if (!firstField) result.append(", ");
            result.append("keywordNumberHelperList=").append(keywordNumberHelperList);
        }

        result.append('}');
        return result.toString();
    }

}
