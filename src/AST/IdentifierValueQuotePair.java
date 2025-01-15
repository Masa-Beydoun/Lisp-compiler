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
        return "IdentifierValueAtomPair{" +
                "identifier='" + identifier + '\'' +
                ", valueHelper=" + valueHelper +
                ", quoteForm=" + quoteForm +
                '}';
    }
}
