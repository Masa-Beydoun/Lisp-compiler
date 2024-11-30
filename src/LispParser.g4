parser grammar LispParser;



setq: OPEN_PAREN SETQ IDENTIFIER NUMEBER CLOSE_PAREN | EOF;

list: OPEN_PAREN (expression)* CLOSE_PAREN;
expression: list | NUMBER | SYMBOL;

