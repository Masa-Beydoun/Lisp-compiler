import AST.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

public class VisitorClass extends LispParserBaseVisitor<Object> {

    @Override
    public StringClass visitString(LispParser.StringContext ctx) {
        StringClass str = new StringClass();
        if (ctx.concatenate_definition() != null) {
            str.setConcatenateDefinition(visitConcatenate_definition(ctx.concatenate_definition()));
        } else if (ctx.concatenate_elements_call() != null) {
            str.setConcatenateElementsCall(visitConcatenate_elements_call(ctx.concatenate_elements_call()));
        }
        return str;
    }

    @Override
    public ConcatenateElementsCall visitConcatenate_elements_call(LispParser.Concatenate_elements_callContext ctx) {
        ConcatenateElementsCall concat = new ConcatenateElementsCall();
        concat.setElementAccess(visitElement_access(ctx.element_access()));
        concat.setString(ctx.STRING().getText());
        return concat;
    }

    @Override
    public ElementAccess visitElement_access(LispParser.Element_accessContext ctx) {
        ElementAccess access = new ElementAccess();
        if (ctx.CHAR() != null) {
            access.setCHAR(ctx.CHAR().getText());
        } else if (ctx.AREF() != null) {
            access.setAref(ctx.AREF().getText());
        }
        return access;
    }

    @Override
    public ConcatenateDefinition visitConcatenate_definition(LispParser.Concatenate_definitionContext ctx) {
        ConcatenateDefinition def = new ConcatenateDefinition();
        def.setConcatenateType(visitConcatenate_type(ctx.concatenate_type()));
        return def;
    }

    @Override
    public ConcatenateType visitConcatenate_type(LispParser.Concatenate_typeContext ctx) {
        ConcatenateType concatenateType = new ConcatenateType();
        if (ctx.string_concatenate() != null) {
            concatenateType.setStringConcatenate(visitString_concatenate(ctx.string_concatenate()));
        } else if (ctx.vector_concatenate() != null) {
            concatenateType.setVectorConcatenate(visitVector_concatenate(ctx.vector_concatenate()));
        } else if (ctx.list_concatenate() != null) {
            concatenateType.setListConcatenate(visitList_concatenate(ctx.list_concatenate()));
        }
        return concatenateType;
    }

    @Override
    public ListConcatenate visitList_concatenate(LispParser.List_concatenateContext ctx) {
        ListConcatenate listConcatenate = new ListConcatenate();
        if (ctx.STRING() != null) {
            for (TerminalNode p : ctx.STRING()) {
                listConcatenate.getStringList().add(p.getText());
            }
        }
        return listConcatenate;
    }

    @Override
    public VectorConcatenate visitVector_concatenate(LispParser.Vector_concatenateContext ctx) {
        VectorConcatenate vectorConcatenate = new VectorConcatenate();
        if (ctx.vector_elements() != null) {
            for (LispParser.Vector_elementsContext p : ctx.vector_elements()) {
                vectorConcatenate.getVectorElementList().add(visitVector_elements(p));
            }
        }
        return vectorConcatenate;
    }

    @Override
    public VectorElement visitVector_elements(LispParser.Vector_elementsContext ctx) {
        VectorElement vectorElement = new VectorElement();
        if (ctx.NUMBER() != null) {
            for (TerminalNode p : ctx.NUMBER()) {
                vectorElement.getNumbers().add(p.getText());
            }
        }
        return vectorElement;
    }

    @Override
    public StringConcatenate visitString_concatenate(LispParser.String_concatenateContext ctx) {
        StringConcatenate stringConcatenate = new StringConcatenate();
        if (ctx.STRING() != null) {
            for (TerminalNode p : ctx.STRING()) {
                stringConcatenate.getStringList().add(p.getText());
            }
        } else if (ctx.either_list() != null) {
            for (LispParser.Either_listContext p : ctx.either_list()) {
                stringConcatenate.getEitherLists().add(visitEither_list(p));
            }
        }
        return stringConcatenate;
    }

    @Override
    public EitherList visitEither_list(LispParser.Either_listContext ctx) {
        EitherList eitherList = new EitherList();
        if (ctx.CHAR_LITERAL() != null) {
            for (TerminalNode p : ctx.CHAR_LITERAL()) {
                eitherList.getChars().add(p.getText());
            }
        }
        return eitherList;
    }

    @Override
    public ArrayClass visitArray(LispParser.ArrayContext ctx) {
        ArrayClass arrayClass = new ArrayClass();
        if (ctx.array_definition() != null) {
            arrayClass.setArrayDefinition(visitArray_definition(ctx.array_definition()));
        } else if (ctx.array_elements_access() != null) {
            arrayClass.setArrayElenmentsAccess(visitArray_elements_access(ctx.array_elements_access()));
        } else if (ctx.array_elements_operations() != null) {
            arrayClass.setArrayElementOperation(visitArray_elements_operations(ctx.array_elements_operations()));
        }
        return arrayClass;
    }

    @Override
    public ArrayDefinition visitArray_definition(LispParser.Array_definitionContext ctx) {
        ArrayDefinition arrayDefinition = new ArrayDefinition();
        if (ctx.oneDArray() != null) {
            arrayDefinition.setOneDArray(visitOneDArray(ctx.oneDArray()));
        } else if (ctx.twoDArray() != null) {
            arrayDefinition.setTwoArray(visitTwoDArray(ctx.twoDArray()));
        }
        return arrayDefinition;
    }

