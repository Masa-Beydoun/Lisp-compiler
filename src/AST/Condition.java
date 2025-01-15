package AST;

import java.util.ArrayList;

public class Condition {
    ArrayList<Comparsion>  comparsion = new ArrayList<Comparsion>();
    ArrayList<String>  identifier = new ArrayList<String>();
    ArrayList<String>  number = new ArrayList<String>();

    @Override
    public String toString() {
        return "Condition{" +
                "comparsion=" + comparsion +
                ", identifier=" + identifier +
                ", number=" + number +
                '}';
    }

    public ArrayList<String> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(ArrayList<String> identifier) {
        this.identifier = identifier;
    }

    public ArrayList<Comparsion> getComparsion() {
        return comparsion;
    }

    public void setComparsion(ArrayList<Comparsion> comparsion) {
        this.comparsion = comparsion;
    }

    public ArrayList<String> getNumber() {
        return number;
    }

    public void setNumber(ArrayList<String> number) {
        this.number = number;
    }
}
