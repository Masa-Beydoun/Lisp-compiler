import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String inputFileName = ".\\src\\input.txt";

        try {
            CharStream input = CharStreams.fromStream(new FileInputStream(inputFileName));
            LispLexer lexer = new LispLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LispParser parser = new LispParser(tokens);
            ParseTree tree = parser.list(); // Replace 'start' with your actual starting rule

            System.out.println(tree.toStringTree(parser));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
