parser grammar LispParser;

options { tokenVocab=LispLexer; }

programs : (  program )* | EOF;

program: OPEN_PAREN( setq | temporary_assigment  | let |
         sum  | minus | multiply |div | modulas |
         floor | ceiling | mod | sin | cos | tan |
         sqrt | exp |expt | cons | car | cdr | list |
         push | pop | defining_function | calling_functions ) CLOSE_PAREN;



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






either :(program | IDENTIFIER | NUMBER);
