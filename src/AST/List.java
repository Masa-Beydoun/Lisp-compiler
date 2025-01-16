package AST;

import java.util.ArrayList;

public class List {
    ArrayList<AtomHelper>  atomHelpers =new ArrayList<AtomHelper>();
    ArrayList<String> nil =new ArrayList<String>();

    public ArrayList<AtomHelper> getAtomHelpers() {
        return atomHelpers;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("List{");
        boolean firstField = true;

        if (atomHelpers != null) {
            result.append("atomHelpers=").append(atomHelpers);
            firstField = false;
        }
        if (nil != null) {
            if (!firstField) result.append(", ");
            result.append("nil=").append(nil);
        }

        result.append('}');
        return result.toString();
    }


    public void setAtomHelpers(ArrayList<AtomHelper> atomHelpers) {
        this.atomHelpers = atomHelpers;
    }

    public ArrayList<String> getNil() {
        return nil;
    }

    public void setNil(ArrayList<String> nil) {
        this.nil = nil;
    }
}