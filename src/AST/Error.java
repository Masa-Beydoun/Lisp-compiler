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
        return "Error{" +
                "string='" + string + '\'' +
                ", either=" + either +
                '}';
    }

    public ArrayList<Either> getEither() {
        return either;
    }

    public void setEither(ArrayList<Either> either) {
        this.either = either;
    }
}