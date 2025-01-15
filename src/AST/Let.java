package AST;

import java.util.List;

public class Let {

    List<Binding> binding;
    List<VariableBinding> variableBinding;
    List<NilBinding> nilBinding;

    public List<Binding> getBinding() {
        return binding;
    }

    public void setBinding(List<Binding> binding) {
        this.binding = binding;
    }

    public List<VariableBinding> getVariableBinding() {
        return variableBinding;
    }

    public void setVariableBinding(List<VariableBinding> variableBinding) {
        this.variableBinding = variableBinding;
    }

    public List<NilBinding> getNilBinding() {
        return nilBinding;
    }

    public void setNilBinding(List<NilBinding> nilBinding) {
        this.nilBinding = nilBinding;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Let{");
        boolean firstField = true;

        if (binding != null) {
            result.append("binding=").append(binding);
            firstField = false;
        }
        if (variableBinding != null) {
            if (!firstField) result.append(", ");
            result.append("variableBinding=").append(variableBinding);
            firstField = false;
        }
        if (nilBinding != null) {
            if (!firstField) result.append(", ");
            result.append("nilBinding=").append(nilBinding);
        }

        result.append('}');
        return result.toString();
    }

}
