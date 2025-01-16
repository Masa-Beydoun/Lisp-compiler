package AST;

import java.util.ArrayList;

public class Format {

    String t;
    String nil;
    ArrayList<PossibleNumberHelper> possibleNumberHelperList = new ArrayList<>();


    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getNil() {
        return nil;
    }

    public void setNil(String nil) {
        this.nil = nil;
    }

    public ArrayList<PossibleNumberHelper> getPossibleNumberHelperList() {
        return possibleNumberHelperList;
    }

    public void setPossibleNumberHelperList(ArrayList<PossibleNumberHelper> possibleNumberHelperList) {
        this.possibleNumberHelperList = possibleNumberHelperList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Format{");
        boolean firstField = true;

        if (t != null) {
            result.append("t='").append(t).append('\'');
            firstField = false;
        }
        if (nil != null) {
            if (!firstField) result.append(", ");
            result.append("nil='").append(nil).append('\'');
        }
        if (possibleNumberHelperList != null) {
            if (!firstField) result.append(", ");
            result.append("possibleNumberHelperList=").append(possibleNumberHelperList);
        }

        result.append('}');
        return result.toString();
    }

}


