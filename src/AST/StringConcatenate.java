package AST;

import java.util.ArrayList;
import java.util.List;

public class StringConcatenate {
    List<String> stringList = new ArrayList<>();
    List<EitherList> eitherLists = new ArrayList<>();

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public List<EitherList> getEitherLists() {
        return eitherLists;
    }

    public void setEitherLists(List<EitherList> eitherLists) {
        this.eitherLists = eitherLists;
    }
}
