import AST.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

public class VisitorClass extends LispParserBaseVisitor<Object> {

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
        if(ctx.KEYWORD()!= null){
            keywordNumberHelper.setKeyword(ctx.KEYWORD().getText());
        }
        keywordNumberHelper.setNumber(ctx.NUMBER().getText());
        return keywordNumberHelper;
    }

    @Override
    public OptionFunction visitOption_function(LispParser.Option_functionContext ctx) {
        OptionFunction optionFunction = new OptionFunction();
        if(ctx.binding()!=null){
            optionFunction.setBinding(visitBinding(ctx.binding()));
        }
        else if(ctx.IDENTIFIER()!=null){
            optionFunction.setIdentifier(ctx.IDENTIFIER().getText());
        }
        return optionFunction;
    }

    @Override
    public RestFunction visitRest_function(LispParser.Rest_functionContext ctx) {
        RestFunction restFunction = new RestFunction();
        if(ctx.binding()!=null){
            restFunction.setBinding(visitBinding(ctx.binding()));
        }
        else if(ctx.IDENTIFIER()!=null){
            restFunction.setIdentifier(ctx.IDENTIFIER().getText());
        }
        return restFunction;
    }

    @Override
    public KeyFunction visitKey_function(LispParser.Key_functionContext ctx) {
        KeyFunction keyFunction = new KeyFunction();
        if(ctx.binding()!=null){
            keyFunction.setBinding(visitBinding(ctx.binding()));
        }
        else if(ctx.IDENTIFIER()!=null){
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
    public Program visitProgram(LispParser.ProgramContext ctx) {
        Program program = new Program();

        if (ctx.math_operation() != null) {
            program.setMathOperation(visitMath_operation(ctx.math_operation()));
        }
        if (ctx.setq() != null) {
            program.setSetQ(visitSetq(ctx.setq()));
        }
        if (ctx.let() != null) {
            program.setLet(visitLet(ctx.let()));
        }
        if (ctx.let_star() != null) {
            program.setLetStar(visitLet_star(ctx.let_star()));
        }
        if (ctx.list_operation() != null) {
            program.setListOperation(visitList_operation(ctx.list_operation()));
        }
        return program;
    }


}
