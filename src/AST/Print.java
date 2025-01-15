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
        StringBuilder result = new StringBuilder("Print{");
        boolean firstField = true;

        if (Nil != null) {
            result.append("Nil='").append(Nil).append('\'');
            firstField = false;
        }
        if (string != null) {
            if (!firstField) result.append(", ");
            result.append("string='").append(string).append('\'');
            firstField = false;
        }
        if (list != null) {
            if (!firstField) result.append(", ");
            result.append("list=").append(list);
            firstField = false;
        }
        if (either != null) {
            if (!firstField) result.append(", ");
            result.append("either=").append(either);
        }

        result.append('}');
        return result.toString();
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
