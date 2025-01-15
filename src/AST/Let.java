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
        return "Let{" +
                "binding=" + binding +
                ", variableBinding=" + variableBinding +
                ", nilBinding=" + nilBinding +
                '}';
    }
}
