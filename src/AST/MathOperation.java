package AST;

public class MathOperation {
//    math_operation: minus | sum  | multiply  | div  | modulas  | floor  | ceiling  | sin  | cos  | tan  | sqrt  | exp  | expt|evenp ;


    Minus minus;
    Sum sum;
    Multiply multiply;
    Div div;
    Modulas modulas;
    Floor floor;
    Ceiling ceiling;
    Sin sin;
    Cos cos;
    Tan tan;
    Sqrt sqrt;
    Exp exp;
    Expt expt;
    Evenp evenp;

    public Minus getMinus() {
        return minus;
    }

    public void setMinus(Minus minus) {
        this.minus = minus;
    }

    public Sum getSum() {
        return sum;
    }

    public void setSum(Sum sum) {
        this.sum = sum;
    }

    public Multiply getMultiply() {
        return multiply;
    }

    public void setMultiply(Multiply multiply) {
        this.multiply = multiply;
    }

    public Div getDiv() {
        return div;
    }

    public void setDiv(Div div) {
        this.div = div;
    }

    public Modulas getModulas() {
        return modulas;
    }

    public void setModulas(Modulas modulas) {
        this.modulas = modulas;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public Sin getSin() {
        return sin;
    }

    public void setSin(Sin sin) {
        this.sin = sin;
    }

    public Cos getCos() {
        return cos;
    }

    public void setCos(Cos cos) {
        this.cos = cos;
    }

    public Tan getTan() {
        return tan;
    }

    public void setTan(Tan tan) {
        this.tan = tan;
    }

    public Sqrt getSqrt() {
        return sqrt;
    }

    public void setSqrt(Sqrt sqrt) {
        this.sqrt = sqrt;
    }

    public Exp getExp() {
        return exp;
    }

    public void setExp(Exp exp) {
        this.exp = exp;
    }

    public Expt getExpt() {
        return expt;
    }

    public void setExpt(Expt expt) {
        this.expt = expt;
    }

    public Evenp getEvenp() {
        return evenp;
    }

    public void setEvenp(Evenp evenp) {
        this.evenp = evenp;
    }

    @Override
    public String toString() {
        return "MathOperation{" +
                "minus=" + minus +
                ", sum=" + sum +
                ", multiply=" + multiply +
                ", div=" + div +
                ", modulas=" + modulas +
                ", floor=" + floor +
                ", ceiling=" + ceiling +
                ", sin=" + sin +
                ", cos=" + cos +
                ", tan=" + tan +
                ", sqrt=" + sqrt +
                ", exp=" + exp +
                ", expt=" + expt +
                ", evenp=" + evenp +
                '}';
    }
}
