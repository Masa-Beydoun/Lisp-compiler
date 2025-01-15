package AST;

import java.util.ArrayList;

public class QuoteForm {

    ArrayList<AtomHelper> atomHelper = new ArrayList<AtomHelper>();


    public ArrayList<AtomHelper> getAtomHelper() {
        return atomHelper;
    }

    public void setAtomHelper(ArrayList<AtomHelper> atomHelper) {
        this.atomHelper = atomHelper;
    }

    @Override
    public String toString() {
        return "QuoteForm{" +
                "atomHelper=" + atomHelper +
                '}';
    }
}