package AST;

public class OptionFunction {

    Binding binding;
    String identifier;

    public Binding getBinding() {
        return binding;
    }

    public void setBinding(Binding binding) {
        this.binding = binding;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
