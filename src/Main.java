import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            // Read the content of the input file
            String inputFilePath = "src/testLisp.lisp";
            String input = new String(Files.readAllBytes(Paths.get(inputFilePath)));

            // Create a CharStream from the input
            CharStream charStream = CharStreams.fromString(input);

            // Instantiate the lexer
            First lexer = new First(charStream);

            // Use a custom error listener for lexical errors
            lexer.removeErrorListeners(); // Remove default error listeners
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine,
                                        String msg, RecognitionException e) {
                    System.err.println("Lexical Error at line " + line + ", column " + charPositionInLine + ": " + msg);
                }
            });

            // Create a token stream from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Print the tokens with their details
            tokens.fill();
            int index = 0;
            for (Token token : tokens.getTokens()) {
                String tokenType = First.VOCABULARY.getSymbolicName(token.getType());
                if (tokenType == null) {
                    tokenType = "UNKNOWN";
                }

                if (token.getType() != Token.EOF) {
                    System.out.println(
                            "Index: " + index +
                                    ", Line: " + token.getLine() +
                                    ", Column: " + token.getCharPositionInLine() +
                                    ", Type: " + tokenType +
                                    ", Value: '" + token.getText() + "'"
                    );
                }
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
