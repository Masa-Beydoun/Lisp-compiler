package AST;

import java.util.ArrayList;

public class Case {
    ArrayList<CaseExpression> caseExpressions = new ArrayList<>();
    String identifier;

    public String getIdentifier() {
        return identifier;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Case{");
        boolean firstField = true;

        if (caseExpressions != null) {
            result.append("caseExpressions=").append(caseExpressions);
            firstField = false;
        }
        if (identifier != null) {
            if (!firstField) result.append(", ");
            result.append("identifier='").append(identifier).append('\'');
        }

        result.append('}');
        return result.toString();
    }


    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ArrayList<CaseExpression> getCaseExpressions() {
        return caseExpressions;
    }

    public void setCaseExpressions(ArrayList<CaseExpression> caseExpressions) {
        this.caseExpressions = caseExpressions;
    }
}