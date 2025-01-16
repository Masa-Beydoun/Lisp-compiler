package AST;

import java.util.ArrayList;

public class ListElement {
    ArrayList<String> numbers = new ArrayList<>();
    ArrayList<String> identifier = new ArrayList<>();
    ArrayList<String> nils = new ArrayList<>();
    ArrayList<String> trues = new ArrayList<>();

    public ArrayList<String> getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ListElement{");
        boolean firstField = true;

        if (numbers != null) {
            result.append("numbers=").append(numbers);
            firstField = false;
        }
        if (identifier != null) {
            if (!firstField) result.append(", ");
            result.append("identifier=").append(identifier);
            firstField = false;
        }
        if (nils != null) {
            if (!firstField) result.append(", ");
            result.append("nils=").append(nils);
            firstField = false;
        }
        if (trues != null) {
            if (!firstField) result.append(", ");
            result.append("trues=").append(trues);
        }

        result.append('}');
        return result.toString();
    }


    public void setNumbers(ArrayList<String> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<String> getNils() {
        return nils;
    }

    public void setNils(ArrayList<String> nils) {
        this.nils = nils;
    }

    public ArrayList<String> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(ArrayList<String> identifier) {
        this.identifier = identifier;
    }

    public ArrayList<String> getTrues() {
        return trues;
    }

    public void setTrues(ArrayList<String> trues) {
        this.trues = trues;
    }
}
