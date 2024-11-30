parser grammar LispParser;

options { tokenVocab=LispLexer; } // Ensure it uses the lexer

program: OPEN_PAREN (setq  | temporary_assigment | let)*  CLOSE_PAREN | EOF;

temporary_assigment :  IDENTIFIER NUMBER ;
setq:  SETQ IDENTIFIER NUMBER  ;
let:  LET IDENTIFIER NUMBER ;

