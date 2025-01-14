public class MyClass {

    public static double parseNumber(String text) {
        if (text.contains(".")) {
            return Double.parseDouble(text); // Handle float
        } else {
            return Integer.parseInt(text); // Handle integer
        }
    }
}
