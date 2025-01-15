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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("StringConcatenate{");
        boolean firstField = true;

        if (stringList != null) {
            result.append("stringList=").append(stringList);
            firstField = false;
        }
        if (eitherLists != null) {
            if (!firstField) result.append(", ");
            result.append("eitherLists=").append(eitherLists);
        }

        result.append('}');
        return result.toString();
    }

}
