import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        parsing();

//        readTokens();
    }

    public static void parsing(){
        String inputFileName = "./src/input.txt";

        try {
            CharStream charStream = CharStreams.fromStream(new FileInputStream(inputFileName));
            LispLexer lexer = new LispLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LispParser parser = new LispParser(tokens);

            ParseTree tree = parser.program();
            System.out.println(tree.toStringTree(parser));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readTokens(){
        try {
            String inputFilePath = "src/input.txt";

            String input = new String(Files.readAllBytes(Paths.get(inputFilePath)));
            CharStream charStream = CharStreams.fromString(input);
            LispLexer lexer = new LispLexer(charStream);
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
                String tokenType = LispLexer.VOCABULARY.getSymbolicName(token.getType());
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
