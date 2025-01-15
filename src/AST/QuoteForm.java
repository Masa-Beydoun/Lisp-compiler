package AST;

import java.util.ArrayList;

public class QuoteForm {
    public ArrayList<AtomHelper> getAtomHelper() {
        return atomHelper;
    }

    public void setAtomHelper(ArrayList<AtomHelper> atomHelper) {
        this.atomHelper = atomHelper;
    }

    ArrayList <AtomHelper> atomHelper = new ArrayList<AtomHelper>();

    @Override
    public String toString() {
        return "QouteForm{" +
                "atomHelper=" + atomHelper +
                '}';
    }
}