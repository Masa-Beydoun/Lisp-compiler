parser grammar LispParser;

options { tokenVocab=LispLexer; }

programs : (program | quote_form | forms)* | EOF;

program: OPEN_PAREN(
        setq | let | let_star | function_operation |math_operation |list_operation | print |eq | append | reverse | member | find  | subsetp | intersection | union | set_difference |
        | if_statement | condition | comparsion | cons | car | cdr
        | defvar | array

        | error | do |  funcall | apply | mapcar | lambda_expression | iteration_operation


        | string  // masa
        | when  | function | defstruct  | return | return_from  // rahaf
        | temporary_list | true | cond | case  |sort_operation| block | assignment | structure// yara
        | format
         ) CLOSE_PAREN;

format : FORMAT (T2|NIL2) FORMAT_STRING (possible_number_helper)*;






math_operation: minus | sum  | multiply  | div  | modulas  | floor  | ceiling  | sin  | cos  | tan  | sqrt  | exp  | expt|evenp ;
list_operation:list | push | pop;
function_operation: defining_function  | calling_functions;
sort_operation: sort | stable_sort ;
iteration_operation : dotimes | dolist |loop ;

sum returns [double result]
    : PLUS x=NUMBER y+=NUMBER+ {
        $result = visitor.MyClass.parseNumber($x.text);
                for (Token num : $y) {
            $result += visitor.MyClass.parseNumber(num.getText());
        }
        System.out.println("Sum is: " + $result);
    }
    |
     PLUS possible_number_helper possible_number_helper+;
minus returns [double result]
    : MINUS x=NUMBER y+=NUMBER+ {
        $result = visitor.MyClass.parseNumber($x.text);
        for (Token num : $y) {
            $result -= visitor.MyClass.parseNumber(num.getText());
        }
        System.out.println("minus is: " + $result);
    }
    | MINUS possible_number_helper possible_number_helper+;
multiply returns [double result]
    : MULTIPLY x=NUMBER y+=NUMBER+ {
        $result = visitor.MyClass.parseNumber($x.text);
        for (Token num : $y) {
            $result *= visitor.MyClass.parseNumber(num.getText());
        }
        System.out.println("multiply is: " + $result);
    }
    |MULTIPLY possible_number_helper possible_number_helper+;
div returns [double result]
    : DIV x=NUMBER y+=NUMBER+ {
        $result = visitor.MyClass.parseNumber($x.text);
        for (Token num : $y) {
            $result /= visitor.MyClass.parseNumber(num.getText());
        }
        System.out.println("div is: " + $result);
    }
    |DIV possible_number_helper possible_number_helper+;
modulas returns [int result]
    : (MODULUS | MOD) x=NUMBER y=NUMBER {
        $result = Integer.parseInt($x.text);
        $result %= Integer.parseInt($y.text);
        System.out.println("modulas is: " + $result);
    }
    |(MODULUS | MOD) possible_number_helper possible_number_helper;
floor returns [int result]
         : FLOOR x=NUMBER  {
             $result = (int)Math.floor(Double.parseDouble($x.text));
             System.out.println("floor is: " + $result);
         }
         |FLOOR possible_number_helper;
ceiling returns [int result]
         :CEILING  x=NUMBER  {
             $result = (int)Math.ceil(Double.parseDouble($x.text));
             System.out.println("ceil is: " + $result);
         }
         |CEILING possible_number_helper;
sin returns [double result]
         : SIN x=NUMBER  {
             $result = Math.sin(visitor.MyClass.parseNumber($x.text));
             System.out.println("sin is: " + $result);
         }
         |SIN possible_number_helper;
cos returns [double result]
         : COS x=NUMBER  {
             $result = Math.cos(visitor.MyClass.parseNumber($x.text));
             System.out.println("cos is: " + $result);
         }
         |COS possible_number_helper;
tan returns [double result]
         : TAN x=NUMBER  {
             $result = Math.tan(visitor.MyClass.parseNumber($x.text));
             System.out.println("tan is: " + $result);
         }
         |TAN possible_number_helper;
sqrt returns [double result]
         : SQRT x=NUMBER  {
             $result = Math.sqrt(visitor.MyClass.parseNumber($x.text));
             System.out.println("sqrt is: " + $result);
         }
         |SQRT possible_number_helper;
exp returns [double result]
         : EXP x=NUMBER  {
             $result = Math.exp(visitor.MyClass.parseNumber($x.text));
             System.out.println("exp is: " + $result);
         }
         |EXP possible_number_helper;
expt returns [double result]
         : EXPT x=NUMBER  y=NUMBER{
             System.out.println("in expt");
             $result = Math.pow(visitor.MyClass.parseNumber($x.text),visitor.MyClass.parseNumber($y.text));
             System.out.println("power is: " + $result);
         }
         |EXPT possible_number_helper possible_number_helper;

         //////////////////////////////////////////
