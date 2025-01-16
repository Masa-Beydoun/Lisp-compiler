package AST;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

    List<AtomHelper> atomHelper= new ArrayList<>();
    List<String> nil= new ArrayList<>();


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
        StringBuilder result = new StringBuilder("ListClass{");
        boolean firstField = true;

        if (atomHelper != null) {
            result.append("atomHelper=").append(atomHelper);
            firstField = false;
        }
        if (nil != null) {
            if (!firstField) result.append(", ");
            result.append("nil=").append(nil);
        }

        result.append('}');
        return result.toString();
    }

}
