package AST;

public class Eq {
  QuoteForm quoteForm1 ;
  QuoteForm quoteForm2 ;

    public QuoteForm getQuoteForm1() {
        return quoteForm1;
    }

    public void setQuoteForm1(QuoteForm quoteForm1) {
        this.quoteForm1 = quoteForm1;
    }

    public QuoteForm getQouteForm2() {
        return quoteForm2;
    }

    public void setQouteForm2(QuoteForm qouteForm2) {
        this.quoteForm2 = qouteForm2;
    }

    @Override
    public String toString() {
        return "Eq{" +
                "quoteForm1=" + quoteForm1 +
                ", qouteForm2=" + quoteForm2 +
                '}';
    }
}
