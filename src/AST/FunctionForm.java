package AST;

public class FunctionForm {
    AtomHelper atomHelper;

    public AtomHelper getAtomHelper() {
        return atomHelper;
    }

    public void setAtomHelper(AtomHelper atomHelper) {
        this.atomHelper = atomHelper;
    }

    @Override
    public String toString() {
        return "FunctionForm{" +
                "atomHelper=" + atomHelper +
                '}';
    }
}
