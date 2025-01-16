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
	 * Visit a parse tree produced by {@link LispParser#format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat(LispParser.FormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_operation(LispParser.Math_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#list_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_operation(LispParser.List_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#function_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_operation(LispParser.Function_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#sort_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_operation(LispParser.Sort_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#iteration_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_operation(LispParser.Iteration_operationContext ctx);
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
	 * Visit a parse tree produced by {@link LispParser#identifier_value_qoute_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_value_qoute_pair(LispParser.Identifier_value_qoute_pairContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link LispParser#key_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_function(LispParser.Key_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#rest_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRest_function(LispParser.Rest_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#option_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_function(LispParser.Option_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#defining_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefining_function(LispParser.Defining_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#keyword_number_helper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword_number_helper(LispParser.Keyword_number_helperContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#calling_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalling_functions(LispParser.Calling_functionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#condition_helper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_helper(LispParser.Condition_helperContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#true}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(LispParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#temporary_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporary_list(LispParser.Temporary_listContext ctx);
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
	 * Visit a parse tree produced by {@link LispParser#defvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar(LispParser.DefvarContext ctx);
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
	 * Visit a parse tree produced by {@link LispParser#lambda_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_expression(LispParser.Lambda_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#function_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_reference(LispParser.Function_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(LispParser.FunctionContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link LispParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(LispParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#array_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_definition(LispParser.Array_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#twoDArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoDArray(LispParser.TwoDArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#oneDArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneDArray(LispParser.OneDArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#array_elements_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_elements_access(LispParser.Array_elements_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#array_elements_operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_elements_operations(LispParser.Array_elements_operationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#operation_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_type(LispParser.Operation_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LispParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#concatenate_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenate_definition(LispParser.Concatenate_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#concatenate_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenate_type(LispParser.Concatenate_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#string_concatenate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_concatenate(LispParser.String_concatenateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#list_concatenate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_concatenate(LispParser.List_concatenateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#vector_concatenate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_concatenate(LispParser.Vector_concatenateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#either_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEither_list(LispParser.Either_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#vector_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_elements(LispParser.Vector_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#concatenate_elements_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenate_elements_call(LispParser.Concatenate_elements_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#element_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_access(LispParser.Element_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure(LispParser.StructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#create_structures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_structures(LispParser.Create_structuresContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#create_an_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_an_instance(LispParser.Create_an_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#create_an_instance1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_an_instance1(LispParser.Create_an_instance1Context ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#create_an_instance2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_an_instance2(LispParser.Create_an_instance2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#colorPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorPair(LispParser.ColorPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess(LispParser.AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LispParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#setq_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetq_assignment(LispParser.Setq_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#setf_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetf_assignment(LispParser.Setf_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(LispParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#if_statement1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement1(LispParser.If_statement1Context ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#if_statement2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement2(LispParser.If_statement2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#if_statement3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement3(LispParser.If_statement3Context ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#comparison_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_type(LispParser.Comparison_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#comparison_type2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_type2(LispParser.Comparison_type2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#expression_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_sequence(LispParser.Expression_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#multiple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_expression(LispParser.Multiple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(LispParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#cond_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_exp(LispParser.Cond_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#cond_exp1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_exp1(LispParser.Cond_exp1Context ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(LispParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#case_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_exp(LispParser.Case_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(LispParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#append}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend(LispParser.AppendContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#reverse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverse(LispParser.ReverseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(LispParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#find}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFind(LispParser.FindContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#subsetp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsetp(LispParser.SubsetpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#intersection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersection(LispParser.IntersectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(LispParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#set_difference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_difference(LispParser.Set_differenceContext ctx);
}