    @Override
    public TwoArray visitTwoDArray(LispParser.TwoDArrayContext ctx) {
        TwoArray array = new TwoArray();
        array.setNumber(ctx.NUMBER().get(0).getText());
        array.setNumber(ctx.NUMBER().get(1).getText());
        return array;
    }

    @Override
    public OneDArray visitOneDArray(LispParser.OneDArrayContext ctx) {
        OneDArray array = new OneDArray();
        array.setEither(visitEither(ctx.either()));
        return array;
    }

    @Override
    public ArrayElementsAccess visitArray_elements_access(LispParser.Array_elements_accessContext ctx) {
        ArrayElementsAccess arrayElementsAccess = new ArrayElementsAccess();
        if (ctx.multiply() != null) {
            arrayElementsAccess.setMultiply(visitMultiply(ctx.multiply()));
        }
        if (ctx.IDENTIFIER() != null) {
            arrayElementsAccess.setIdentifier(ctx.IDENTIFIER().getText());
            arrayElementsAccess.setEither(visitEither(ctx.either()));
        }
        return arrayElementsAccess;
    }

    @Override
    public ArrayElementOperation visitArray_elements_operations(LispParser.Array_elements_operationsContext ctx) {
        ArrayElementOperation arrayElementOperation = new ArrayElementOperation();
        arrayElementOperation.setOperationType(visitOperation_type(ctx.operation_type()));
        arrayElementOperation.setArrayElementsAccess(visitArray_elements_access(ctx.array_elements_access()));
        return arrayElementOperation;
    }

    @Override
    public OperationType visitOperation_type(LispParser.Operation_typeContext ctx) {
        OperationType operationType = new OperationType();
        if (ctx.PUSH() != null) {
            operationType.setPush(ctx.PUSH().getText());
            operationType.setEither(visitEither(ctx.either()));
        } else if (ctx.POP() != null) {
            operationType.setPop(ctx.POP().getText());
        } else if (ctx.INCF() != null) {
            operationType.setINCF(ctx.INCF().getText());
        }
        return operationType;
    }

    @Override
    public Programs visitPrograms(LispParser.ProgramsContext ctx) {
        Programs programs = new Programs();

        for (LispParser.ProgramContext p : ctx.program()) {
            Program program = visitProgram(p);
            programs.addProgram(program);
        }

        return programs;
    }

    @Override
    public Either visitEither(LispParser.EitherContext ctx) {
        Either either = new Either();

        if (ctx.possible_number_helper().NUMBER() != null) {
            either.setNumber(ctx.possible_number_helper().NUMBER().getText());
        }
        return either;
    }

    @Override
    public Sum visitSum(LispParser.SumContext ctx) {
        Sum sum = new Sum();
        if (ctx.NUMBER != null) {
            sum.setNumber1(ctx.x.getText());
            for (Token par : ctx.y) {
                sum.getNumber2().add(par.getText());
            }
        } else if (ctx.possible_number_helper() != null) {
            for (LispParser.Possible_number_helperContext p : ctx.possible_number_helper()) {
                sum.getPossibleNumbers2().add(visitPossible_number_helper(p));
            }
        }

        return sum;
    }

    @Override
    public Minus visitMinus(LispParser.MinusContext ctx) {
        Minus minus = new Minus();
        if (ctx.x != null) {
            minus.getParameters().add(ctx.x.getText());
            for (Token par : ctx.y) {
                minus.getParameters().add(par.getText());
            }
        } else if (ctx.possible_number_helper() != null) {
            for (LispParser.Possible_number_helperContext p : ctx.possible_number_helper()) {
                minus.getPossibleNumbers().add(visitPossible_number_helper(p));
            }
        }
        return minus;
    }


    @Override
    public Binding visitBinding(LispParser.BindingContext ctx) {
        Binding binding = new Binding();
        binding.setVariable(visitVariables(ctx.variables()));
        binding.setValueHelper(visitValue_helper(ctx.value_helper()));
        return binding;
    }

    @Override
    public VariableBinding visitVariable_binding(LispParser.Variable_bindingContext ctx) {
        VariableBinding variableBinding = new VariableBinding();
        variableBinding.setVariable1(visitVariables(ctx.variables().get(0)));
        variableBinding.setVariable2(visitVariables(ctx.variables().get(1)));
        return variableBinding;
    }

    @Override
    public NilBinding visitNil_binding(LispParser.Nil_bindingContext ctx) {
        NilBinding nilBinding = new NilBinding();
        nilBinding.setVariable(visitVariables(ctx.variables()));
        return nilBinding;
    }

    @Override
    public Let visitLet(LispParser.LetContext ctx) {
        Let let = new Let();
        if (ctx.binding() != null) {
            for (LispParser.BindingContext binding : ctx.binding()) {
                let.getBinding().add(visitBinding(binding));
            }
        }
        if (ctx.variable_binding() != null) {
            for (LispParser.Variable_bindingContext variable : ctx.variable_binding()) {
                let.getVariableBinding().add(visitVariable_binding(variable));
            }
        }
        if (ctx.nil_binding() != null) {
            for (LispParser.Nil_bindingContext nil : ctx.nil_binding()) {
                let.getNilBinding().add(visitNil_binding(nil));
            }
        }
        return let;
    }

