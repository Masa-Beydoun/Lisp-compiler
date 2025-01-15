package AST;

import java.util.ArrayList;

public class VectorElement {
    ArrayList<String> numbers = new ArrayList<>();

    public ArrayList<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<String> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "VectorElement{" +
                "numbers=" + numbers +
                '}';
    }
}
