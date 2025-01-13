// Generated from C:/Users/Masa/Downloads/spring-security-test/compiler/src/LispParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LispParser}.
 */
public interface LispParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LispParser#programs}.
	 * @param ctx the parse tree
	 */
	void enterPrograms(LispParser.ProgramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#programs}.
	 * @param ctx the parse tree
	 */
	void exitPrograms(LispParser.ProgramsContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#temporary_list}.
	 * @param ctx the parse tree
	 */
	void enterTemporary_list(LispParser.Temporary_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#temporary_list}.
	 * @param ctx the parse tree
	 */
	void exitTemporary_list(LispParser.Temporary_listContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(LispParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(LispParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(LispParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(LispParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#minus2}.
	 * @param ctx the parse tree
	 */
	void enterMinus2(LispParser.Minus2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#minus2}.
	 * @param ctx the parse tree
	 */
	void exitMinus2(LispParser.Minus2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(LispParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(LispParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(LispParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(LispParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#modulas}.
	 * @param ctx the parse tree
	 */
	void enterModulas(LispParser.ModulasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#modulas}.
	 * @param ctx the parse tree
	 */
	void exitModulas(LispParser.ModulasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#floor}.
	 * @param ctx the parse tree
	 */
	void enterFloor(LispParser.FloorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#floor}.
	 * @param ctx the parse tree
	 */
	void exitFloor(LispParser.FloorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#ceiling}.
	 * @param ctx the parse tree
	 */
	void enterCeiling(LispParser.CeilingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#ceiling}.
	 * @param ctx the parse tree
	 */
	void exitCeiling(LispParser.CeilingContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(LispParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(LispParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#sin}.
	 * @param ctx the parse tree
	 */
	void enterSin(LispParser.SinContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#sin}.
	 * @param ctx the parse tree
	 */
	void exitSin(LispParser.SinContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#cos}.
	 * @param ctx the parse tree
	 */
	void enterCos(LispParser.CosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#cos}.
	 * @param ctx the parse tree
	 */
	void exitCos(LispParser.CosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#tan}.
	 * @param ctx the parse tree
	 */
	void enterTan(LispParser.TanContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#tan}.
	 * @param ctx the parse tree
	 */
	void exitTan(LispParser.TanContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#sqrt}.
	 * @param ctx the parse tree
	 */
	void enterSqrt(LispParser.SqrtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#sqrt}.
	 * @param ctx the parse tree
	 */
	void exitSqrt(LispParser.SqrtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(LispParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(LispParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#expt}.
	 * @param ctx the parse tree
	 */
	void enterExpt(LispParser.ExptContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#expt}.
	 * @param ctx the parse tree
	 */
	void exitExpt(LispParser.ExptContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#cons}.
	 * @param ctx the parse tree
	 */
	void enterCons(LispParser.ConsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#cons}.
	 * @param ctx the parse tree
	 */
	void exitCons(LispParser.ConsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#car}.
	 * @param ctx the parse tree
	 */
	void enterCar(LispParser.CarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#car}.
	 * @param ctx the parse tree
	 */
	void exitCar(LispParser.CarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#cdr}.
	 * @param ctx the parse tree
	 */
	void enterCdr(LispParser.CdrContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#cdr}.
	 * @param ctx the parse tree
	 */
	void exitCdr(LispParser.CdrContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(LispParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(LispParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#pop}.
	 * @param ctx the parse tree
	 */
	void enterPop(LispParser.PopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#pop}.
	 * @param ctx the parse tree
	 */
	void exitPop(LispParser.PopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#defining_function}.
	 * @param ctx the parse tree
	 */
	void enterDefining_function(LispParser.Defining_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#defining_function}.
	 * @param ctx the parse tree
	 */
	void exitDefining_function(LispParser.Defining_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#calling_functions}.
	 * @param ctx the parse tree
	 */
	void enterCalling_functions(LispParser.Calling_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#calling_functions}.
	 * @param ctx the parse tree
	 */
	void exitCalling_functions(LispParser.Calling_functionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#dotimes}.
	 * @param ctx the parse tree
	 */
	void enterDotimes(LispParser.DotimesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#dotimes}.
	 * @param ctx the parse tree
	 */
	void exitDotimes(LispParser.DotimesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#dolist}.
	 * @param ctx the parse tree
	 */
	void enterDolist(LispParser.DolistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#dolist}.
	 * @param ctx the parse tree
	 */
	void exitDolist(LispParser.DolistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(LispParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(LispParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#do}.
	 * @param ctx the parse tree
	 */
	void enterDo(LispParser.DoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#do}.
	 * @param ctx the parse tree
	 */
	void exitDo(LispParser.DoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#iteration_specs}.
	 * @param ctx the parse tree
	 */
	void enterIteration_specs(LispParser.Iteration_specsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#iteration_specs}.
	 * @param ctx the parse tree
	 */
	void exitIteration_specs(LispParser.Iteration_specsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#termination_condition}.
	 * @param ctx the parse tree
	 */
	void enterTermination_condition(LispParser.Termination_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#termination_condition}.
	 * @param ctx the parse tree
	 */
	void exitTermination_condition(LispParser.Termination_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(LispParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(LispParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#return_from}.
	 * @param ctx the parse tree
	 */
	void enterReturn_from(LispParser.Return_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#return_from}.
	 * @param ctx the parse tree
	 */
	void exitReturn_from(LispParser.Return_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LispParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LispParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(LispParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(LispParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#funcall}.
	 * @param ctx the parse tree
	 */
	void enterFuncall(LispParser.FuncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#funcall}.
	 * @param ctx the parse tree
	 */
	void exitFuncall(LispParser.FuncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#apply}.
	 * @param ctx the parse tree
	 */
	void enterApply(LispParser.ApplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#apply}.
	 * @param ctx the parse tree
	 */
	void exitApply(LispParser.ApplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#mapcar}.
	 * @param ctx the parse tree
	 */
	void enterMapcar(LispParser.MapcarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#mapcar}.
	 * @param ctx the parse tree
	 */
	void exitMapcar(LispParser.MapcarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void enterLambda_expression(LispParser.Lambda_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void exitLambda_expression(LispParser.Lambda_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(LispParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(LispParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#function_reference}.
	 * @param ctx the parse tree
	 */
	void enterFunction_reference(LispParser.Function_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#function_reference}.
	 * @param ctx the parse tree
	 */
	void exitFunction_reference(LispParser.Function_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LispParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LispParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#sort}.
	 * @param ctx the parse tree
	 */
	void enterSort(LispParser.SortContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#sort}.
	 * @param ctx the parse tree
	 */
	void exitSort(LispParser.SortContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#stable_sort}.
	 * @param ctx the parse tree
	 */
	void enterStable_sort(LispParser.Stable_sortContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#stable_sort}.
	 * @param ctx the parse tree
	 */
	void exitStable_sort(LispParser.Stable_sortContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#comparison_function}.
	 * @param ctx the parse tree
	 */
	void enterComparison_function(LispParser.Comparison_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#comparison_function}.
	 * @param ctx the parse tree
	 */
	void exitComparison_function(LispParser.Comparison_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(LispParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(LispParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#list_elements}.
	 * @param ctx the parse tree
	 */
	void enterList_elements(LispParser.List_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#list_elements}.
	 * @param ctx the parse tree
	 */
	void exitList_elements(LispParser.List_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#when}.
	 * @param ctx the parse tree
	 */
	void enterWhen(LispParser.WhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#when}.
	 * @param ctx the parse tree
	 */
	void exitWhen(LispParser.WhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#greater_than}.
	 * @param ctx the parse tree
	 */
	void enterGreater_than(LispParser.Greater_thanContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#greater_than}.
	 * @param ctx the parse tree
	 */
	void exitGreater_than(LispParser.Greater_thanContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#less_than}.
	 * @param ctx the parse tree
	 */
	void enterLess_than(LispParser.Less_thanContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#less_than}.
	 * @param ctx the parse tree
	 */
	void exitLess_than(LispParser.Less_thanContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#greater_than_equals}.
	 * @param ctx the parse tree
	 */
	void enterGreater_than_equals(LispParser.Greater_than_equalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#greater_than_equals}.
	 * @param ctx the parse tree
	 */
	void exitGreater_than_equals(LispParser.Greater_than_equalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#less_than_equals}.
	 * @param ctx the parse tree
	 */
	void enterLess_than_equals(LispParser.Less_than_equalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#less_than_equals}.
	 * @param ctx the parse tree
	 */
	void exitLess_than_equals(LispParser.Less_than_equalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#comparsion}.
	 * @param ctx the parse tree
	 */
	void enterComparsion(LispParser.ComparsionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#comparsion}.
	 * @param ctx the parse tree
	 */
	void exitComparsion(LispParser.ComparsionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(LispParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(LispParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LispParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LispParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#either}.
	 * @param ctx the parse tree
	 */
	void enterEither(LispParser.EitherContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#either}.
	 * @param ctx the parse tree
	 */
	void exitEither(LispParser.EitherContext ctx);
}