    @Override
    public LetStar visitLet_star(LispParser.Let_starContext ctx) {
        LetStar let = new LetStar();
        if (ctx.binding() != null) {
            for (LispParser.BindingContext binding : ctx.binding()) {
                let.getBinding().add(visitBinding(binding));
            }
        }
        if (ctx.variable_binding() != null) {
            for (LispParser.Variable_bindingContext variable : ctx.variable_binding()) {
                let.getVariableBinding().add(visitVariable_binding(variable));
            }
        }
        if (ctx.nil_binding() != null) {
            for (LispParser.Nil_bindingContext nil : ctx.nil_binding()) {
                let.getNilBinding().add(visitNil_binding(nil));
            }
        }
        return let;
    }

    @Override
    public Defvar visitDefvar(LispParser.DefvarContext ctx) {
        Defvar defvar = new Defvar();
        defvar.setName(ctx.SPECIAL_VARIABLE().getText());
        defvar.setPossibleNumberHelper(visitPossible_number_helper(ctx.possible_number_helper()));
        return defvar;
    }

    @Override
    public FunctionOperation visitFunction_operation(LispParser.Function_operationContext ctx) {
        FunctionOperation functionOperation = new FunctionOperation();
        if (ctx.calling_functions() != null) {
            functionOperation.setCallingFunction(visitCalling_functions(ctx.calling_functions()));
        }
        if (ctx.defining_function() != null) {
            functionOperation.setDefiningFunction(visitDefining_function(ctx.defining_function()));
        }
        return functionOperation;
    }

    @Override
    public DefiningFunction visitDefining_function(LispParser.Defining_functionContext ctx) {
        DefiningFunction definingFunction = new DefiningFunction();
        definingFunction.setFunctionName(ctx.IDENTIFIER().get(0).getText());
        int i = 0;
        for (TerminalNode s : ctx.IDENTIFIER()) {
            if (i == 0) {
                i++;
                continue;
            }
            definingFunction.getParameters().add(s.getText());
        }
        if (ctx.key_function() != null) {
            for (LispParser.Key_functionContext key : ctx.key_function()) {
                definingFunction.getKeyFunctions().add(visitKey_function(key));
            }
        }
        if (ctx.rest_function() != null) {
            for (LispParser.Rest_functionContext key : ctx.rest_function()) {
                definingFunction.getRestFunctions().add(visitRest_function(key));
            }
        }
        if (ctx.option_function() != null) {
            for (LispParser.Option_functionContext key : ctx.option_function()) {
                definingFunction.getOptionFunctions().add(visitOption_function(key));
            }
        }
        return definingFunction;
    }

    @Override
    public CallingFunction visitCalling_functions(LispParser.Calling_functionsContext ctx) {
        CallingFunction callingFunction = new CallingFunction();
        callingFunction.setName(ctx.IDENTIFIER().getText());
        if (ctx.keyword_number_helper() != null) {
            for (LispParser.Keyword_number_helperContext key : ctx.keyword_number_helper()) {
                callingFunction.getKeywordNumberHelperList().add(visitKeyword_number_helper(key));
            }
        }
        return callingFunction;
    }

    @Override
    public KeywordNumberHelper visitKeyword_number_helper(LispParser.Keyword_number_helperContext ctx) {
        KeywordNumberHelper keywordNumberHelper = new KeywordNumberHelper();
        if (ctx.KEYWORD() != null) {
            keywordNumberHelper.setKeyword(ctx.KEYWORD().getText());
        }
        keywordNumberHelper.setNumber(ctx.NUMBER().getText());
        return keywordNumberHelper;
    }

    @Override
    public OptionFunction visitOption_function(LispParser.Option_functionContext ctx) {
        OptionFunction optionFunction = new OptionFunction();
        if (ctx.binding() != null) {
            optionFunction.setBinding(visitBinding(ctx.binding()));
        } else if (ctx.IDENTIFIER() != null) {
            optionFunction.setIdentifier(ctx.IDENTIFIER().getText());
        }
        return optionFunction;
    }

    @Override
    public RestFunction visitRest_function(LispParser.Rest_functionContext ctx) {
        RestFunction restFunction = new RestFunction();
        if (ctx.binding() != null) {
            restFunction.setBinding(visitBinding(ctx.binding()));
        } else if (ctx.IDENTIFIER() != null) {
            restFunction.setIdentifier(ctx.IDENTIFIER().getText());
        }
        return restFunction;
    }

    @Override
    public KeyFunction visitKey_function(LispParser.Key_functionContext ctx) {
        KeyFunction keyFunction = new KeyFunction();
        if (ctx.binding() != null) {
            keyFunction.setBinding(visitBinding(ctx.binding()));
        } else if (ctx.IDENTIFIER() != null) {
            keyFunction.setIdentifier(ctx.IDENTIFIER().getText());
        }
        return keyFunction;
    }

    @Override
    public ListOperation visitList_operation(LispParser.List_operationContext ctx) {
        ListOperation listOperation = new ListOperation();
        if (ctx.list() != null) {
            listOperation.setList(visitList(ctx.list()));
        } else if (ctx.pop() != null) {
            listOperation.setPop(visitPop(ctx.pop()));
        } else if (ctx.push() != null) {
            listOperation.setPush(visitPush(ctx.push()));
        }
        return listOperation;
    }

