// Generated from C:/Users/DELL/Desktop/New folder/Lisp-compiler/src/LispParser.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link LispParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(LispParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(LispParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#bindings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindings(LispParser.BindingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#special_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_binding(LispParser.Special_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(LispParser.BindingContext ctx);
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
	 * Visit a parse tree produced by {@link LispParser#dotimes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotimes(LispParser.DotimesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#dolist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDolist(LispParser.DolistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(LispParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo(LispParser.DoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#iteration_specs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_specs(LispParser.Iteration_specsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#termination_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermination_condition(LispParser.Termination_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#simple_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_binding(LispParser.Simple_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(LispParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#return_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_from(LispParser.Return_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LispParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(LispParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(LispParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#funcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncall(LispParser.FuncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#apply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApply(LispParser.ApplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#mapcar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapcar(LispParser.MapcarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LispParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#lambda_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_expression(LispParser.Lambda_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(LispParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote(LispParser.QuoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#function_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_reference(LispParser.Function_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#function_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_form(LispParser.Function_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#sort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort(LispParser.SortContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#stable_sort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStable_sort(LispParser.Stable_sortContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#comparison_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_function(LispParser.Comparison_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(LispParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#list_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_elements(LispParser.List_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen(LispParser.WhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#greater_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater_than(LispParser.Greater_thanContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#less_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess_than(LispParser.Less_thanContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#greater_than_equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater_than_equals(LispParser.Greater_than_equalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#less_than_equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess_than_equals(LispParser.Less_than_equalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#comparsion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparsion(LispParser.ComparsionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(LispParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#either}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEither(LispParser.EitherContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(LispParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LispParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(LispParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#defstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefstruct(LispParser.DefstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(LispParser.FieldContext ctx);
}