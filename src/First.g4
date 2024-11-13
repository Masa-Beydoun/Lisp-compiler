lexer grammar First;

LPAREN   : '(' ;
RPAREN   : ')' ;

// Reserved Words (keywords in Lisp)
DEF      : 'def' ;
IF       : 'if' ;
LAMBDA   : 'lambda' ;
QUOTE    : 'quote' ;
LOOP_FOR : 'loop for';
DO       : 'do';

// Symbols must come before ID to prevent ambiguity
SYMBOL   : '+' | '-' | '*' | '/' | '<' | '>' | '=' | '?' ;

// Identifiers
ID       : [a-zA-Z_][a-zA-Z0-9_?]* ;

NUMBER   : [0-9]+ ('.' [0-9]+)? ;  // with a point

STRING   : '"' ( ~["] )* '"' ;

COMMENT  : ';' ~[\r\n]* -> skip ;

WS       : [ \t\r\n]+ -> skip ;
