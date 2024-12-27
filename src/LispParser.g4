parser grammar LispParser;

options { tokenVocab=LispLexer; }

program : function | identifier ;

identifier : STARS
    | NUMBER
    | quote
    | function_form
    | SPECIAL_VARIABLE ;

function : OPEN_PAREN (print | setq | let | expression) CLOSE_PAREN | EOF ;

setq: SETQ (IDENTIFIER | SPECIAL_VARIABLE) expression ;

let: LET bindings body ;

bindings: (binding | simple_binding | special_binding)+ ;

special_binding: OPEN_PAREN SPECIAL_VARIABLE expression CLOSE_PAREN ;

binding: OPEN_PAREN IDENTIFIER expression CLOSE_PAREN ;

simple_binding: IDENTIFIER expression ;

body: expression* ;

print: PRINT expression ;

quote: SINGLE_QUOTE atom | QUOTE atom ;

function_form: HASH_QUOTE atom | FUNCTION atom ;

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
