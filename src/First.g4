lexer grammar First;

LPAREN   : '(' ;
RPAREN   : ')' ;
LBRACK   : '[' ;
RBRACK   : ']' ;
LBRACE   : '{' ;
RBRACE   : '}' ;
// Reserved Words (keywords in Lisp)
DEF      : 'def' ;
IF       : 'if' ;
LAMBDA   : 'lambda' ;
QUOTE    : 'quote' ;
BEGIN    : 'begin' ;  // Another common Lisp keyword

// Identifiers
ID       : [a-zA-Z_][a-zA-Z0-9_+-/*?]* ;

NUMBER   : [0-9]+ ('.' [0-9]+)? ;  // with a point

STRING   : '"' ( ~["] )* '"' ;

COMMENT  : ';' ~[\r\n]* -> skip ;

WS       : [ \t\r\n]+ -> skip ;
