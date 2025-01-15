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
}
