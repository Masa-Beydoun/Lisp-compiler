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
        return "Program{" +
                "mathOperation=" + mathOperation +
                '}';
    }
}
