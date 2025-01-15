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
}
