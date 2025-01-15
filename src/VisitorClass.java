import AST.*;
import org.antlr.v4.runtime.Token;

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
            sum.setNumber1(ctx.NUMBER.getText());

            for (Token par : ctx.y) {
                sum.getNumber2().add(par.getText());
            }

        } else if (ctx.possible_number_helper() != null) {

            sum.setPossibleNumberHelper(visitPossible_number_helper(ctx.possible_number_helper().get(0)));
            for(LispParser.Possible_number_helperContext p : ctx.possible_number_helper()){
                sum.getPossibleNumbers2().add(visitPossible_number_helper(p));

            }
        }


        return sum;
    }

    @Override
    public PossibleNumberHelper visitPossible_number_helper(LispParser.Possible_number_helperContext ctx) {
        PossibleNumberHelper possibleNumberHelper = new PossibleNumberHelper();
        if(ctx.NUMBER() != null) {
            possibleNumberHelper.setNumber(ctx.NUMBER().getText());
        }
        else if(ctx.variables() != null){
            possibleNumberHelper.setVariable(visitVariables(ctx.variables()));
        }
        else if(ctx.program()!=null){
            possibleNumberHelper.setProgram(visitProgram(ctx.program()));
        }
        return possibleNumberHelper;

    }



    @Override
    public Variable visitVariables(LispParser.VariablesContext ctx) {
        Variable variable = new Variable();
        if(ctx.SPECIAL_VARIABLE()!=null){
            variable.setSpecialVariable(ctx.SPECIAL_VARIABLE().getText());
        }
        else if (ctx.IDENTIFIER()!= null){
            variable.setIdentifier(ctx.IDENTIFIER().getText());
        }
        return variable;

    }

    @Override
    public MathOperation visitMath_operation(LispParser.Math_operationContext ctx) {
        MathOperation mathOperation = new MathOperation();
        if(ctx.sum()!=null){
            mathOperation.setSum(visitSum(ctx.sum()));
        }
        return mathOperation;
    }

    @Override
    public Program visitProgram(LispParser.ProgramContext ctx) {
        Program program = new Program();

        if(ctx.math_operation() != null){
            program.setMathOperation(visitMath_operation(ctx.math_operation()));
        }
        //TODO
        return program;
    }


    // Implement other visit methods as needed...
}
