package AST;

import java.util.ArrayList;
import java.util.List;

public class LetStar {
    List<Binding> binding= new ArrayList<>();
    List<VariableBinding> variableBinding= new ArrayList<>();
    List<NilBinding> nilBinding= new ArrayList<>();
    List<PossibleNumberHelper>  possibleNumberHelperLists= new ArrayList<>();

    List<TemporaryList> temporaryListList = new ArrayList<>() ;

    public List<TemporaryList> getTemporaryListList() {
        return temporaryListList;
    }

    public void setTemporaryListList(List<TemporaryList> temporaryListList) {
        this.temporaryListList = temporaryListList;
    }
    public List<PossibleNumberHelper> getPossibleNumberHelperLists() {
        return possibleNumberHelperLists;
    }

    public void setPossibleNumberHelperLists(List<PossibleNumberHelper> possibleNumberHelperLists) {
        this.possibleNumberHelperLists = possibleNumberHelperLists;
    }

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
        StringBuilder result = new StringBuilder("LetStar{");
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
        if(possibleNumberHelperLists!=null){
            if (!firstField) result.append(", ");
            result.append("quoteForms=").append(possibleNumberHelperLists);
        }

        result.append('}');
        return result.toString();
    }

}
