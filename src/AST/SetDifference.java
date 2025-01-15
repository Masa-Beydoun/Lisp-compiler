package AST;

public class SetDifference {
    QuoteForm quoteForm1 ;
    QuoteForm quoteForm2 ;

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
        return "SetDifference{" +
                "quoteForm1=" + quoteForm1 +
                ", quoteForm2=" + quoteForm2 +
                '}';
    }
}
