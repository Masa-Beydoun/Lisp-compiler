package AST;

import java.util.ArrayList;
import java.util.List;

public class EitherList {

    List<String> chars= new ArrayList<>();

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
