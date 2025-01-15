package AST;

public class KeyFunction {

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


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("KeyFunction{");
        boolean firstField = true;

        if (binding != null) {
            result.append("binding=").append(binding);
            firstField = false;
        }
        if (identifier != null) {
            if (!firstField) result.append(", ");
            result.append("identifier='").append(identifier).append('\'');
        }

        result.append('}');
        return result.toString();
    }

}
