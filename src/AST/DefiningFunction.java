package AST;

import java.util.List;

public class DefiningFunction {
    String functionName;
    List<String> parameters;
    List<KeyFunction> keyFunctions;
    List<OptionFunction> optionFunctions;
    List<RestFunction> restFunctions;
    List<AtomHelper> atomHelpers;


    public List<AtomHelper> getAtomHelpers() {
        return atomHelpers;
    }

    public void setAtomHelpers(List<AtomHelper> atomHelpers) {
        this.atomHelpers = atomHelpers;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public List<KeyFunction> getKeyFunctions() {
        return keyFunctions;
    }

    public void setKeyFunctions(List<KeyFunction> keyFunctions) {
        this.keyFunctions = keyFunctions;
    }

    public List<OptionFunction> getOptionFunctions() {
        return optionFunctions;
    }

    public void setOptionFunctions(List<OptionFunction> optionFunctions) {
        this.optionFunctions = optionFunctions;
    }

    public List<RestFunction> getRestFunctions() {
        return restFunctions;
    }

    public void setRestFunctions(List<RestFunction> restFunctions) {
        this.restFunctions = restFunctions;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("DefiningFunction{");
        boolean firstField = true;

        if (functionName != null) {
            result.append("functionName='").append(functionName).append('\'');
            firstField = false;
        }
        if (parameters != null) {
            if (!firstField) result.append(", ");
            result.append("parameters=").append(parameters);
            firstField = false;
        }
        if (keyFunctions != null) {
            if (!firstField) result.append(", ");
            result.append("keyFunctions=").append(keyFunctions);
            firstField = false;
        }
        if (optionFunctions != null) {
            if (!firstField) result.append(", ");
            result.append("optionFunctions=").append(optionFunctions);
            firstField = false;
        }
        if (restFunctions != null) {
            if (!firstField) result.append(", ");
            result.append("restFunctions=").append(restFunctions);
            firstField = false;
        }
        if (atomHelpers != null) {
            if (!firstField) result.append(", ");
            result.append("atomHelpers=").append(atomHelpers);
        }

        result.append('}');
        return result.toString();
    }

}
