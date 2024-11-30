parser grammar LispParser;

options { tokenVocab=LispLexer; } // Ensure it uses the lexer

program:  (setq  | temporary_assigment | let)*  | EOF;

temporary_assigment : OPEN_PAREN IDENTIFIER NUMBER CLOSE_PAREN;
setq: OPEN_PAREN SETQ IDENTIFIER NUMBER CLOSE_PAREN ;
let: OPEN_PAREN LET IDENTIFIER NUMBER CLOSE_PAREN;

//list: OPEN_PAREN (expression)* CLOSE_PAREN;
//expression: list | NUMBER | SYMBOL;

