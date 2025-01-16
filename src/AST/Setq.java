package AST;

import java.util.ArrayList;
import java.util.List;

public class Setq {

    List<IdentifierValueQuotePair> identifierValueQuotePair = new ArrayList<>();

    public List<IdentifierValueQuotePair> getIdentifierValueQuotePair() {
        return identifierValueQuotePair;
    }

    public void setIdentifierValueQuotePair(List<IdentifierValueQuotePair> identifierValueQuotePair) {
        this.identifierValueQuotePair = identifierValueQuotePair;
    }


    @Override
    public String toString() {
        return "Setq{" +
                "identifierValueAtomPair=" + identifierValueQuotePair +
                '}';
    }
}
