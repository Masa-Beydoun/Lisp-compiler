package AST;

import java.util.ArrayList;

public class TemporaryList {
    ArrayList<Either> eitherList = new ArrayList<Either>();

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("TemporaryList{");

        if (eitherList != null) {
            result.append("eitherList=").append(eitherList);
        }

        result.append('}');
        return result.toString();
    }


    public ArrayList<Either> getEitherList() {
        return eitherList;
    }

    public void setEitherList(ArrayList<Either> eitherList) {
        this.eitherList = eitherList;
    }
}
