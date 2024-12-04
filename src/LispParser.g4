parser grammar LispParser;

options { tokenVocab=LispLexer; }

programs : ( OPEN_PAREN program CLOSE_PAREN)* | EOF;

program: setq | temporary_assigment  | let |
         sum  | minus | multiply |div | modulas |
         floor | ceiling | mod | sin | cos | tan |
         sqrt | exp |expt | cons | car | cdr | list |
         push | pop | defining_function | calling_functions | temporary_list;

temporary_assigment :  IDENTIFIER NUMBER ;
temporary_list : (IDENTIFIER| NUMBER)*;
setq:   SETQ IDENTIFIER (NUMBER| NIL)  ;
let:  LET IDENTIFIER (NUMBER| NIL) ;

sum :  PLUS (NUMBER | IDENTIFIER) (NUMBER | IDENTIFIER)+  ;
minus :  MINUS (NUMBER | IDENTIFIER) (NUMBER | IDENTIFIER)+  ;
multiply :  MULTIPLY (NUMBER | IDENTIFIER) (NUMBER | IDENTIFIER)+  ;
div :  DIV (NUMBER | IDENTIFIER) (NUMBER | IDENTIFIER)+  ;
modulas :  MODULUS (NUMBER | IDENTIFIER) (NUMBER | IDENTIFIER)+  ;
floor :  FLOOR (NUMBER | IDENTIFIER) (NUMBER | IDENTIFIER)+  ;
ceiling :  CEILING (NUMBER | IDENTIFIER) (NUMBER | IDENTIFIER)+  ;
mod :  MOD (NUMBER | IDENTIFIER) (NUMBER | IDENTIFIER)+  ;
sin :  SIN (NUMBER | IDENTIFIER) (NUMBER | IDENTIFIER)+  ;
cos :  COS (NUMBER | IDENTIFIER) (NUMBER | IDENTIFIER)+  ;
tan :  TAN (NUMBER | IDENTIFIER) (NUMBER | IDENTIFIER)+  ;
sqrt :  SQRT (NUMBER | IDENTIFIER) (NUMBER | IDENTIFIER)+  ;
exp :  EXP (NUMBER | IDENTIFIER)   ;
expt :  EXPT (NUMBER | IDENTIFIER) (NUMBER | IDENTIFIER)  ;
cons:  (NUMBER | IDENTIFIER) (NUMBER | IDENTIFIER)  ;
car:  (NUMBER | IDENTIFIER)  ;
cdr:  (NUMBER | IDENTIFIER)  ;
list :  LIST (NUMBER | IDENTIFIER | NIL )+  ;
push:  PUSH (NUMBER)? IDENTIFIER;
pop:  POP (NUMBER)? IDENTIFIER;

defining_function :  DEFUN IDENTIFIER  ((OPTIONAL|KEY|REST)? IDENTIFIER)*;
calling_functions :  IDENTIFIER (COLON IDENTIFIER NUMBER)*  ;