    @Override
    public ListClass visitList(LispParser.ListContext ctx) {
        ListClass listClass = new ListClass();
        if (ctx.atom_helper() != null) {
            for (LispParser.Atom_helperContext atom_helper : ctx.atom_helper()) {
                listClass.getAtomHelper().add(visitAtom_helper(atom_helper));
            }
        }
        if (ctx.NIL() != null) {
            for (TerminalNode s : ctx.NIL()) {
                listClass.getNil().add(s.getText());

            }
        }
        return listClass;
    }

    @Override
    public Pop visitPop(LispParser.PopContext ctx) {
        Pop pop = new Pop();
        pop.setVariable(visitVariables(ctx.variables()));
        return pop;
    }

    @Override
    public Push visitPush(LispParser.PushContext ctx) {
        Push push = new Push();
        if (ctx.atom_helper() != null) {
            push.setAtomHelper(visitAtom_helper(ctx.atom_helper()));
        }
        if (ctx.variables() != null) {
            push.setVariable(visitVariables(ctx.variables()));
        }
        return push;
    }

    @Override
    public PossibleNumberHelper visitPossible_number_helper(LispParser.Possible_number_helperContext ctx) {
        PossibleNumberHelper possibleNumberHelper = new PossibleNumberHelper();
        if (ctx.NUMBER() != null) {
            possibleNumberHelper.setNumber(ctx.NUMBER().getText());
        } else if (ctx.variables() != null) {
            possibleNumberHelper.setVariable(visitVariables(ctx.variables()));
        } else if (ctx.program() != null) {
            possibleNumberHelper.setProgram(visitProgram(ctx.program()));
        }
        return possibleNumberHelper;

    }

    @Override
    public Variable visitVariables(LispParser.VariablesContext ctx) {
        Variable variable = new Variable();
        if (ctx.SPECIAL_VARIABLE() != null) {
            variable.setSpecialVariable(ctx.SPECIAL_VARIABLE().getText());
        } else if (ctx.IDENTIFIER() != null) {
            variable.setIdentifier(ctx.IDENTIFIER().getText());
        }
        return variable;

    }

    @Override
    public MathOperation visitMath_operation(LispParser.Math_operationContext ctx) {
        MathOperation mathOperation = new MathOperation();
        if (ctx.sum() != null) {
            mathOperation.setSum(visitSum(ctx.sum()));
        } else if (ctx.minus() != null) {
            mathOperation.setMinus(visitMinus(ctx.minus()));
        } else if (ctx.multiply() != null) {
            mathOperation.setMultiply(visitMultiply(ctx.multiply()));
        } else if (ctx.div() != null) {
            mathOperation.setDiv(visitDiv(ctx.div()));
        } else if (ctx.modulas() != null) {
            mathOperation.setModulas(visitModulas(ctx.modulas()));
        } else if (ctx.floor() != null) {
            mathOperation.setFloor(visitFloor(ctx.floor()));
        } else if (ctx.ceiling() != null) {
            mathOperation.setCeiling(visitCeiling(ctx.ceiling()));
        } else if (ctx.sin() != null) {
            mathOperation.setSin(visitSin(ctx.sin()));
        } else if (ctx.cos() != null) {
            mathOperation.setCos(visitCos(ctx.cos()));
        } else if (ctx.tan() != null) {
            mathOperation.setTan(visitTan(ctx.tan()));
        } else if (ctx.sqrt() != null) {
            mathOperation.setSqrt(visitSqrt(ctx.sqrt()));
        } else if (ctx.exp() != null) {
            mathOperation.setExp(visitExp(ctx.exp()));
        } else if (ctx.expt() != null) {
            mathOperation.setExpt(visitExpt(ctx.expt()));
        } else if (ctx.evenp() != null) {
            mathOperation.setEvenp(visitEvenp(ctx.evenp()));
        }
        return mathOperation;
    }

    @Override
    public Evenp visitEvenp(LispParser.EvenpContext ctx) {
        Evenp evenp = new Evenp();
        if (ctx.NUMBER() != null) {
            evenp.setNumber(ctx.NUMBER().getText());
        } else if (ctx.IDENTIFIER() != null) {
            evenp.setIdentifier(ctx.IDENTIFIER().getText());
        }
        return evenp;
    }

    @Override
    public Expt visitExpt(LispParser.ExptContext ctx) {
        Expt expt = new Expt();
        if (ctx.x != null) {
            expt.setNumber1(ctx.x.getText());
            expt.setNumber1(ctx.y.getText());
        } else if (ctx.possible_number_helper() != null) {
            expt.setPossibleNumberHelper1(visitPossible_number_helper(ctx.possible_number_helper().get(0)));
            expt.setPossibleNumberHelper2(visitPossible_number_helper(ctx.possible_number_helper().get(1)));

        }
        return expt;
    }

    @Override
    public Sin visitSin(LispParser.SinContext ctx) {
        Sin sin = new Sin();
        if (ctx.NUMBER() != null) {
            sin.setNumber(ctx.NUMBER().getText());
        } else if (ctx.possible_number_helper() != null) {
            sin.setPossibleNumberHelper(visitPossible_number_helper(ctx.possible_number_helper()));
        }
        return sin;
    }

