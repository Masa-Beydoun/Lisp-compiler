package AST;

public class ListOperation {
    ListClass listClass;
    Push push;
    Pop pop;

    public ListClass getList() {
        return listClass;
    }

    public void setList(ListClass listClass) {
        this.listClass = listClass;
    }

    public Push getPush() {
        return push;
    }

    public void setPush(Push push) {
        this.push = push;
    }

    public Pop getPop() {
        return pop;
    }

    public void setPop(Pop pop) {
        this.pop = pop;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ListOperation{");
        boolean firstField = true;

        if (listClass != null) {
            result.append("list=").append(listClass);
            firstField = false;
        }
        if (push != null) {
            if (!firstField) result.append(", ");
            result.append("push=").append(push);
            firstField = false;
        }
        if (pop != null) {
            if (!firstField) result.append(", ");
            result.append("pop=").append(pop);
        }

        result.append('}');
        return result.toString();
    }

}
