package AST;

public class ArrayDefinition {
    TwoArray twoArray;
    OneDArray oneDArray;

    public TwoArray getTwoArray() {
        return twoArray;
    }

    public void setTwoArray(TwoArray twoArray) {
        this.twoArray = twoArray;
    }

    public OneDArray getOneDArray() {
        return oneDArray;
    }

    public void setOneDArray(OneDArray oneDArray) {
        this.oneDArray = oneDArray;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ArrayDefinition{");
        boolean firstField = true;

        if (twoArray != null) {
            result.append("twoArray=").append(twoArray);
            firstField = false;
        }
        if (oneDArray != null) {
            if (!firstField) result.append(", ");
            result.append("oneDArray=").append(oneDArray);
        }

        result.append('}');
        return result.toString();
    }

}
