package AST;

public class StableSort {
    ListElement listElement;
    ComparisonFunction comparisonFunction;

    public ListElement getListElement() {
        return listElement;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("StableSort{");
        boolean firstField = true;

        if (listElement != null) {
            result.append("listElement=").append(listElement);
            firstField = false;
        }
        if (comparisonFunction != null) {
            if (!firstField) result.append(", ");
            result.append("comparisonFunction=").append(comparisonFunction);
        }

        result.append('}');
        return result.toString();
    }


    public void setListElement(ListElement listElement) {
        this.listElement = listElement;
    }

    public ComparisonFunction getComparisonFunction() {
        return comparisonFunction;
    }

    public void setComparisonFunction(ComparisonFunction comparisonFunction) {
        this.comparisonFunction = comparisonFunction;
    }
}
