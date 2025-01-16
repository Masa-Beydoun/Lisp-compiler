package AST;

import java.util.ArrayList;

public class Error {

    String string;
    ArrayList<Either> either = new ArrayList<>();

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Error{");
        boolean firstField = true;

        if (string != null) {
            result.append("string='").append(string).append('\'');
            firstField = false;
        }
        if (either != null) {
            if (!firstField) result.append(", ");
            result.append("either=").append(either);
        }

        result.append('}');
        return result.toString();
    }


    public ArrayList<Either> getEither() {
        return either;
    }

    public void setEither(ArrayList<Either> either) {
        this.either = either;
    }
}