    @Override
    public Cos visitCos(LispParser.CosContext ctx) {
        Cos cos = new Cos();
        if (ctx.NUMBER() != null) {
            cos.setNumber(ctx.NUMBER().getText());
        } else if (ctx.possible_number_helper() != null) {
            cos.setPossibleNumberHelper(visitPossible_number_helper(ctx.possible_number_helper()));
        }
        return cos;
    }

    @Override
    public Tan visitTan(LispParser.TanContext ctx) {
        Tan tan = new Tan();
        if (ctx.NUMBER() != null) {
            tan.setNumber(ctx.NUMBER().getText());
        } else if (ctx.possible_number_helper() != null) {
            tan.setPossibleNumberHelper(visitPossible_number_helper(ctx.possible_number_helper()));
        }
        return tan;
    }

    @Override
    public Sqrt visitSqrt(LispParser.SqrtContext ctx) {
        Sqrt sqrt = new Sqrt();
        if (ctx.NUMBER() != null) {
            sqrt.setNumber(ctx.NUMBER().getText());
        } else if (ctx.possible_number_helper() != null) {
            sqrt.setPossibleNumberHelper(visitPossible_number_helper(ctx.possible_number_helper()));
        }
        return sqrt;
    }

    @Override
    public Exp visitExp(LispParser.ExpContext ctx) {
        Exp exp = new Exp();
        if (ctx.NUMBER() != null) {
            exp.setNumber(ctx.NUMBER().getText());
        } else if (ctx.possible_number_helper() != null) {
            exp.setPossibleNumberHelper(visitPossible_number_helper(ctx.possible_number_helper()));
        }
        return exp;
    }

    @Override
    public Floor visitFloor(LispParser.FloorContext ctx) {
        Floor floor = new Floor();
        if (ctx.NUMBER() != null) {
            floor.setNumber(ctx.NUMBER().getText());
        } else if (ctx.possible_number_helper() != null) {
            floor.setPossibleNumberHelper(visitPossible_number_helper(ctx.possible_number_helper()));
        }
        return floor;
    }

    @Override
    public Ceiling visitCeiling(LispParser.CeilingContext ctx) {
        Ceiling ceiling = new Ceiling();
        if (ctx.NUMBER() != null) {
            ceiling.setNumber(ctx.NUMBER().getText());
        } else if (ctx.possible_number_helper() != null) {
            ceiling.setPossibleNumberHelper(visitPossible_number_helper(ctx.possible_number_helper()));
        }
        return ceiling;
    }

    @Override
    public Modulas visitModulas(LispParser.ModulasContext ctx) {
        Modulas modulas = new Modulas();
        if (ctx.NUMBER() != null) {
            modulas.setNumber1(ctx.x.getText());
            modulas.setNumber2(ctx.y.getText());
        } else if (ctx.possible_number_helper() != null) {
            modulas.setPossibleNumberHelper1(visitPossible_number_helper(ctx.possible_number_helper().get(0)));
            modulas.setPossibleNumberHelper1(visitPossible_number_helper(ctx.possible_number_helper().get(1)));
        }
        return modulas;
    }

    @Override
    public Div visitDiv(LispParser.DivContext ctx) {
        Div div = new Div();
        if (ctx.x != null) {
            for (Token par : ctx.y) {
                div.getParameters().add(par.getText());
            }
        } else if (ctx.possible_number_helper() != null) {
            for (LispParser.Possible_number_helperContext p : ctx.possible_number_helper()) {
                div.getPossibleNumbers().add(visitPossible_number_helper(p));
            }
        }
        return div;
    }

    @Override
    public Multiply visitMultiply(LispParser.MultiplyContext ctx) {
        Multiply multiply = new Multiply();

        if (ctx.x != null) {
            for (Token par : ctx.y) {
                multiply.getParameters().add(par.getText());
            }
        } else if (ctx.possible_number_helper() != null) {
            for (LispParser.Possible_number_helperContext p : ctx.possible_number_helper()) {
                multiply.getPossibleNumbers().add(visitPossible_number_helper(p));
            }
        }
        return multiply;
    }

    @Override
    public Append visitAppend(LispParser.AppendContext ctx) {
        Append append = new Append();
        if (ctx.quote_form().get(0) != null) {
            append.setQuoteForm1(visitQuote_form(ctx.quote_form().get(0)));
        }
        if (ctx.quote_form().get(1)!= null) {
            append.setQuoteForm2(visitQuote_form(ctx.quote_form().get(1)));
        }
        return append;
    }

    @Override
    public Reverse visitReverse(LispParser.ReverseContext ctx) {
        Reverse reverse = new Reverse() ;
        if (ctx.quote_form() != null) {
            reverse.setQuoteForm(visitQuote_form(ctx.quote_form()));
        }
        return reverse;
    }

    @Override
    public Member visitMember(LispParser.MemberContext ctx) {
        Member member = new Member();
        if(ctx.quote_form().get(0) != null){
            member.setQuoteForm1(visitQuote_form(ctx.quote_form().get(0)));
        }
        if(ctx.quote_form().get(1) != null){
            member.setQuoteForm1(visitQuote_form(ctx.quote_form().get(1)));
        }
        return member;
    }

