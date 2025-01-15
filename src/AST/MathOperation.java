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
        StringBuilder result = new StringBuilder("MathOperation{");
        boolean firstField = true;

        if (minus != null) {
            result.append("minus=").append(minus);
            firstField = false;
        }
        if (sum != null) {
            if (!firstField) result.append(", ");
            result.append("sum=").append(sum);
            firstField = false;
        }
        if (multiply != null) {
            if (!firstField) result.append(", ");
            result.append("multiply=").append(multiply);
            firstField = false;
        }
        if (div != null) {
            if (!firstField) result.append(", ");
            result.append("div=").append(div);
            firstField = false;
        }
        if (modulas != null) {
            if (!firstField) result.append(", ");
            result.append("modulas=").append(modulas);
            firstField = false;
        }
        if (floor != null) {
            if (!firstField) result.append(", ");
            result.append("floor=").append(floor);
            firstField = false;
        }
        if (ceiling != null) {
            if (!firstField) result.append(", ");
            result.append("ceiling=").append(ceiling);
            firstField = false;
        }
        if (sin != null) {
            if (!firstField) result.append(", ");
            result.append("sin=").append(sin);
            firstField = false;
        }
        if (cos != null) {
            if (!firstField) result.append(", ");
            result.append("cos=").append(cos);
            firstField = false;
        }
        if (tan != null) {
            if (!firstField) result.append(", ");
            result.append("tan=").append(tan);
            firstField = false;
        }
        if (sqrt != null) {
            if (!firstField) result.append(", ");
            result.append("sqrt=").append(sqrt);
            firstField = false;
        }
        if (exp != null) {
            if (!firstField) result.append(", ");
            result.append("exp=").append(exp);
            firstField = false;
        }
        if (expt != null) {
            if (!firstField) result.append(", ");
            result.append("expt=").append(expt);
            firstField = false;
        }
        if (evenp != null) {
            if (!firstField) result.append(", ");
            result.append("evenp=").append(evenp);
        }

        result.append('}');
        return result.toString();
    }

}
