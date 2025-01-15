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
	 * Enter a parse tree produced by {@link LispParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterMath_operation(LispParser.Math_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitMath_operation(LispParser.Math_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#list_operation}.
	 * @param ctx the parse tree
	 */
	void enterList_operation(LispParser.List_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#list_operation}.
	 * @param ctx the parse tree
	 */
	void exitList_operation(LispParser.List_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#function_operation}.
	 * @param ctx the parse tree
	 */
	void enterFunction_operation(LispParser.Function_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#function_operation}.
	 * @param ctx the parse tree
	 */
	void exitFunction_operation(LispParser.Function_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#sort_operation}.
	 * @param ctx the parse tree
	 */
	void enterSort_operation(LispParser.Sort_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#sort_operation}.
	 * @param ctx the parse tree
	 */
	void exitSort_operation(LispParser.Sort_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#iteration_operation}.
	 * @param ctx the parse tree
	 */
	void enterIteration_operation(LispParser.Iteration_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#iteration_operation}.
	 * @param ctx the parse tree
	 */
	void exitIteration_operation(LispParser.Iteration_operationContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#identifier_value_qoute_pair}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_value_qoute_pair(LispParser.Identifier_value_qoute_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#identifier_value_qoute_pair}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_value_qoute_pair(LispParser.Identifier_value_qoute_pairContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#let_star}.
	 * @param ctx the parse tree
	 */
	void enterLet_star(LispParser.Let_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#let_star}.
	 * @param ctx the parse tree
	 */
	void exitLet_star(LispParser.Let_starContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#evenp}.
	 * @param ctx the parse tree
	 */
	void enterEvenp(LispParser.EvenpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#evenp}.
	 * @param ctx the parse tree
	 */
	void exitEvenp(LispParser.EvenpContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#forms}.
	 * @param ctx the parse tree
	 */
	void enterForms(LispParser.FormsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#forms}.
	 * @param ctx the parse tree
	 */
	void exitForms(LispParser.FormsContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(LispParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(LispParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#possible_number_helper}.
	 * @param ctx the parse tree
	 */
	void enterPossible_number_helper(LispParser.Possible_number_helperContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#possible_number_helper}.
	 * @param ctx the parse tree
	 */
	void exitPossible_number_helper(LispParser.Possible_number_helperContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#atom_helper}.
	 * @param ctx the parse tree
	 */
	void enterAtom_helper(LispParser.Atom_helperContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#atom_helper}.
	 * @param ctx the parse tree
	 */
	void exitAtom_helper(LispParser.Atom_helperContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#expression_helper}.
	 * @param ctx the parse tree
	 */
	void enterExpression_helper(LispParser.Expression_helperContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#expression_helper}.
	 * @param ctx the parse tree
	 */
	void exitExpression_helper(LispParser.Expression_helperContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#value_helper}.
	 * @param ctx the parse tree
	 */
	void enterValue_helper(LispParser.Value_helperContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#value_helper}.
	 * @param ctx the parse tree
	 */
	void exitValue_helper(LispParser.Value_helperContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#value_helper2}.
	 * @param ctx the parse tree
	 */
	void enterValue_helper2(LispParser.Value_helper2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#value_helper2}.
	 * @param ctx the parse tree
	 */
	void exitValue_helper2(LispParser.Value_helper2Context ctx);
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
	/**
	 * Enter a parse tree produced by {@link LispParser#function_form}.
	 * @param ctx the parse tree
	 */
	void enterFunction_form(LispParser.Function_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#function_form}.
	 * @param ctx the parse tree
	 */
	void exitFunction_form(LispParser.Function_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#quote_form}.
	 * @param ctx the parse tree
	 */
	void enterQuote_form(LispParser.Quote_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#quote_form}.
	 * @param ctx the parse tree
	 */
	void exitQuote_form(LispParser.Quote_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(LispParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(LispParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#variable_binding}.
	 * @param ctx the parse tree
	 */
	void enterVariable_binding(LispParser.Variable_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#variable_binding}.
	 * @param ctx the parse tree
	 */
	void exitVariable_binding(LispParser.Variable_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#nil_binding}.
	 * @param ctx the parse tree
	 */
	void enterNil_binding(LispParser.Nil_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#nil_binding}.
	 * @param ctx the parse tree
	 */
	void exitNil_binding(LispParser.Nil_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#key_function}.
	 * @param ctx the parse tree
	 */
	void enterKey_function(LispParser.Key_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#key_function}.
	 * @param ctx the parse tree
	 */
	void exitKey_function(LispParser.Key_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#rest_function}.
	 * @param ctx the parse tree
	 */
	void enterRest_function(LispParser.Rest_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#rest_function}.
	 * @param ctx the parse tree
	 */
	void exitRest_function(LispParser.Rest_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#option_function}.
	 * @param ctx the parse tree
	 */
	void enterOption_function(LispParser.Option_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#option_function}.
	 * @param ctx the parse tree
	 */
	void exitOption_function(LispParser.Option_functionContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#keyword_number_helper}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_number_helper(LispParser.Keyword_number_helperContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#keyword_number_helper}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_number_helper(LispParser.Keyword_number_helperContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#condition_helper}.
	 * @param ctx the parse tree
	 */
	void enterCondition_helper(LispParser.Condition_helperContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#condition_helper}.
	 * @param ctx the parse tree
	 */
	void exitCondition_helper(LispParser.Condition_helperContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#true}.
	 * @param ctx the parse tree
	 */
	void enterTrue(LispParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#true}.
	 * @param ctx the parse tree
	 */
	void exitTrue(LispParser.TrueContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#defvar}.
	 * @param ctx the parse tree
	 */
	void enterDefvar(LispParser.DefvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#defvar}.
	 * @param ctx the parse tree
	 */
	void exitDefvar(LispParser.DefvarContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#defstruct}.
	 * @param ctx the parse tree
	 */
	void enterDefstruct(LispParser.DefstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#defstruct}.
	 * @param ctx the parse tree
	 */
	void exitDefstruct(LispParser.DefstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(LispParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(LispParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(LispParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(LispParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void enterArray_definition(LispParser.Array_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void exitArray_definition(LispParser.Array_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#twoDArray}.
	 * @param ctx the parse tree
	 */
	void enterTwoDArray(LispParser.TwoDArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#twoDArray}.
	 * @param ctx the parse tree
	 */
	void exitTwoDArray(LispParser.TwoDArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#oneDArray}.
	 * @param ctx the parse tree
	 */
	void enterOneDArray(LispParser.OneDArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#oneDArray}.
	 * @param ctx the parse tree
	 */
	void exitOneDArray(LispParser.OneDArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#array_elements_access}.
	 * @param ctx the parse tree
	 */
	void enterArray_elements_access(LispParser.Array_elements_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#array_elements_access}.
	 * @param ctx the parse tree
	 */
	void exitArray_elements_access(LispParser.Array_elements_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#array_elements_operations}.
	 * @param ctx the parse tree
	 */
	void enterArray_elements_operations(LispParser.Array_elements_operationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#array_elements_operations}.
	 * @param ctx the parse tree
	 */
	void exitArray_elements_operations(LispParser.Array_elements_operationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#operation_type}.
	 * @param ctx the parse tree
	 */
	void enterOperation_type(LispParser.Operation_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#operation_type}.
	 * @param ctx the parse tree
	 */
	void exitOperation_type(LispParser.Operation_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(LispParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(LispParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#concatenate_definition}.
	 * @param ctx the parse tree
	 */
	void enterConcatenate_definition(LispParser.Concatenate_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#concatenate_definition}.
	 * @param ctx the parse tree
	 */
	void exitConcatenate_definition(LispParser.Concatenate_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#concatenate_type}.
	 * @param ctx the parse tree
	 */
	void enterConcatenate_type(LispParser.Concatenate_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#concatenate_type}.
	 * @param ctx the parse tree
	 */
	void exitConcatenate_type(LispParser.Concatenate_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#string_concatenate}.
	 * @param ctx the parse tree
	 */
	void enterString_concatenate(LispParser.String_concatenateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#string_concatenate}.
	 * @param ctx the parse tree
	 */
	void exitString_concatenate(LispParser.String_concatenateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#list_concatenate}.
	 * @param ctx the parse tree
	 */
	void enterList_concatenate(LispParser.List_concatenateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#list_concatenate}.
	 * @param ctx the parse tree
	 */
	void exitList_concatenate(LispParser.List_concatenateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#vector_concatenate}.
	 * @param ctx the parse tree
	 */
	void enterVector_concatenate(LispParser.Vector_concatenateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#vector_concatenate}.
	 * @param ctx the parse tree
	 */
	void exitVector_concatenate(LispParser.Vector_concatenateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#either_list}.
	 * @param ctx the parse tree
	 */
	void enterEither_list(LispParser.Either_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#either_list}.
	 * @param ctx the parse tree
	 */
	void exitEither_list(LispParser.Either_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#vector_elements}.
	 * @param ctx the parse tree
	 */
	void enterVector_elements(LispParser.Vector_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#vector_elements}.
	 * @param ctx the parse tree
	 */
	void exitVector_elements(LispParser.Vector_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#concatenate_elements_call}.
	 * @param ctx the parse tree
	 */
	void enterConcatenate_elements_call(LispParser.Concatenate_elements_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#concatenate_elements_call}.
	 * @param ctx the parse tree
	 */
	void exitConcatenate_elements_call(LispParser.Concatenate_elements_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#element_access}.
	 * @param ctx the parse tree
	 */
	void enterElement_access(LispParser.Element_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#element_access}.
	 * @param ctx the parse tree
	 */
	void exitElement_access(LispParser.Element_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterStructure(LispParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitStructure(LispParser.StructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#create_structures}.
	 * @param ctx the parse tree
	 */
	void enterCreate_structures(LispParser.Create_structuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#create_structures}.
	 * @param ctx the parse tree
	 */
	void exitCreate_structures(LispParser.Create_structuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#create_an_instance}.
	 * @param ctx the parse tree
	 */
	void enterCreate_an_instance(LispParser.Create_an_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#create_an_instance}.
	 * @param ctx the parse tree
	 */
	void exitCreate_an_instance(LispParser.Create_an_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#access}.
	 * @param ctx the parse tree
	 */
	void enterAccess(LispParser.AccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#access}.
	 * @param ctx the parse tree
	 */
	void exitAccess(LispParser.AccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LispParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LispParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#setq_assignment}.
	 * @param ctx the parse tree
	 */
	void enterSetq_assignment(LispParser.Setq_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#setq_assignment}.
	 * @param ctx the parse tree
	 */
	void exitSetq_assignment(LispParser.Setq_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#setf_assignment}.
	 * @param ctx the parse tree
	 */
	void enterSetf_assignment(LispParser.Setf_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#setf_assignment}.
	 * @param ctx the parse tree
	 */
	void exitSetf_assignment(LispParser.Setf_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(LispParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(LispParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#comparison_type}.
	 * @param ctx the parse tree
	 */
	void enterComparison_type(LispParser.Comparison_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#comparison_type}.
	 * @param ctx the parse tree
	 */
	void exitComparison_type(LispParser.Comparison_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#comparison_type2}.
	 * @param ctx the parse tree
	 */
	void enterComparison_type2(LispParser.Comparison_type2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#comparison_type2}.
	 * @param ctx the parse tree
	 */
	void exitComparison_type2(LispParser.Comparison_type2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#expression_sequence}.
	 * @param ctx the parse tree
	 */
	void enterExpression_sequence(LispParser.Expression_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#expression_sequence}.
	 * @param ctx the parse tree
	 */
	void exitExpression_sequence(LispParser.Expression_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#multiple_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_expression(LispParser.Multiple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#multiple_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_expression(LispParser.Multiple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(LispParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(LispParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#cond_exp}.
	 * @param ctx the parse tree
	 */
	void enterCond_exp(LispParser.Cond_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#cond_exp}.
	 * @param ctx the parse tree
	 */
	void exitCond_exp(LispParser.Cond_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#case}.
	 * @param ctx the parse tree
	 */
	void enterCase(LispParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#case}.
	 * @param ctx the parse tree
	 */
	void exitCase(LispParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#case_exp}.
	 * @param ctx the parse tree
	 */
	void enterCase_exp(LispParser.Case_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#case_exp}.
	 * @param ctx the parse tree
	 */
	void exitCase_exp(LispParser.Case_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(LispParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(LispParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#append}.
	 * @param ctx the parse tree
	 */
	void enterAppend(LispParser.AppendContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#append}.
	 * @param ctx the parse tree
	 */
	void exitAppend(LispParser.AppendContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#reverse}.
	 * @param ctx the parse tree
	 */
	void enterReverse(LispParser.ReverseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#reverse}.
	 * @param ctx the parse tree
	 */
	void exitReverse(LispParser.ReverseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(LispParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(LispParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#find}.
	 * @param ctx the parse tree
	 */
	void enterFind(LispParser.FindContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#find}.
	 * @param ctx the parse tree
	 */
	void exitFind(LispParser.FindContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#subsetp}.
	 * @param ctx the parse tree
	 */
	void enterSubsetp(LispParser.SubsetpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#subsetp}.
	 * @param ctx the parse tree
	 */
	void exitSubsetp(LispParser.SubsetpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#intersection}.
	 * @param ctx the parse tree
	 */
	void enterIntersection(LispParser.IntersectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#intersection}.
	 * @param ctx the parse tree
	 */
	void exitIntersection(LispParser.IntersectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#union}.
	 * @param ctx the parse tree
	 */
	void enterUnion(LispParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#union}.
	 * @param ctx the parse tree
	 */
	void exitUnion(LispParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#set_difference}.
	 * @param ctx the parse tree
	 */
	void enterSet_difference(LispParser.Set_differenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#set_difference}.
	 * @param ctx the parse tree
	 */
	void exitSet_difference(LispParser.Set_differenceContext ctx);
}