import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            String inputFilePath = "src/testLisp.lisp";

            String input = new String(Files.readAllBytes(Paths.get(inputFilePath)));
            CharStream charStream = CharStreams.fromString(input);
            First lexer = new First(charStream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine,
                                        String msg, RecognitionException e) {
                    System.err.println("Lexical Error at line " + line + ", column " + charPositionInLine + ": " + msg);
                }
            });

            CommonTokenStream tokens = new CommonTokenStream(lexer);
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
