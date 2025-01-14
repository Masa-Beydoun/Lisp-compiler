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
}