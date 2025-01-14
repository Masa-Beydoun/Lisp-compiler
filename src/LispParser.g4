parser grammar LispParser;

options { tokenVocab=LispLexer; }

programs : (program | quote_form | forms)* | EOF;

program: OPEN_PAREN(
        setq | let |let_star |  minus | sum  | multiply  | div  | modulas  | floor  | ceiling  | sin  | cos  | tan  | sqrt  | exp  | expt
         | cons | car | cdr | list | push | pop | evenp | defining_function | calling_functions | print
//         | when | comparsion
//         return | return_from | block | error | do | dotimes | dolist | loop |  funcall | apply | mapcar | lambda_expression |
//         sort | stable_sort | identifier_helper //yara
//         true | condition | array |string | structure| assignment | if_statement | cond
         ) CLOSE_PAREN;


sum returns [double result]
    : PLUS x=NUMBER y+=NUMBER+ {
        $result = MyClass.parseNumber($x.text);
                for (Token num : $y) {
            $result += MyClass.parseNumber(num.getText());
        }
        System.out.println("Sum is: " + $result);
    }
    |
     PLUS possible_number_helper possible_number_helper+;
minus returns [double result]
    : MINUS x=NUMBER y+=NUMBER+ {
        $result = MyClass.parseNumber($x.text);
        for (Token num : $y) {
            $result -= MyClass.parseNumber(num.getText());
        }
        System.out.println("minus is: " + $result);
    }
    | MINUS possible_number_helper possible_number_helper+;
multiply returns [double result]
    : MULTIPLY x=NUMBER y+=NUMBER+ {
        $result = MyClass.parseNumber($x.text);
        for (Token num : $y) {
            $result *= MyClass.parseNumber(num.getText());
        }
        System.out.println("multiply is: " + $result);
    }
    |MULTIPLY possible_number_helper possible_number_helper+;