    @Override
    public Subsetp visitSubsetp(LispParser.SubsetpContext ctx) {
        Subsetp subsetp = new Subsetp();
        if(ctx.quote_form().get(0) != null){
            subsetp.setQuoteForm1(visitQuote_form(ctx.quote_form().get(0)));
        }
        if(ctx.quote_form().get(1) != null){
            subsetp.setQuoteForm1(visitQuote_form(ctx.quote_form().get(1)));
        }
        return subsetp;
    }

    @Override
    public Intersection visitIntersection(LispParser.IntersectionContext ctx) {
        Intersection intersection = new Intersection();
        if(ctx.quote_form().get(0) != null){
            intersection.setQuoteForm1(visitQuote_form(ctx.quote_form().get(0)));
        }
        if(ctx.quote_form().get(1) != null){
            intersection.setQuoteForm1(visitQuote_form(ctx.quote_form().get(1)));
        }
        return intersection;
    }

    @Override
    public Union visitUnion(LispParser.UnionContext ctx) {
        Union union = new Union();
        if(ctx.quote_form().get(0) != null){
            union.setQuoteForm1(visitQuote_form(ctx.quote_form().get(0)));
        }
        if(ctx.quote_form().get(1) != null){
            union.setQuoteForm1(visitQuote_form(ctx.quote_form().get(1)));
        }
        return union;
    }

    @Override
    public Find visitFind(LispParser.FindContext ctx) {
        Find find = new Find();
        if(ctx.quote_form().get(0) != null){
            find.setQuoteForm1(visitQuote_form(ctx.quote_form().get(0)));
        }
        if(ctx.quote_form().get(1) != null){
            find.setQuoteForm1(visitQuote_form(ctx.quote_form().get(1)));
        }
        if(ctx.list() != null){
            find.setListClass(visitList(ctx.list()));
        }
        return find;
    }

    @Override
    public SetDifference visitSet_difference(LispParser.Set_differenceContext ctx) {
        SetDifference setDifference = new SetDifference();
        if(ctx.quote_form().get(0) != null){
            setDifference.setQuoteForm1(visitQuote_form(ctx.quote_form().get(0)));
        }
        if(ctx.quote_form().get(1) != null){
            setDifference.setQuoteForm1(visitQuote_form(ctx.quote_form().get(1)));
        }
        return setDifference;
    }

    @Override
    public Cons visitCons(LispParser.ConsContext ctx) {
        Cons cons = new Cons();
        if(ctx.possible_number_helper().get(0) != null){
            cons.setPossibleNumberHelper1(visitPossible_number_helper(ctx.possible_number_helper().get(0)));
        }
        if(ctx.possible_number_helper().get(1) != null){
            cons.setPossibleNumberHelper1(visitPossible_number_helper(ctx.possible_number_helper().get(1)));
        }
        if(ctx.NIL().get(0) != null){
            for(TerminalNode p  : ctx.NIL()){
                cons.setNull1(p.getText());
            }
        }
        if(ctx.NIL().get(1) != null){
            for(TerminalNode p  : ctx.NIL()){
                cons.setNull2(p.getText());

            }
        }
        return cons;
    }

    @Override
    public QuoteForm visitQuote_form(LispParser.Quote_formContext ctx) {
        QuoteForm quoteForm = new QuoteForm();
        if (ctx.atom_helper() != null) {
            for (LispParser.Atom_helperContext p : ctx.atom_helper()) {
                quoteForm.getAtomHelper().add(visitAtom_helper(p));
            }
        }
        return quoteForm;
    }

    @Override
    public AtomHelper visitAtom_helper(LispParser.Atom_helperContext ctx) {
        AtomHelper atomHelper = new AtomHelper();
        if (ctx.possible_number_helper() != null) {
            atomHelper.setPossibleNumberHelper(visitPossible_number_helper(ctx.possible_number_helper()));
        } else if (ctx.STRING() != null) {
            atomHelper.setString(ctx.STRING().getText());
        }
        return atomHelper;
    }

    @Override
    public Setq visitSetq(LispParser.SetqContext ctx) {
        Setq setq = new Setq();
        for (LispParser.Identifier_value_qoute_pairContext p : ctx.identifier_value_qoute_pair()) {
            setq.getIdentifierValueQuotePair().add(visitIdentifier_value_qoute_pair(p));
        }
        return setq;
    }


    @Override
    public IdentifierValueQuotePair visitIdentifier_value_qoute_pair(LispParser.Identifier_value_qoute_pairContext ctx) {
        IdentifierValueQuotePair pair = new IdentifierValueQuotePair();
        pair.setIdentifier(ctx.IDENTIFIER().getText());
        if (ctx.quote_form() != null) {
            pair.setQuoteForm(visitQuote_form(ctx.quote_form()));
        } else if (ctx.value_helper() != null) {
            pair.setValueHelper(visitValue_helper(ctx.value_helper()));
        }
        return pair;
    }

    @Override
    public ValueHelper visitValue_helper(LispParser.Value_helperContext ctx) {
        ValueHelper valueHelper = new ValueHelper();
        if (ctx.STRING() != null) {
            valueHelper.setString(ctx.STRING().getText());
        } else if (ctx.NUMBER() != null) {
            valueHelper.setNumber(ctx.NUMBER().getText());
        } else if (ctx.program() != null) {
            valueHelper.setProgram(visitProgram(ctx.program()));
        }
        return valueHelper;
    }

