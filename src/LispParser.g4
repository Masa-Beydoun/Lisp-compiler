parser grammar LispParser;

options { tokenVocab=LispLexer; }

programs : (  program )* | EOF;

program: OPEN_PAREN( setq | temporary_assigment  | let |
         sum  | minus | multiply |div | modulas |
         floor | ceiling | mod | sin | cos | tan |
         sqrt | exp |expt | cons | car | cdr | list |
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

sum :  PLUS either either+  ;
minus :  MINUS either either+  ;
multiply :  MULTIPLY either either+  ;
div :  DIV either either+  ;
modulas :  MODULUS either either+  ;
floor :  FLOOR either either+  ;
ceiling :  CEILING either either+  ;
mod :  MOD either either+  ;
sin :  SIN either either+  ;
cos :  COS either either+  ;
tan :  TAN either either+  ;
sqrt :  SQRT either either+  ;
exp :  EXP either ;
expt :  EXPT either either  ;
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