div returns [double result]
    : DIV x=NUMBER y+=NUMBER+ {
        $result = MyClass.parseNumber($x.text);
        for (Token num : $y) {
            $result /= MyClass.parseNumber(num.getText());
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
             $result = Math.sin(MyClass.parseNumber($x.text));
             System.out.println("sin is: " + $result);
         }
         |SIN possible_number_helper;
cos returns [double result]
         : COS x=NUMBER  {
             $result = Math.cos(MyClass.parseNumber($x.text));
             System.out.println("cos is: " + $result);
         }
         |COS possible_number_helper;
tan returns [double result]
         : TAN x=NUMBER  {
             $result = Math.tan(MyClass.parseNumber($x.text));
             System.out.println("tan is: " + $result);
         }
         |TAN possible_number_helper;
sqrt returns [double result]
         : SQRT x=NUMBER  {
             $result = Math.sqrt(MyClass.parseNumber($x.text));
             System.out.println("sqrt is: " + $result);
         }
         |SQRT possible_number_helper;
exp returns [double result]
         : EXP x=NUMBER  {
             $result = Math.exp(MyClass.parseNumber($x.text));
             System.out.println("exp is: " + $result);
         }
         |EXP possible_number_helper;
expt returns [double result]
         : EXPT x=NUMBER  y=NUMBER{
             System.out.println("in expt");
             $result = Math.pow(MyClass.parseNumber($x.text),MyClass.parseNumber($y.text));
             System.out.println("power is: " + $result);
         }
         |EXPT possible_number_helper possible_number_helper;
setq: SETQ (IDENTIFIER (value_helper | quote_form))+ ;
let: LET OPEN_PAREN (binding | variable_binding | nil_binding)+ CLOSE_PAREN programs ;
let_star: LET_STAR OPEN_PAREN (binding | variable_binding | nil_binding)+ CLOSE_PAREN programs ; //TODO check if i can give it a variable
cons: CONS (possible_number_helper | NIL ) (possible_number_helper | NIL)  ;
car: CAR possible_number_helper ;
cdr: CDR possible_number_helper ;
evenp returns [int result]:
        EVENP x=NUMBER {
            $result = (MyClass.isEven(Integer.parseInt($x.text))) ? T : NIL;
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
possible_number_helper: NUMBER |variables | program;
atom_helper: possible_number_helper | STRING ;
expression_helper: atom_helper | variables (KEYWORD expression_helper)* ;
value_helper: NUMBER | STRING | program;
value_helper2: CHAR_LITERAL| atom_helper OPEN_PAREN value_helper2+ CLOSE_PAREN| NIL ;
either : possible_number_helper | SINGLE_QUOTE;
function_form: HASH_QUOTE atom_helper | FUNCTION atom_helper ;
quote_form: SINGLE_QUOTE (atom_helper | (OPEN_PAREN atom_helper+ CLOSE_PAREN)) |  QUOTE OPEN_PAREN (atom_helper)* CLOSE_PAREN;  //TODO
defining_function :  DEFUN IDENTIFIER OPEN_PAREN IDENTIFIER* (KEY (binding | IDENTIFIER)*)? (REST (binding | IDENTIFIER)*)? (OPTIONAL (binding | IDENTIFIER)*)? CLOSE_PAREN (program)+;
calling_functions :  IDENTIFIER ((KEYWORD)? NUMBER)* ;

//<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>
binding: OPEN_PAREN variables value_helper CLOSE_PAREN ;
variable_binding: OPEN_PAREN variables variables CLOSE_PAREN ;
nil_binding : OPEN_PAREN variables NIL CLOSE_PAREN ;
//bindings_helper: (binding_helper | simple_binding | special_binding)+ ;
//binding_helper: OPEN_PAREN IDENTIFIER value_helper CLOSE_PAREN ;
//simple_binding: IDENTIFIER value_helper ;
//special_binding:  SPECIAL_VARIABLE value_helper;
//<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>

//true : T either ;
//temporary_list : either*;

//TODO format

////Iteration
//dotimes : DOTIMES OPEN_PAREN IDENTIFIER NUMBER (program)* CLOSE_PAREN ;
//dolist : DOLIST OPEN_PAREN IDENTIFIER IDENTIFIER? (program)* CLOSE_PAREN ;
//loop : LOOP (program)* ;
//
//do : DO OPEN_PAREN iteration_specs* CLOSE_PAREN OPEN_PAREN (termination_condition (program)* ) CLOSE_PAREN ;
//iteration_specs : OPEN_PAREN IDENTIFIER NUMBER NUMBER? (program)* CLOSE_PAREN+ ;
//termination_condition : OPEN_PAREN condition IDENTIFIER? CLOSE_PAREN ;

//
////Non-local Exits
//return : RETURN either? ;
//return_from : RETURN_FROM IDENTIFIER either? ;
//block : BLOCK (IDENTIFIER | T | NIL) (program)* ;
//error : ERROR STRING (either)* ;
//body: expression_helper* ;
//
////Funcall, Apply, and Mapcar
////TODO
//funcall : FUNCALL program either+ ;
//apply : APPLY program either* OPEN_PAREN list CLOSE_PAREN ;
//mapcar : MAPCAR program OPEN_PAREN list CLOSE_PAREN ;
//print: PRINT expression_helper ;
//
////Lambda
//lambda_expression : HASH_TAG SINGLE_QUOTE? OPEN_PAREN LAMBDA OPEN_PAREN parameter_list CLOSE_PAREN program* CLOSE_PAREN ;
//parameter_list : IDENTIFIER+ ;

//function_reference : HASH_TAG (OPEN_PAREN (either)* CLOSE_PAREN )? ;
////function : function_reference | lambda_expression | defining_function;

//
////Sorting
//sort : SORT SINGLE_QUOTE? OPEN_PAREN list_elements CLOSE_PAREN comparison_function ;
//stable_sort : STABLE_SORT OPEN_PAREN list_elements CLOSE_PAREN comparison_function ;
//
//comparison_function : HASH_TAG SINGLE_QUOTE? comparison_operator ;
//comparison_operator : GREATER_THAN | LESS_THAN | EQUALS ;
//list_elements : (NUMBER | IDENTIFIER | NIL | T)+ ;
//
//when : WHEN condition (program)* ;
//greater_than : GREATER_THAN either either ;
//less_than : LESS_THAN either either ;
//greater_than_equals : GREATER_THAN_EQUALS either either ;
//less_than_equals : LESS_THAN_EQUALS either either ;
//comparsion : (greater_than | less_than | greater_than_equals | less_than_equals) ;
//condition : OPEN_PAREN (comparsion | IDENTIFIER | NUMBER)+ CLOSE_PAREN ;
//
//defstruct: DEFSTRUCT IDENTIFIER field* ;
//field: IDENTIFIER ;
/////////////////////////////////////////////////////////////
////array :
//array
//     : array_definition
//     | array_elements_access
//     | array_elements_operations ;
//array_definition
//                : twoDArray
//                | oneDArray  ;
//
//twoDArray :  MAKE_ARRAY SINGLE_QUOTE OPEN_PAREN NUMBER NUMBER ;
//oneDArray :  MAKE_ARRAY either ;
//
//array_elements_access : AREF (multiply | IDENTIFIER either ) ;
//
//array_elements_operations : operation_type OPEN_PAREN array_elements_access CLOSE_PAREN;
//operation_type
//              : PUSH either
//              | POP
//              | INCF ;
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//// Strings:
//string
//      : concatenate_definition
//      | concatenate_elements_call ;
//
//concatenate_definition : CONCATENATE SINGLE_QUOTE concatenate_type ;
//concatenate_type
//                :string_concatenate
//                | vector_concatenate
//                | list_concatenate;
//
//string_concatenate : STRING_WORD STRING* |  STRING_WORD (either_list)*;
//list_concatenate : LIST STRING* ;
//vector_concatenate : VECTOR  (SINGLE_QUOTE vector_elements)* ;
//
//either_list: SINGLE_QUOTE OPEN_PAREN (HASH_TAG BACKSLASH CHAR_LITERAL)* CLOSE_PAREN;
//vector_elements: HASH_TAG OPEN_PAREN (NUMBER)* CLOSE_PAREN;
//
//concatenate_elements_call : element_access STRING either  ;
//element_access : CHAR | AREF ;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////Structures :
//structure
//         : create_structures
//         | create_an_instance
//         | access ;
//
//create_structures: DEFSTRUCT IDENTIFIER (IDENTIFIER)* ;
//create_an_instance :  MAKE either
//                    | MAKE MINUS IDENTIFIER (COLON IDENTIFIER either)*  ;
//
//// (foo-bar *)
//// (foo-baaz **)
////(foo-baaz *my-foo*)
////(foo-bar a)
////accesses : OPEN_PAREN IDENTIFIER MULTIPLY IDENTIFIER MULTIPLY CLOSE_PAREN ;
//access : IDENTIFIER MINUS IDENTIFIER  ;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////assignment :
//assignment : setq_assignment | setf_assignment ;
//setq_assignment : SETQ SINGLE_QUOTE* IDENTIFIER either ;
//setf_assignment : SETF SINGLE_QUOTE* either either ;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////Booleans and Conditionals :
////  ???CLOSE PAREND ISSUE???
//if_statement
//    : IF either either either
//    | IF comparison_type (expression_sequence)+
//    | (WHEN | UNLESS) comparison_type2 (expression_sequence)*;
//comparison_type
//    : T either either //CLOSE_PAREN
//    | NULL either either //CLOSE_PAREN
//    | OPEN_PAREN condition CLOSE_PAREN ;
//comparison_type2 : T | NULL either ;
//
//expression_sequence: single_expression | multiple_expression ;
//
//single_expression : program ;
//multiple_expression : OPEN_PAREN (PROGN)* (program)* CLOSE_PAREN ;
//
////////////////////////////////////////////////////
//cond : COND (cond_exp)*;
//cond_exp : program | OPEN_PAREN (program)* either* CLOSE_PAREN  ;
////////////////////////////////////////////////
////case : CASE IDENTIFIER case_exp* ;
////case_exp :  OPEN_PAREN (program)* either* CLOSE_PAREN  ;
//////////////////////////////////////////////////////////////////////////////////
