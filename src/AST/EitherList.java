package AST;

import java.util.List;

public class EitherList {

    List<String> chars;

    public List<String> getChars() {
        return chars;
    }

    public void setChars(List<String> chars) {
        this.chars = chars;
    }


    @Override
    public String toString() {
        return "EitherList{" +
                "chars=" + chars +
                '}';
    }
}
