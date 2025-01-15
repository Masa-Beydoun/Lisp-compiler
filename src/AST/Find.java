package AST;

public class Find {
 QuoteForm quoteForm1 ;
 QuoteForm quoteForm2 ;
 ListClass listClass;

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

    public ListClass getListClass() {
        return listClass;
    }

    public void setListClass(ListClass listClass) {
        this.listClass = listClass;
    }

    @Override
    public String toString() {
        return "Find{" +
                "quoteForm1=" + quoteForm1 +
                ", quoteForm2=" + quoteForm2 +
                ", listClass=" + listClass +
                '}';
    }
}
