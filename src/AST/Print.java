package AST;

public class Print {
    String Nil;
    String string;
    ListClass list;
    Either either;

    public Either getEither() {
        return either;
    }

    public void setEither(Either either) {
        this.either = either;
    }

    @Override
    public String toString() {
        return "Print{" +
                "Nil='" + Nil + '\'' +
                ", string='" + string + '\'' +
                ", list=" + list +
                ", either=" + either +
                '}';
    }

    public ListClass getList() {
        return list;
    }

    public void setList(ListClass list) {
        this.list = list;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getNil() {
        return Nil;
    }

    public void setNil(String nil) {
        Nil = nil;
    }
}
