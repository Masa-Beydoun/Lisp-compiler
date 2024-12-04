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
	 * Visit a parse tree produced by {@link LispParser#programs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograms(LispParser.ProgramsContext ctx);
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
	 * Visit a parse tree produced by {@link LispParser#temporary_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporary_list(LispParser.Temporary_listContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link LispParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(LispParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(LispParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#multiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(LispParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(LispParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#modulas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulas(LispParser.ModulasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#floor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloor(LispParser.FloorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#ceiling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCeiling(LispParser.CeilingContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(LispParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#sin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin(LispParser.SinContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#cos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(LispParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#tan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTan(LispParser.TanContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#sqrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrt(LispParser.SqrtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(LispParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#expt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpt(LispParser.ExptContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons(LispParser.ConsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#car}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCar(LispParser.CarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#cdr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdr(LispParser.CdrContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(LispParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(LispParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#pop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPop(LispParser.PopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#defining_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefining_function(LispParser.Defining_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#calling_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalling_functions(LispParser.Calling_functionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#either}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEither(LispParser.EitherContext ctx);
}