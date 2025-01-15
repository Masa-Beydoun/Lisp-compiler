package visitor;

public class MyClass {

    public static double parseNumber(String text) {
        if (text.contains(".")) {
            return Double.parseDouble(text); // Handle float
        } else {
            return Integer.parseInt(text); // Handle integer
        }
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
