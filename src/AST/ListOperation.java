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
        return "ListOperation{" +
                "list=" + listClass +
                ", push=" + push +
                ", pop=" + pop +
                '}';
    }
}