    @Override
    public IfStatement visitIf_statement(LispParser.If_statementContext ctx) {
        IfStatement ifStatement = new IfStatement();
        if (ctx.if_statement1() != null) {
            ifStatement.setIfStatement1(visitIf_statement1(ctx.if_statement1()));
        }
        if (ctx.if_statement2() != null) {
            ifStatement.setIfStatement2(visitIf_statement2(ctx.if_statement2()));
        }
        if (ctx.if_statement3() != null) {
            ifStatement.setIfStatement3(visitIf_statement3(ctx.if_statement3()));
        }
        return ifStatement;
    }

    @Override
    public IfStatement1 visitIf_statement1(LispParser.If_statement1Context ctx) {
        IfStatement1 ifStatement1 = new IfStatement1();
        ifStatement1.setCondition1(visitCondition_helper(ctx.condition_helper(0)));
        ifStatement1.setCondition2(visitCondition_helper(ctx.condition_helper(1)));
        ifStatement1.setCondition3(visitCondition_helper(ctx.condition_helper(2)));

        return ifStatement1;
    }

    @Override
    public ConditionHelper visitCondition_helper(LispParser.Condition_helperContext ctx) {
        ConditionHelper conditionHelper = new ConditionHelper();
        if (ctx.T() != null) {
            conditionHelper.setT(ctx.T().getText());
        } else if (ctx.NIL() != null) {
            conditionHelper.setNil(ctx.NIL().getText());
        } else if (ctx.possible_number_helper() != null) {
            conditionHelper.setPossibleNumberHelper(visitPossible_number_helper(ctx.possible_number_helper()));
        }
        return conditionHelper;
    }


    @Override
    public IfStatement2 visitIf_statement2(LispParser.If_statement2Context ctx) {
        IfStatement2 ifStatement2 = new IfStatement2();
        if (ctx.comparison_type() != null) {
            ifStatement2.setComparisonType(visitComparison_type(ctx.comparison_type()));
        }
        if (ctx.expression_sequence() != null) {
            for (LispParser.Expression_sequenceContext p : ctx.expression_sequence()) {
                ifStatement2.getExpressionSequences().add(visitExpression_sequence(p));
            }
        }
        return ifStatement2;
    }

    @Override
    public ComparisonType visitComparison_type(LispParser.Comparison_typeContext ctx) {
        ComparisonType comparisonType = new ComparisonType();
        comparisonType.setCondition(visitCondition(ctx.condition()));
        return comparisonType;
    }

    @Override
    public Condition visitCondition(LispParser.ConditionContext ctx) {
        Condition condition = new Condition();
        for (TerminalNode numberNode : ctx.NUMBER()) {
            condition.getNumber().add(numberNode.getText());
        }
        for (TerminalNode identifierNode : ctx.IDENTIFIER()) {
            condition.getIdentifier().add(identifierNode.getText());
        }

        if (ctx.comparsion() != null) {
            for (LispParser.ComparsionContext comparsionCtx : ctx.comparsion()) {
                condition.getComparsion().add(visitComparsion(comparsionCtx));
            }
        }
        return condition;
    }


    @Override
    public Comparsion visitComparsion(LispParser.ComparsionContext ctx) {
        Comparsion comparsion = new Comparsion();
        if (ctx.greater_than() != null) {
            comparsion.setGreaterThan(visitGreater_than(ctx.greater_than()));
        }
        if (ctx.less_than() != null) {
            comparsion.setLessThan(visitLess_than(ctx.less_than()));
        }
        if (ctx.greater_than_equals() != null) {
            comparsion.setGreaterOrEqual(visitGreater_than_equals(ctx.greater_than_equals()));
        }
        if (ctx.less_than_equals() != null) {
            comparsion.setLessOrEqual(visitLess_than_equals(ctx.less_than_equals()));
        }
        return comparsion;
    }

    @Override
    public GreaterThan visitGreater_than(LispParser.Greater_thanContext ctx) {
        GreaterThan greaterThan = new GreaterThan();
        if (ctx.either(0) != null) {
            greaterThan.setEither1(visitEither(ctx.either(0)));
        }

        if (ctx.either(1) != null) {
            greaterThan.setEither2(visitEither(ctx.either(1)));
        }
        return greaterThan;
    }


    @Override
    public LessOrEqual visitLess_than_equals(LispParser.Less_than_equalsContext ctx) {
        LessOrEqual lessThan = new LessOrEqual();
        if (ctx.either(0) != null) {
            lessThan.setEither1(visitEither(ctx.either(0)));
        }

        if (ctx.either(1) != null) {
            lessThan.setEither2(visitEither(ctx.either(1)));
        }
        return lessThan;
    }

    @Override
    public LessThan visitLess_than(LispParser.Less_thanContext ctx) {
        LessThan lessThan = new LessThan();
        if (ctx.either(0) != null) {
            lessThan.setEither1(visitEither(ctx.either(0)));
        }

        if (ctx.either(1) != null) {
            lessThan.setEither2(visitEither(ctx.either(1)));
        }
        return lessThan;
    }

