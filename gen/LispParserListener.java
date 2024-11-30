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
	/**
	 * Enter a parse tree produced by {@link LispParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(LispParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(LispParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LispParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LispParser.ExpressionContext ctx);
}