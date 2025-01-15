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

    @Override
    public String toString() {
        return "Cons{" +
                "possibleNumberHelper1=" + possibleNumberHelper1 +
                ", possibleNumberHelper2=" + possibleNumberHelper2 +
                ", null1=" + null1 +
                ", null2=" + null2 +
                '}';
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




}
