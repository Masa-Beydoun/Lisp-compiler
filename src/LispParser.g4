parser grammar LispParser;

options { tokenVocab=LispLexer; }

programs : (  program )* | EOF;

program: OPEN_PAREN( setq | temporary_assigment  | let |
         minus | sum  | multiply  | div  | modulas  |
         floor  | ceiling  | sin  | cos  | tan  | sqrt  |
         exp  | expt  |

         cons | car | cdr | list |
         push | pop | defining_function | calling_functions |
         when | comparsion | print |
         return | return_from | block | error |
         do | dotimes | dolist | loop |
         funcall | apply | mapcar | lambda_expression |
         sort | stable_sort) CLOSE_PAREN;



temporary_assigment :  IDENTIFIER NUMBER ;
temporary_list : either*;
setq:   SETQ IDENTIFIER either  ;
let:  LET IDENTIFIER either ;

sum returns [double result]
    : PLUS x=NUMBER y+=NUMBER+ {
        $result = MyClass.parseNumber($x.text);
                for (Token num : $y) {
            $result += MyClass.parseNumber(num.getText());
        }
        System.out.println("Sum is: " + $result);
    }
    |
     PLUS either either+;
minus returns [double result]
    : MINUS x=NUMBER y+=NUMBER+ {
        $result = MyClass.parseNumber($x.text);
        for (Token num : $y) {
            $result -= MyClass.parseNumber(num.getText());
        }
        System.out.println("minus is: " + $result);
    }
    | MINUS either either+;
multiply returns [double result]
    : MULTIPLY x=NUMBER y+=NUMBER+ {
        $result = MyClass.parseNumber($x.text);
        for (Token num : $y) {
            $result *= MyClass.parseNumber(num.getText());
        }
        System.out.println("multiply is: " + $result);
    }
    |MULTIPLY either either+;
div returns [double result]
    : DIV x=NUMBER y+=NUMBER+ {
        $result = MyClass.parseNumber($x.text);
        for (Token num : $y) {
            $result /= MyClass.parseNumber(num.getText());
        }
        System.out.println("div is: " + $result);
    }
    |DIV either either+;
modulas returns [int result]
    : (MODULUS | MOD) x=NUMBER y=NUMBER {
        $result = Integer.parseInt($x.text);
        $result %= Integer.parseInt($y.text);
        System.out.println("modulas is: " + $result);
    }
    |(MODULUS | MOD) either either;
floor returns [int result]
         : FLOOR x=NUMBER  {
             $result = (int)Math.floor(Double.parseDouble($x.text));
             System.out.println("floor is: " + $result);
         }
         |FLOOR either;
ceiling returns [int result]
         :CEILING  x=NUMBER  {
             $result = (int)Math.ceil(Double.parseDouble($x.text));
             System.out.println("ceil is: " + $result);
         }
         |CEILING either;
sin returns [double result]
         : SIN x=NUMBER  {
             $result = Math.sin(MyClass.parseNumber($x.text));
             System.out.println("sin is: " + $result);
         }
         |SIN either;
cos returns [double result]
         : COS x=NUMBER  {
             $result = Math.cos(MyClass.parseNumber($x.text));
             System.out.println("cos is: " + $result);
         }
         |COS either;
tan returns [double result]
         : TAN x=NUMBER  {
             $result = Math.tan(MyClass.parseNumber($x.text));
             System.out.println("tan is: " + $result);
         }
         |TAN either;
sqrt returns [double result]
         : SQRT x=NUMBER  {
             $result = Math.sqrt(MyClass.parseNumber($x.text));
             System.out.println("sqrt is: " + $result);
         }
         |SQRT either;
exp returns [double result]
         : EXP x=NUMBER  {
             $result = Math.exp(MyClass.parseNumber($x.text));
             System.out.println("exp is: " + $result);
         }
         |EXP either;
expt returns [double result]
         : EXPT x=NUMBER  y=NUMBER{
             System.out.println("in expt");
             $result = Math.pow(MyClass.parseNumber($x.text),MyClass.parseNumber($y.text));
             System.out.println("power is: " + $result);
         }
         |EXPT either either;


cons:  (NUMBER | IDENTIFIER) (NUMBER | IDENTIFIER)  ;
car:  (NUMBER | IDENTIFIER)  ;
cdr:  (NUMBER | IDENTIFIER)  ;
list :  LIST (NUMBER | IDENTIFIER | NIL )+  ;
push:  PUSH (NUMBER)? IDENTIFIER;
pop:  POP (NUMBER)? IDENTIFIER;

defining_function :  DEFUN IDENTIFIER  ((OPTIONAL|KEY|REST)? IDENTIFIER)*;
calling_functions :  IDENTIFIER (COLON IDENTIFIER NUMBER)*  ;

//Iteration
dotimes : DOTIMES OPEN_PAREN IDENTIFIER NUMBER (program)* CLOSE_PAREN ;
dolist : DOLIST OPEN_PAREN IDENTIFIER IDENTIFIER? (program)* CLOSE_PAREN ;
loop : LOOP (program)* ;

do : DO OPEN_PAREN iteration_specs* CLOSE_PAREN OPEN_PAREN (termination_condition (program)* ) CLOSE_PAREN ;
iteration_specs : OPEN_PAREN IDENTIFIER NUMBER NUMBER? (program)* CLOSE_PAREN+ ;
termination_condition : OPEN_PAREN condition IDENTIFIER? CLOSE_PAREN ;

//Non-local Exits
return : RETURN either? ;
return_from : RETURN_FROM IDENTIFIER either? ;
block : BLOCK (IDENTIFIER | T | NIL) (program)* ;
error : ERROR STRING (either)* ;

//Funcall, Apply, and Mapcar
funcall : FUNCALL function either+ ;
apply : APPLY function either* OPEN_PAREN list CLOSE_PAREN ;
mapcar : MAPCAR function OPEN_PAREN list CLOSE_PAREN ;

//Lambda
lambda_expression : HASH_TAG SINGLE_QUOTE? OPEN_PAREN LAMBDA OPEN_PAREN parameter_list CLOSE_PAREN program* CLOSE_PAREN ;
parameter_list : IDENTIFIER+ ;

function_reference : HASH_TAG (OPEN_PAREN (either)* CLOSE_PAREN )? ;
function : function_reference | lambda_expression | defining_function;

//Sorting
sort : SORT SINGLE_QUOTE? OPEN_PAREN list_elements CLOSE_PAREN comparison_function ;
stable_sort : STABLE_SORT OPEN_PAREN list_elements CLOSE_PAREN comparison_function ;

comparison_function : HASH_TAG SINGLE_QUOTE? comparison_operator ;
comparison_operator : GREATER_THAN | LESS_THAN | EQUALS ;
list_elements : (NUMBER | IDENTIFIER | NIL | T)+ ;

when : WHEN condition (program)* ;
greater_than : GREATER_THAN either either ;
less_than : LESS_THAN either either ;
greater_than_equals : GREATER_THAN_EQUALS either either ;
less_than_equals : LESS_THAN_EQUALS either either ;
comparsion : (greater_than | less_than | greater_than_equals | less_than_equals) ;
condition : OPEN_PAREN (comparsion | IDENTIFIER | NUMBER)+ CLOSE_PAREN ;
print : PRINT (either | STRING | list)* ;


either :(program | IDENTIFIER | NUMBER | SINGLE_QUOTE);

