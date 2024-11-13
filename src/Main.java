import org.antlr.v4.runtime.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            // Read the content of the input file
            String inputFilePath = "C:\\Users\\Masa\\Downloads\\spring-security-test\\compiler\\src\\input.txt";
            String input = new String(Files.readAllBytes(Paths.get(inputFilePath)));

            // Create a CharStream from the input
            CharStream charStream = CharStreams.fromString(input);

            // Instantiate the lexer
            First lexer = new First(charStream);

            // Create a token stream from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Print the tokens
            tokens.fill();
            for (Token token : tokens.getTokens()) {
                System.out.println("Token Type: " + First.VOCABULARY.getSymbolicName(token.getType()) + ", Text: '" + token.getText() + "'");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}