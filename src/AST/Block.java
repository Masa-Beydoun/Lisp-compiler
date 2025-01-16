package AST;

import java.util.ArrayList;

public class Block {
    String Identifire;
    String True;
    String Nil;
    ArrayList<Program> programs = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Blosk{");
        boolean firstField = true;

        if (Identifire != null) {
            result.append("Identifire='").append(Identifire).append('\'');
            firstField = false;
        }
        if (True != null) {
            if (!firstField) result.append(", ");
            result.append("True='").append(True).append('\'');
            firstField = false;
        }
        if (Nil != null) {
            if (!firstField) result.append(", ");
            result.append("Nil='").append(Nil).append('\'');
            firstField = false;
        }
        if (programs != null) {
            if (!firstField) result.append(", ");
            result.append("programs=").append(programs);
        }

        result.append('}');
        return result.toString();
    }

    public String getTrue() {
        return True;
    }

    public void setTrue(String aTrue) {
        True = aTrue;
    }

    public String getIdentifire() {
        return Identifire;
    }

    public void setIdentifire(String identifire) {
        Identifire = identifire;
    }

    public String getNil() {
        return Nil;
    }

    public void setNil(String nil) {
        Nil = nil;
    }

    public ArrayList<Program> getPrograms() {
        return programs;
    }

    public void setPrograms(ArrayList<Program> programs) {
        this.programs = programs;
    }
}