identifier_value_qoute_pair: (IDENTIFIER (value_helper | quote_form));
setq: SETQ (identifier_value_qoute_pair)+ ;
let: LET OPEN_PAREN (binding | variable_binding | nil_binding | possible_number_helper |temporary_list)+ CLOSE_PAREN programs ;
let_star: LET_STAR OPEN_PAREN (binding | variable_binding | nil_binding |possible_number_helper|temporary_list)+ CLOSE_PAREN programs ;
cons: CONS (possible_number_helper | NIL ) (possible_number_helper | NIL)  ;
car: CAR possible_number_helper ;
cdr: CDR possible_number_helper ;
evenp returns [int result]:
        EVENP x=NUMBER {
            $result = (visitor.MyClass.isEven(Integer.parseInt($x.text))) ? T : NIL;
            System.out.println("Is the number even? " + ($result == T ? "True" : "False"));
        }
        |EVENP IDENTIFIER;
list :  LIST (atom_helper|NIL)+;
pop:  POP variables;
push:  PUSH atom_helper variables;
forms : (STARS |MULTIPLY) | quote_form | function_form | possible_number_helper ;
print : PRINT (either | STRING | list | NIL) ;
//<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>
variables: IDENTIFIER | SPECIAL_VARIABLE;
possible_number_helper: NUMBER |variables | program | quote_form | function_form;
atom_helper: possible_number_helper | STRING ;
expression_helper: atom_helper | variables (KEYWORD expression_helper)* ;
value_helper: NUMBER | STRING | program ;
value_helper2: CHAR_LITERAL| atom_helper OPEN_PAREN value_helper2+ CLOSE_PAREN| NIL ;

either : possible_number_helper | SINGLE_QUOTE;
function_form: HASH_QUOTE atom_helper | FUNCTION atom_helper ;
quote_form: (SINGLE_QUOTE (atom_helper | (OPEN_PAREN atom_helper+ CLOSE_PAREN))) | ( QUOTE OPEN_PAREN (atom_helper)* CLOSE_PAREN);

//<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>
binding: OPEN_PAREN variables value_helper CLOSE_PAREN ;
variable_binding: OPEN_PAREN variables variables CLOSE_PAREN ;
nil_binding : OPEN_PAREN variables NIL CLOSE_PAREN ;
//<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>
key_function:KEY (binding | IDENTIFIER);
rest_function: REST (binding | IDENTIFIER);
option_function:OPTIONAL (binding | IDENTIFIER);
defining_function :  DEFUN IDENTIFIER OPEN_PAREN IDENTIFIER* key_function* rest_function* option_function* CLOSE_PAREN (atom_helper)+;
keyword_number_helper:(KEYWORD)? NUMBER;
calling_functions :  IDENTIFIER (keyword_number_helper)* ;

condition_helper:possible_number_helper | T | NIL;
true : T either ;
temporary_list : either+;

////Iteration
dotimes : DOTIMES OPEN_PAREN IDENTIFIER NUMBER (program)* CLOSE_PAREN ;
dolist : DOLIST OPEN_PAREN IDENTIFIER SINGLE_QUOTE? (list|IDENTIFIER) (program)* CLOSE_PAREN ;
loop : LOOP (program)* ;
//
do : DO OPEN_PAREN iteration_specs* CLOSE_PAREN OPEN_PAREN (termination_condition (program)* ) CLOSE_PAREN ;
iteration_specs : OPEN_PAREN IDENTIFIER NUMBER (program)* CLOSE_PAREN ;
termination_condition : OPEN_PAREN condition IDENTIFIER? CLOSE_PAREN ;
defvar: DEFVAR SPECIAL_VARIABLE possible_number_helper;
//
////Non-local Exits
return : RETURN either? ;
return_from : RETURN_FROM IDENTIFIER either? ;
block : BLOCK (IDENTIFIER | T | NIL) (program)* ;
error : ERROR STRING (either)* ;
//
////Funcall, Apply, and Mapcar
////TODO
funcall : FUNCALL program either+ ;
apply : APPLY program either* OPEN_PAREN list CLOSE_PAREN ;
mapcar : MAPCAR program OPEN_PAREN list CLOSE_PAREN ;
//
////Lambda
lambda_expression : HASH_TAG SINGLE_QUOTE? OPEN_PAREN LAMBDA OPEN_PAREN IDENTIFIER+ CLOSE_PAREN program* CLOSE_PAREN ;
//parameter_list : IDENTIFIER+ ;
//
function_reference : HASH_TAG (OPEN_PAREN (either)* CLOSE_PAREN )? ;
function : function_reference | lambda_expression | defining_function;

