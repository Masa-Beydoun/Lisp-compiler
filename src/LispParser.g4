parser grammar LispParser;

list: OPEN_PAREN (expression)* CLOSE_PAREN;
expression: list | NUMBER | SYMBOL;

