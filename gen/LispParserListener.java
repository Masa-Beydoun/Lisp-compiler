// Generated from C:/Users/Masa/Downloads/spring-security-test/compiler/src/LispParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LispParser}.
 */
public interface LispParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LispParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LispParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LispParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#temporary_assigment}.
	 * @param ctx the parse tree
	 */
	void enterTemporary_assigment(LispParser.Temporary_assigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#temporary_assigment}.
	 * @param ctx the parse tree
	 */
	void exitTemporary_assigment(LispParser.Temporary_assigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#setq}.
	 * @param ctx the parse tree
	 */
	void enterSetq(LispParser.SetqContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#setq}.
	 * @param ctx the parse tree
	 */
	void exitSetq(LispParser.SetqContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(LispParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(LispParser.LetContext ctx);
}