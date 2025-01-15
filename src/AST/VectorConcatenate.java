package AST;

import java.util.ArrayList;
import java.util.List;

public class VectorConcatenate {

    List<VectorElement> vectorElementList = new ArrayList<>();

    public List<VectorElement> getVectorElementList() {
        return vectorElementList;
    }

    public void setVectorElementList(List<VectorElement> vectorElementList) {
        this.vectorElementList = vectorElementList;
    }

    @Override
    public String toString() {
        return "VectorConcatenate{" +
                "vectorElementList=" + vectorElementList +
                '}';
    }
}
