package AST;

public class Cons {
    PossibleNumberHelper possibleNumberHelper1 = new PossibleNumberHelper();
    PossibleNumberHelper possibleNumberHelper2 = new PossibleNumberHelper();
    String  null1 ;
    String null2 ;

    public PossibleNumberHelper getPossibleNumberHelper1() {
        return possibleNumberHelper1;
    }

    public String getNull1() {
        return null1;
    }

    public void setNull1(String null1) {
        this.null1 = null1;
    }

    public String getNull2() {
        return null2;
    }

    public void setNull2(String null2) {
        this.null2 = null2;
    }

    public void setPossibleNumberHelper1(PossibleNumberHelper possibleNumberHelper1) {
        this.possibleNumberHelper1 = possibleNumberHelper1;
    }

    public PossibleNumberHelper getPossibleNumberHelper2() {
        return possibleNumberHelper2;
    }

    public void setPossibleNumberHelper2(PossibleNumberHelper possibleNumberHelper2) {
        this.possibleNumberHelper2 = possibleNumberHelper2;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Cons{");
        boolean firstField = true;

        if (possibleNumberHelper1 != null) {
            result.append("possibleNumberHelper1=").append(possibleNumberHelper1);
            firstField = false;
        }
        if (possibleNumberHelper2 != null) {
            if (!firstField) result.append(", ");
            result.append("possibleNumberHelper2=").append(possibleNumberHelper2);
            firstField = false;
        }
        if (null1 != null) {
            if (!firstField) result.append(", ");
            result.append("null1=").append(null1);
            firstField = false;
        }
        if (null2 != null) {
            if (!firstField) result.append(", ");
            result.append("null2=").append(null2);
        }

        result.append('}');
        return result.toString();
    }


}
