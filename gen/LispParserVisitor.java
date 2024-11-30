// Generated from C:/Users/Masa/Downloads/spring-security-test/compiler/src/LispParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LispParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LispParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LispParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LispParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#temporary_assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporary_assigment(LispParser.Temporary_assigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#setq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetq(LispParser.SetqContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(LispParser.LetContext ctx);
}