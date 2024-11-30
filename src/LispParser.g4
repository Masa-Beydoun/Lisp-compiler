parser grammar LispParser;


program: (setq | list)* | EOF;

setq: OPEN_PAREN SETQ IDENTIFIER NUMEBER CLOSE_PAREN ;

list: OPEN_PAREN (expression)* CLOSE_PAREN;
expression: list | NUMBER | SYMBOL;

