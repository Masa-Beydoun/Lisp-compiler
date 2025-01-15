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
}
