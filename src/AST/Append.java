package AST;

public class Append {
    QuoteForm quoteForm1;
    QuoteForm quoteForm2;

    public QuoteForm getQuoteForm1() {
        return quoteForm1;
    }

    public void setQuoteForm1(QuoteForm quoteForm1) {
        this.quoteForm1 = quoteForm1;
    }

    public QuoteForm getQuoteForm2() {
        return quoteForm2;
    }

    public void setQuoteForm2(QuoteForm quoteForm2) {
        this.quoteForm2 = quoteForm2;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Append{");
        boolean firstField = true;

        if (quoteForm1 != null) {
            result.append("quoteForm1=").append(quoteForm1);
            firstField = false;
        }
        if (quoteForm2 != null) {
            if (!firstField) result.append(", ");
            result.append("quoteForm2=").append(quoteForm2);
        }

        result.append('}');
        return result.toString();
    }

}
