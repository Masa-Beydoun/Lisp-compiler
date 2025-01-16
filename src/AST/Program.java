package AST;


public class Program extends NodeAST {
    MathOperation mathOperation;
    Setq setQ;
    Let let;
    LetStar letStar;
    ListOperation listOperation;
    FunctionOperation functionOperation;
    Defvar defvar;
    ArrayClass array;
    StringClass stringClass;
    Print print;
    IfStatement ifStatement;
    Comparsion comparsion;
    Condition condition;
    Eq eq;
    Reverse reverse;
    Member member;
    Subsetp subsetp;
    Intersection intersection;
    Cons cons;
    Union union;
    Find find;
    Return areturn;
    ReturnFrom returnForm;
    DefStruct defStruct;
    When when;
    Lambda lambda;
    Function function;
    Cdr cdr;
    Car car;
    TemporaryList temporaryList;
    True t;
    Cond cond;
    Case Case;
    Block block;
    Structure structure;
    Format format;
    IterationOperation iterationOperation;
    Do do_exp;
    Return return_exp;
    ReturnFrom returnFrom;
    Error error;
    Funcall funcall;
    Apply apply;
    Mapcar mapcar;
    SortOperation  sortOperation;


    public SortOperation getSortOperation() {
        return sortOperation;
    }

    public void setSortOperation(SortOperation sortOperation) {
        this.sortOperation = sortOperation;
    }

    public ReturnFrom getReturnForm() {
        return returnForm;
    }

    public void setReturnForm(ReturnFrom returnForm) {
        this.returnForm = returnForm;
    }

    public IterationOperation getIterationOperation() {
        return iterationOperation;
    }

    public void setIterationOperation(IterationOperation iterationOperation) {
        this.iterationOperation = iterationOperation;
    }

    public Do getDo_exp() {
        return do_exp;
    }



    public void setDo_exp(Do do_exp) {
        this.do_exp = do_exp;
    }

    public Return getReturn_exp() {
        return return_exp;
    }

    public void setReturn_exp(Return return_exp) {
        this.return_exp = return_exp;
    }

    public ReturnFrom getReturnFrom() {
        return returnFrom;
    }

