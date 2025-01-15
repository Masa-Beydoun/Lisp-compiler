package AST;

public class Reverse {
  QuoteForm quoteForm;

    public QuoteForm getQuoteForm() {
        return quoteForm;
    }

    public void setQuoteForm(QuoteForm quoteForm) {
        this.quoteForm = quoteForm;
    }

    @Override
    public String toString() {
        return "Reverse{" +
                "quoteForm=" + quoteForm +
                '}';
    }
}
