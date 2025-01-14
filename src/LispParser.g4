parser grammar LispParser;

options { tokenVocab=LispLexer; }

programs : ( program )* | EOF;

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
         sort | stable_sort
         |function | identifier //yara
         true |evenp | condition |
         array |string | structure| assignment | if_statement | cond ) CLOSE_PAREN;

      identifier : STARS
          | NUMBER
          | quote
          | function_form
          | SPECIAL_VARIABLE ;

function : OPEN_PAREN (print | setq | let | expression) CLOSE_PAREN | EOF ;

setq: SETQ (IDENTIFIER | SPECIAL_VARIABLE) expression ;

let: LET bindings body ;

//atom :
//    CHAR_LITERAL
//    | SPECIAL_VARIABLE ;

value:
    SPECIAL_VARIABLE
    | CHAR_LITERAL
    | NUMBER
    | IDENTIFIER
    | STRING
    | OPEN_PAREN value+ CLOSE_PAREN
    | NIL ;
bindings: (binding | simple_binding | special_binding)+ ;

special_binding: OPEN_PAREN SPECIAL_VARIABLE expression CLOSE_PAREN ;

binding: OPEN_PAREN IDENTIFIER expression CLOSE_PAREN ;

evenp : EVENP value ;
true : T either ;

either :(program | IDENTIFIER | NUMBER | SINGLE_QUOTE);


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
simple_binding: IDENTIFIER expression ;

//Non-local Exits
return : RETURN either? ;
return_from : RETURN_FROM IDENTIFIER either? ;
block : BLOCK (IDENTIFIER | T | NIL) (program)* ;
error : ERROR STRING (either)* ;
body: expression* ;

//Funcall, Apply, and Mapcar
funcall : FUNCALL function either+ ;
apply : APPLY function either* OPEN_PAREN list CLOSE_PAREN ;
mapcar : MAPCAR function OPEN_PAREN list CLOSE_PAREN ;
print: PRINT expression ;

//Lambda
lambda_expression : HASH_TAG SINGLE_QUOTE? OPEN_PAREN LAMBDA OPEN_PAREN parameter_list CLOSE_PAREN program* CLOSE_PAREN ;
parameter_list : IDENTIFIER+ ;
quote: SINGLE_QUOTE atom | QUOTE atom ;
function_reference : HASH_TAG (OPEN_PAREN (either)* CLOSE_PAREN )? ;
//function : function_reference | lambda_expression | defining_function;
function_form: HASH_QUOTE atom | FUNCTION atom ;

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
//print : PRINT (either | STRING | list)* ;


either :(program | IDENTIFIER | NUMBER | SINGLE_QUOTE);

atom: NUMBER
    | STRING
    | IDENTIFIER
    | SPECIAL_VARIABLE ;

expression:
    NUMBER
    | IDENTIFIER
    | STRING
    | SPECIAL_VARIABLE
    | OPEN_PAREN operator expression+ CLOSE_PAREN
    | OPEN_PAREN IDENTIFIER (KEYWORD expression)* CLOSE_PAREN
    | expression expression ;


operator: PLUS | MINUS | MULTIPLY | DIV | MODULUS | SIN | COS | TAN | SQRT | EXP | EXPT ;

defstruct: DEFSTRUCT IDENTIFIER field* ;
field: IDENTIFIER ;


///////////////////////////////////////////////////////////
//array :
array
     : array_definition
     | array_elements_access
     | array_elements_operations ;


array_definition
                : twoDArray
                | oneDArray  ;

twoDArray :  MAKE_ARRAY SINGLE_QUOTE OPEN_PAREN NUMBER NUMBER ;
oneDArray :  MAKE_ARRAY either ;

array_elements_access : AREF (multiply | IDENTIFIER either ) ;

array_elements_operations : operation_type OPEN_PAREN array_elements_access CLOSE_PAREN;
operation_type
              : PUSH either
              | POP
              | INCF ;


///////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Strings:

string
      : concatenate_definition
      | concatenate_elements_call ;


concatenate_definition : CONCATENATE SINGLE_QUOTE concatenate_type ;
concatenate_type
                :string_concatenate
                | vector_concatenate
                | list_concatenate;

string_concatenate : STRING_WORD STRING* |  STRING_WORD (either_list)*;
list_concatenate : LIST STRING* ;
vector_concatenate : VECTOR  (SINGLE_QUOTE vector_elements)* ;

either_list: SINGLE_QUOTE OPEN_PAREN (HASH_TAG BACKSLASH CHAR_LITERAL)* CLOSE_PAREN;
vector_elements: HASH_TAG OPEN_PAREN (NUMBER)* CLOSE_PAREN;

concatenate_elements_call : element_access STRING either  ;
element_access : CHAR | AREF ;



///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Structures :

structure
         : create_structures
         | create_an_instance
         | access ;

create_structures: DEFSTRUCT IDENTIFIER (IDENTIFIER)* ;

create_an_instance :  MAKE either
                    | MAKE MINUS IDENTIFIER (COLON IDENTIFIER either)*  ;

// (foo-bar *)
// (foo-baaz **)
//(foo-baaz *my-foo*)
//(foo-bar a)
//accesses : OPEN_PAREN IDENTIFIER MULTIPLY IDENTIFIER MULTIPLY CLOSE_PAREN ;
access : IDENTIFIER MINUS IDENTIFIER  ;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//assignment :

assignment : setq_assignment | setf_assignment ;
setq_assignment : SETQ SINGLE_QUOTE* IDENTIFIER either ;
setf_assignment : SETF SINGLE_QUOTE* either either ;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Booleans and Conditionals :

//  ???CLOSE PAREND ISSUE???
if_statement
    : IF either either either
    | IF comparison_type (expression_sequence)+
    | (WHEN | UNLESS) comparison_type2 (expression_sequence)*;


comparison_type
    : T either either //CLOSE_PAREN
    | NULL either either //CLOSE_PAREN
    | OPEN_PAREN condition CLOSE_PAREN ;

comparison_type2 : T | NULL either ;

expression_sequence: single_expression | multiple_expression ;

single_expression : program ;
multiple_expression : OPEN_PAREN (PROGN)* (program)* CLOSE_PAREN ;

//////////////////////////////////////////////////

cond : COND (cond_exp)*;
cond_exp : program | OPEN_PAREN (program)* either* CLOSE_PAREN  ;

//////////////////////////////////////////////

//case : CASE IDENTIFIER case_exp* ;
//case_exp :  OPEN_PAREN (program)* either* CLOSE_PAREN  ;

////////////////////////////////////////////////////////////////////////////////