    public void setReturnFrom(ReturnFrom returnFrom) {
        this.returnFrom = returnFrom;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public Funcall getFuncall() {
        return funcall;
    }

    public void setFuncall(Funcall funcall) {
        this.funcall = funcall;
    }

    public Apply getApply() {
        return apply;
    }

    public void setApply(Apply apply) {
        this.apply = apply;
    }

    public Mapcar getMapcar() {
        return mapcar;
    }

    public void setMapcar(Mapcar mapcar) {
        this.mapcar = mapcar;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public TemporaryList getTemporaryList() {
        return temporaryList;
    }

    public void setTemporaryList(TemporaryList temporaryList) {
        this.temporaryList = temporaryList;
    }

    public True getT() {
        return t;
    }

    public void setT(True t) {
        this.t = t;
    }

    public Cond getCond() {
        return cond;
    }

    public void setCond(Cond cond) {
        this.cond = cond;
    }

    public AST.Case getCase() {
        return Case;
    }

    public void setCase(AST.Case aCase) {
        Case = aCase;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public Structure getStructure() {
        return structure;
    }

    public void setStructure(Structure structure) {
        this.structure = structure;
    }

    public Cdr getCdr() {
        return cdr;
    }

    public void setCdr(Cdr cdr) {
        this.cdr = cdr;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Return getAreturn() {
        return areturn;
    }

    public void setAreturn(Return areturn) {
        this.areturn = areturn;
    }



    public DefStruct getDefStruct() {
        return defStruct;
    }

    public void setDefStruct(DefStruct defStruct) {
        this.defStruct = defStruct;
    }

    public When getWhen() {
        return when;
    }

    public void setWhen(When when) {
        this.when = when;
    }

    public Lambda getLambda() {
        return lambda;
    }

    public void setLambda(Lambda lambda) {
        this.lambda = lambda;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public Find getFind() {
        return find;
    }

    public void setFind(Find find) {
        this.find = find;
    }

    public Union getUnion() {
        return union;
    }

    public void setUnion(Union union) {
        this.union = union;
    }

    public Eq getEq() {
        return eq;
    }

    public void setEq(Eq eq) {
        this.eq = eq;
    }

    public Reverse getReverse() {
        return reverse;
    }

    public void setReverse(Reverse reverse) {
        this.reverse = reverse;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Subsetp getSubsetp() {
        return subsetp;
    }

    public void setSubsetp(Subsetp subsetp) {
        this.subsetp = subsetp;
    }

    public Intersection getIntersection() {
        return intersection;
    }

    public void setIntersection(Intersection intersection) {
        this.intersection = intersection;
    }

    public Cons getCons() {
        return cons;
    }

    public void setCons(Cons cons) {
        this.cons = cons;
    }

    public Print getPrint() {
        return print;
    }

    public void setPrint(Print print) {
        this.print = print;
    }

    public IfStatement getIfStatement() {
        return ifStatement;
    }

    public void setIfStatement(IfStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    public Comparsion getComparsion() {
        return comparsion;
    }

    public void setComparsion(Comparsion comparsion) {
        this.comparsion = comparsion;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public StringClass getStringClass() {
        return stringClass;
    }

    public void setStringClass(StringClass stringClass) {
        this.stringClass = stringClass;
    }

    public ArrayClass getArray() {
        return array;
    }

    public void setArray(ArrayClass array) {
        this.array = array;
    }

    public FunctionOperation getFunctionOperation() {
        return functionOperation;
    }

    public void setFunctionOperation(FunctionOperation functionOperation) {
        this.functionOperation = functionOperation;
    }

    public Defvar getDefvar() {
        return defvar;
    }

    public void setDefvar(Defvar defvar) {
        this.defvar = defvar;
    }

    public ListOperation getListOperation() {
        return listOperation;
    }

    public void setListOperation(ListOperation listOperation) {
        this.listOperation = listOperation;
    }

    public Let getLet() {
        return let;
    }

    public void setLet(Let let) {
        this.let = let;
    }

    public LetStar getLetStar() {
        return letStar;
    }

    public void setLetStar(LetStar letStar) {
        this.letStar = letStar;
    }

    public Setq getSetQ() {
        return setQ;
    }

    public void setSetQ(Setq setQ) {
        this.setQ = setQ;
    }

    public MathOperation getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Program{");
        boolean firstField = true;

        if (mathOperation != null) {
            result.append("mathOperation=").append(mathOperation);
            firstField = false;
        }
        if (setQ != null) {
            if (!firstField) result.append(", ");
            result.append("setQ=").append(setQ);
            firstField = false;
        }
        if (let != null) {
            if (!firstField) result.append(", ");
            result.append("let=").append(let);
            firstField = false;
        }
        if (letStar != null) {
            if (!firstField) result.append(", ");
            result.append("letStar=").append(letStar);
            firstField = false;
        }
        if (listOperation != null) {
            if (!firstField) result.append(", ");
            result.append("listOperation=").append(listOperation);
            firstField = false;
        }
        if (functionOperation != null) {
            if (!firstField) result.append(", ");
            result.append("functionOperation=").append(functionOperation);
            firstField = false;
        }
        if (defvar != null) {
            if (!firstField) result.append(", ");
            result.append("defvar=").append(defvar);
            firstField = false;
        }
        if (array != null) {
            if (!firstField) result.append(", ");
            result.append("array=").append(array);
            firstField = false;
        }
        if (stringClass != null) {
            if (!firstField) result.append(", ");
            result.append("stringClass=").append(stringClass);
            firstField = false;
        }
        if (print != null) {
            if (!firstField) result.append(", ");
            result.append("print=").append(print);
            firstField = false;
        }
        if (ifStatement != null) {
            if (!firstField) result.append(", ");
            result.append("ifStatement=").append(ifStatement);
            firstField = false;
        }
        if (comparsion != null) {
            if (!firstField) result.append(", ");
            result.append("comparsion=").append(comparsion);
            firstField = false;
        }
        if (condition != null) {
            if (!firstField) result.append(", ");
            result.append("condition=").append(condition);
            firstField = false;
        }
        if (eq != null) {
            if (!firstField) result.append(", ");
            result.append("eq=").append(eq);
            firstField = false;
        }
        if (reverse != null) {
            if (!firstField) result.append(", ");
            result.append("reverse=").append(reverse);
            firstField = false;
        }
        if (member != null) {
            if (!firstField) result.append(", ");
            result.append("member=").append(member);
            firstField = false;
        }
        if (subsetp != null) {
            if (!firstField) result.append(", ");
            result.append("subsetp=").append(subsetp);
            firstField = false;
        }
        if (intersection != null) {
            if (!firstField) result.append(", ");
            result.append("intersection=").append(intersection);
            firstField = false;
        }
        if (cons != null) {
            if (!firstField) result.append(", ");
            result.append("cons=").append(cons);
            firstField = false;
        }
        if (union != null) {
            if (!firstField) result.append(", ");
            result.append("union=").append(union);
            firstField = false;
        }
        if (find != null) {
            if (!firstField) result.append(", ");
            result.append("find=").append(find);
            firstField = false;
        }
        if (areturn != null) {
            if (!firstField) result.append(", ");
            result.append("areturn=").append(areturn);
            firstField = false;
        }
        if (returnForm != null) {
            if (!firstField) result.append(", ");
            result.append("returnForm=").append(returnForm);
            firstField = false;
        }
        if (defStruct != null) {
            if (!firstField) result.append(", ");
            result.append("defStruct=").append(defStruct);
            firstField = false;
        }
        if (when != null) {
            if (!firstField) result.append(", ");
            result.append("when=").append(when);
            firstField = false;
        }
        if (lambda != null) {
            if (!firstField) result.append(", ");
            result.append("lambda=").append(lambda);
            firstField = false;
        }
        if (function != null) {
            if (!firstField) result.append(", ");
            result.append("function=").append(function);
            firstField = false;
        }
        if (cdr != null) {
            if (!firstField) result.append(", ");
            result.append("cdr=").append(cdr);
            firstField = false;
        }
        if (car != null) {
            if (!firstField) result.append(", ");
            result.append("car=").append(car);
            firstField = false;
        }
        if (temporaryList != null) {
            if (!firstField) result.append(", ");
            result.append("temporaryList=").append(temporaryList);
            firstField = false;
        }
        if (t != null) {
            if (!firstField) result.append(", ");
            result.append("t=").append(t);
            firstField = false;
        }
        if (cond != null) {
            if (!firstField) result.append(", ");
            result.append("cond=").append(cond);
            firstField = false;
        }
        if (Case != null) {
            if (!firstField) result.append(", ");
            result.append("Case=").append(Case);
            firstField = false;
        }
        if (block != null) {
            if (!firstField) result.append(", ");
            result.append("block=").append(block);
            firstField = false;
        }
        if (structure != null) {
            if (!firstField) result.append(", ");
            result.append("structure=").append(structure);
            firstField = false;
        }
        if (format != null) {
            if (!firstField) result.append(", ");
            result.append("format=").append(format);
            firstField = false;
        }
        if (iterationOperation != null) {
            if (!firstField) result.append(", ");
            result.append("iterationOperation=").append(iterationOperation);
            firstField = false;
        }
        if (do_exp != null) {
            if (!firstField) result.append(", ");
            result.append("do_exp=").append(do_exp);
            firstField = false;
        }
        if (return_exp != null) {
            if (!firstField) result.append(", ");
            result.append("return_exp=").append(return_exp);
            firstField = false;
        }
        if (returnFrom != null) {
            if (!firstField) result.append(", ");
            result.append("returnFrom=").append(returnFrom);
            firstField = false;
        }
        if (error != null) {
            if (!firstField) result.append(", ");
            result.append("error=").append(error);
            firstField = false;
        }
        if (funcall != null) {
            if (!firstField) result.append(", ");
            result.append("funcall=").append(funcall);
            firstField = false;
        }
        if (apply != null) {
            if (!firstField) result.append(", ");
            result.append("apply=").append(apply);
            firstField = false;
        }
        if (mapcar != null) {
            if (!firstField) result.append(", ");
            result.append("mapcar=").append(mapcar);
            firstField = false;
        }
        if (sortOperation != null) {
            if (!firstField) result.append(", ");
            result.append("sortOperation=").append(sortOperation);
        }

        result.append("\n");
        return result.toString();
    }

}