    @Override
    public GreaterOrEqual visitGreater_than_equals(LispParser.Greater_than_equalsContext ctx) {
        GreaterOrEqual greaterOrEqual = new GreaterOrEqual();
        if (ctx.either(0) != null) {
            greaterOrEqual.setEither1(visitEither(ctx.either(0)));
        }

        if (ctx.either(1) != null) {
            greaterOrEqual.setEither2(visitEither(ctx.either(1)));
        }
        return greaterOrEqual;
    }


    @Override
    public ExpressionSequence visitExpression_sequence(LispParser.Expression_sequenceContext ctx) {
        ExpressionSequence expressionSequence = new ExpressionSequence();
        if (ctx.program() != null) {
            expressionSequence.setProgram(visitProgram(ctx.program()));
        } else if (ctx.multiple_expression() != null) {
            expressionSequence.setExpression(visitMultiple_expression(ctx.multiple_expression()));
        }
        return expressionSequence;
    }

    @Override
    public MultipleExpression visitMultiple_expression(LispParser.Multiple_expressionContext ctx) {
        MultipleExpression multipleExpression = new MultipleExpression();
        if (ctx.program() != null) {
            for (LispParser.ProgramContext p : ctx.program()) {
                multipleExpression.getProgram().add(visitProgram(p));
            }
        }
        return multipleExpression;
    }

    @Override
    public ComparisonType2 visitComparison_type2(LispParser.Comparison_type2Context ctx) {
        ComparisonType2 comparisonType2 = new ComparisonType2();
        if (ctx.T() != null) {
            comparisonType2.setTrue(ctx.T().getText());
        } else if (ctx.NIL() != null) {
            comparisonType2.setNil(ctx.NIL().getText());
        } else if (ctx.condition_helper() != null) {
            comparisonType2.setCondition(visitCondition_helper(ctx.condition_helper()));
        }
        return comparisonType2;
    }

    @Override
    public IfStatement3 visitIf_statement3(LispParser.If_statement3Context ctx) {
        IfStatement3 ifStatement3 = new IfStatement3();
        ifStatement3.setComparisonType(visitComparison_type2(ctx.comparison_type2()));

        for (LispParser.Expression_sequenceContext p : ctx.expression_sequence()) {
            ifStatement3.getExpressionSequences().add(visitExpression_sequence(p));
        }
        return ifStatement3;
    }

    @Override
    public Print visitPrint(LispParser.PrintContext ctx) {
        Print print = new Print();
        if (ctx.STRING() != null) {
            print.setString(ctx.STRING().getText());
        } else if (ctx.NIL() != null) {
            print.setNil(ctx.NIL().getText());
        } else if (ctx.list() != null) {
            print.setList(visitList(ctx.list()));
        } else if (ctx.either() != null) {
            print.setEither(visitEither(ctx.either()));
        }
        return print;
    }

    @Override
    public Eq visitEq(LispParser.EqContext ctx) {
        Eq eq = new Eq();
        if (ctx.quote_form().get(0) != null) {
            eq.setQuoteForm1(visitQuote_form(ctx.quote_form().get(0)));
        }
        if (ctx.quote_form().get(1)!= null) {
            eq.setQouteForm2(visitQuote_form(ctx.quote_form().get(1)));
        }
        return eq;
    }


    @Override
    public Program visitProgram(LispParser.ProgramContext ctx) {
        Program program = new Program();

        if (ctx.math_operation() != null) {
            program.setMathOperation(visitMath_operation(ctx.math_operation()));
        } else if (ctx.setq() != null) {
            program.setSetQ(visitSetq(ctx.setq()));
        } else if (ctx.let() != null) {
            program.setLet(visitLet(ctx.let()));
        } else if (ctx.let_star() != null) {
            program.setLetStar(visitLet_star(ctx.let_star()));
        } else if (ctx.list_operation() != null) {
            program.setListOperation(visitList_operation(ctx.list_operation()));
        } else if (ctx.defvar() != null) {
            program.setDefvar(visitDefvar(ctx.defvar()));
        } else if (ctx.array() != null) {
            program.setArray(visitArray(ctx.array()));
        } else if (ctx.string() != null) {
            program.setStringClass(visitString(ctx.string()));
        }else if(ctx.print() != null){
            program.setPrint(visitPrint(ctx.print()));
        } else if(ctx.if_statement() != null){
            program.setIfStatement(visitIf_statement(ctx.if_statement()));
        } else if(ctx.comparsion() != null){
            program.setComparsion(visitComparsion(ctx.comparsion()));
        } else if(ctx.condition() != null){
            program.setCondition(visitCondition(ctx.condition()));
        }else if (ctx.eq() != null){
            program.setEq(visitEq(ctx.eq()));
        }
        else  if (ctx.reverse() != null){
            program.setReverse(visitReverse(ctx.reverse()));
        }
        else if (ctx.member() != null){
            program.setMember(visitMember(ctx.member()));
        }
        else if (ctx.subsetp() != null){
            program.setSubsetp(visitSubsetp(ctx.subsetp()));
        }
        else if (ctx.intersection() != null){
            program.setIntersection(visitIntersection(ctx.intersection()));
        }
        else if (ctx.union() != null){
            program.setUnion(visitUnion(ctx.union()));
        }
        else if (ctx.find() != null){
            program.setFind(visitFind(ctx.find()));
        }

        return program;
    }


}