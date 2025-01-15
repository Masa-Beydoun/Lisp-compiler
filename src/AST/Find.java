package AST;

public class Find {
    QuoteForm quoteForm1;
    QuoteForm quoteForm2;
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
        StringBuilder result = new StringBuilder("Find{");
        boolean firstField = true;

        if (quoteForm1 != null) {
            result.append("quoteForm1=").append(quoteForm1);
            firstField = false;
        }
        if (quoteForm2 != null) {
            if (!firstField) result.append(", ");
            result.append("quoteForm2=").append(quoteForm2);
            firstField = false;
        }
        if (listClass != null) {
            if (!firstField) result.append(", ");
            result.append("listClass=").append(listClass);
        }

        result.append('}');
        return result.toString();
    }

}
