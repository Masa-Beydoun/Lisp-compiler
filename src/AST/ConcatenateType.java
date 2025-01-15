package AST;

import java.util.List;

public class ConcatenateType {
    StringConcatenate stringConcatenate;
    VectorConcatenate vectorConcatenate;
    ListConcatenate listConcatenate;

    public StringConcatenate getStringConcatenate() {
        return stringConcatenate;
    }

    public void setStringConcatenate(StringConcatenate stringConcatenate) {
        this.stringConcatenate = stringConcatenate;
    }

    public VectorConcatenate getVectorConcatenate() {
        return vectorConcatenate;
    }

    public void setVectorConcatenate(VectorConcatenate vectorConcatenate) {
        this.vectorConcatenate = vectorConcatenate;
    }

    public ListConcatenate getListConcatenate() {
        return listConcatenate;
    }

    public void setListConcatenate(ListConcatenate listConcatenate) {
        this.listConcatenate = listConcatenate;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ConcatenateType{");
        boolean firstField = true;

        if (stringConcatenate != null) {
            result.append("stringConcatenate=").append(stringConcatenate);
            firstField = false;
        }
        if (vectorConcatenate != null) {
            if (!firstField) result.append(", ");
            result.append("vectorConcatenate=").append(vectorConcatenate);
            firstField = false;
        }
        if (listConcatenate != null) {
            if (!firstField) result.append(", ");
            result.append("listConcatenate=").append(listConcatenate);
        }

        result.append('}');
        return result.toString();
    }




}
