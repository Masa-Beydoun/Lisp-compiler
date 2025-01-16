package AST;

import java.util.ArrayList;

public class Block {

    String identifier;
    String Nil;
    String True;
    ArrayList<Program> program = new ArrayList<>();

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getNil() {
        return Nil;
    }

    public void setNil(String nil) {
        Nil = nil;
    }

    public String getTrue() {
        return True;
    }

    public void setTrue(String aTrue) {
        True = aTrue;
    }

    public ArrayList<Program> getProgram() {
        return program;
    }

    public void setProgram(ArrayList<Program> program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Block{" +
                "identifier='" + identifier + '\'' +
                ", Nil='" + Nil + '\'' +
                ", True='" + True + '\'' +
                ", program=" + program +
                '}';
    }
}
