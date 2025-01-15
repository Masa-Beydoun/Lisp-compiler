package AST;

public class IdentifierValueQuotePair {
    String identifier;
    ValueHelper valueHelper;
    QuoteForm quoteForm;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ValueHelper getValueHelper() {
        return valueHelper;
    }

    public void setValueHelper(ValueHelper valueHelper) {
        this.valueHelper = valueHelper;
    }

    public QuoteForm getQuoteForm() {
        return quoteForm;
    }

    public void setQuoteForm(QuoteForm quoteForm) {
        this.quoteForm = quoteForm;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("IdentifierValueAtomPair{");
        boolean firstField = true;

        if (identifier != null) {
            result.append("identifier='").append(identifier).append('\'');
            firstField = false;
        }
        if (valueHelper != null) {
            if (!firstField) result.append(", ");
            result.append("valueHelper=").append(valueHelper);
            firstField = false;
        }
        if (quoteForm != null) {
            if (!firstField) result.append(", ");
            result.append("quoteForm=").append(quoteForm);
        }

        result.append('}');
        return result.toString();
    }

}
