package AST;

import java.util.ArrayList;

public class FunctionReference {
    String hashTag;
    ArrayList<Either> either = new ArrayList<>();

    public String getHashTag() {
        return hashTag;
    }

    public void setHashTag(String hashTag) {
        this.hashTag = hashTag;
    }

    public ArrayList<Either> getEither() {
        return either;
    }

    public void setEither(ArrayList<Either> either) {
        this.either = either;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("FunctionReference{");
        boolean firstField = true;

        if (hashTag != null) {
            result.append("hashTag='").append(hashTag).append('\'');
            firstField = false;
        }
        if (either != null) {
            if (!firstField) result.append(", ");
            result.append("either=").append(either);
        }

        result.append('}');
        return result.toString();
    }

}
