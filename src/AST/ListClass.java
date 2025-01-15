package AST;

import java.util.List;

public class ListClass {

    List<AtomHelper> atomHelper;
    List<String> nil;


    public List<AtomHelper> getAtomHelper() {
        return atomHelper;
    }

    public void setAtomHelper(List<AtomHelper> atomHelper) {
        this.atomHelper = atomHelper;
    }

    public List<String> getNil() {
        return nil;
    }

    public void setNil(List<String> nil) {
        this.nil = nil;
    }

    @Override
    public String toString() {
        return "ListClass{" +
                "atomHelper=" + atomHelper +
                ", nil=" + nil +
                '}';
    }
}
