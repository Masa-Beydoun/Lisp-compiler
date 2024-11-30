parser grammar LispParser;


program:  (setq | list)*  | EOF;

setq: OPEN_PAREN SETQ IDENTIFIER NUMBER CLOSE_PAREN ;
let: LET IDENTIFIER NUMEBER;
list: OPEN_PAREN (expression)* CLOSE_PAREN;
expression: list | NUMBER | SYMBOL;