//
////Sorting
sort : SORT SINGLE_QUOTE? OPEN_PAREN list_elements CLOSE_PAREN comparison_function ;
stable_sort : STABLE_SORT OPEN_PAREN list_elements CLOSE_PAREN comparison_function ;

comparison_function : HASH_TAG SINGLE_QUOTE? comparison_operator ;
comparison_operator : GREATER_THAN | LESS_THAN | EQUALS ;
list_elements : (NUMBER | IDENTIFIER | NIL | T)+ ;
//
when : WHEN condition (program)* ;
greater_than : GREATER_THAN either either ;
less_than : LESS_THAN either either ;
greater_than_equals : GREATER_THAN_EQUALS either either ;
less_than_equals : LESS_THAN_EQUALS either either ;
comparsion : (greater_than | less_than | greater_than_equals | less_than_equals) ;
condition : OPEN_PAREN (comparsion | IDENTIFIER | NUMBER)+ CLOSE_PAREN ;
//
defstruct: DEFSTRUCT IDENTIFIER field* ;
field: IDENTIFIER ;

/////////////////////////////////////////////////array :
array : array_definition | array_elements_access | array_elements_operations ;
array_definition : twoDArray | oneDArray  ;
twoDArray :  MAKE_ARRAY SINGLE_QUOTE OPEN_PAREN NUMBER NUMBER ;
oneDArray :  MAKE_ARRAY either ;
array_elements_access : AREF (multiply | IDENTIFIER either ) ;
array_elements_operations : operation_type OPEN_PAREN array_elements_access CLOSE_PAREN;
operation_type: PUSH either | POP | INCF ;
/////////////////////////////// Strings:
string : concatenate_definition | concatenate_elements_call ;

concatenate_definition : CONCATENATE SINGLE_QUOTE concatenate_type ;
concatenate_type :string_concatenate | vector_concatenate | list_concatenate;

string_concatenate : STRING_WORD STRING* |  STRING_WORD (either_list)*;
list_concatenate : LIST STRING* ;
vector_concatenate : VECTOR  (SINGLE_QUOTE vector_elements)* ;
//
either_list: SINGLE_QUOTE OPEN_PAREN (HASH_TAG BACKSLASH CHAR_LITERAL)* CLOSE_PAREN;
vector_elements: HASH_TAG OPEN_PAREN (NUMBER)* CLOSE_PAREN;
//
concatenate_elements_call : element_access STRING either  ;
element_access : CHAR | AREF ;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////Structures :
structure: create_structures| create_an_instance| access ;
create_structures: DEFSTRUCT IDENTIFIER (IDENTIFIER)* ;
create_an_instance : create_an_instance1 | create_an_instance2;
create_an_instance1 : MAKE either ; // TODO
create_an_instance2 : MAKE MINUS IDENTIFIER (colorPair)* ;
colorPair : COLON IDENTIFIER either ;
// (foo-bar *)
// (foo-baaz **)
//(foo-baaz *my-foo*)
//(foo-bar a)
////accesses : OPEN_PAREN IDENTIFIER MULTIPLY IDENTIFIER MULTIPLY CLOSE_PAREN ;
access : IDENTIFIER MINUS IDENTIFIER  ;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//assignment :
assignment : setq_assignment | setf_assignment ;
setq_assignment : SETQ SINGLE_QUOTE* IDENTIFIER either ;
setf_assignment : SETF SINGLE_QUOTE* either either ;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Booleans and Conditionals :
//  ???CLOSE PAREND ISSUE???

if_statement : if_statement1 | if_statement2 | if_statement3;
if_statement1 : IF condition_helper condition_helper condition_helper;
if_statement2 :  IF comparison_type (expression_sequence)+;
if_statement3 :(WHEN | UNLESS) comparison_type2 (expression_sequence)*;


comparison_type : OPEN_PAREN condition CLOSE_PAREN ;
comparison_type2 : T | NIL condition_helper ;
//
expression_sequence: program | multiple_expression ;
//
multiple_expression : OPEN_PAREN PROGN (program)* CLOSE_PAREN ;
////////////////////////////////////////////////////
cond : COND (cond_exp)*;
cond_exp : program | cond_exp1;
cond_exp1 :OPEN_PAREN (program)* either* CLOSE_PAREN  ;

////////////////////////////////////////////////
case : CASE IDENTIFIER case_exp* ;
case_exp :  OPEN_PAREN (program)* either* CLOSE_PAREN  ;
//////////////////////////////////////////////////////////////////////////////////


eq : EQ  quote_form quote_form;
append : APPEND quote_form quote_form ;
reverse : REVERSE quote_form ;
member : MEMBER quote_form quote_form ;
find : FIND quote_form (quote_form | list);
subsetp : SUBSETP quote_form quote_form ;
intersection : INTERSECTION quote_form quote_form ;
union :UNION quote_form quote_form;
set_difference :SETDIFFERENCE quote_form quote_form;
