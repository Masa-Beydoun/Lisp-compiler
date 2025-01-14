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
	 * Visit a parse tree produced by {@link LispParser#let_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_star(LispParser.Let_starContext ctx);
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
	 * Visit a parse tree produced by {@link LispParser#evenp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvenp(LispParser.EvenpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(LispParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#pop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPop(LispParser.PopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(LispParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#forms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForms(LispParser.FormsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LispParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(LispParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#possible_number_helper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossible_number_helper(LispParser.Possible_number_helperContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#atom_helper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_helper(LispParser.Atom_helperContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#expression_helper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_helper(LispParser.Expression_helperContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#value_helper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_helper(LispParser.Value_helperContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#value_helper2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_helper2(LispParser.Value_helper2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#either}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEither(LispParser.EitherContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#function_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_form(LispParser.Function_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#quote_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote_form(LispParser.Quote_formContext ctx);
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
	 * Visit a parse tree produced by {@link LispParser#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(LispParser.BindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#variable_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_binding(LispParser.Variable_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#nil_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil_binding(LispParser.Nil_bindingContext ctx);
}