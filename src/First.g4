lexer grammar First;


// WhiteSpace
WS: [ \t\r\n]+ -> skip;

MULTI_LINE_COMMENT  : '#|' .*? '|#' -> skip ;
SINGLE_LINE_COMMENT : ';' ~[\r\n]* -> skip ;



COMMA : ',' ;
SEMI_COLON:';';
COLON: ':';
DOT: '.';
QUESTION_MARK: '?';
HASH_TAG: '#';


NUMBER : SCIENTIFIC | COMPLEX | FLOAT;
INTEGER: ('+' | '-')? ('0' | [1-9][0-9]*);
FLOAT: ('+' | '-')? [0-9]+ '.' [0-9]+;
SCIENTIFIC: ('+' | '-')? [0-9]+ ('.' [0-9]+)? ('e' | 'E') ('+' | '-')? [0-9]+;
COMPLEX: '#c(' NUMBER NUMBER ')';
CONSTANT : 'pi' | 'e';
BOOLEAN : 'T' | 'NIL';
NIL: 'nil';


EQUALS: '==';
NOT: '!';
ASSING: '=';
NOT_EQUALS: '!=';
IDENTITY_EQUALS: '===';
IDENTITY_NOT_EQUALS: '!==';
LESS_THAN: '<';
GREATER_THAN: '>';
LESS_THAN_EQUALS: '<=';
GREATER_THAN_EQUALS: '>=';


// Brackets
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';




// Loop Constructs and Control Flow
RETURN: 'return';
IF: 'if';

// loops :
LOOP_FOR: 'loop for';
FROM: 'from';
TO: 'to';
DO: 'do';
WHILE: 'while';

// Keywords
CONST: 'const';
LET: 'let';
VAR: 'var';
SETQ:'setq';

IMPORT: 'import';
EXPORT: 'export';

/////////////////////////////PRINTING/////////////////////
PRINT : 'print';
T : 't' ;
DIRECTIVE : '~' [SD%~];


// Arithmatic Operators
PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIV :'/' ;
MODULUS: '%';
FLOOR : 'floor';
CEILING : 'ceiling';
MOD: 'mod';
SIN: 'sin';
COS: 'cos';
TAN:'tan';
SQRT:'sqrt';
EXP: 'exp';
EXPT: 'expt';
CONS: 'cons';
CAR: 'car';
CDR: 'cdr';


LIST : 'list' ;

PUSH: 'push';
POP: 'pop';



DEFUN:'defun';
REST:'&rest';
KEY:'&key';

// Logical Operators
BIT_AND: '&';
BIT_XOR: '^';
BIT_OR: '|';
AND: '&&';
OR: '||';

// IDENTIFIER
DEFPARAMETER :'defparameter' ;
DEFvar: 'defvar';

STRING
    : '"' (ESC | ~["\\])* '"'
    | '"' (ESC | ~["\\])* EOF {throw new RuntimeException("Unclosed string literal at line " + getLine() + ", column " + getCharPositionInLine());}
    ;

fragment ESC
    : '\\' (['"\\nrt] | UNICODE_ESCAPE)
    ;

fragment UNICODE_ESCAPE
    : 'u' HEX HEX HEX HEX
    ;

fragment HEX
    : [0-9a-fA-F]
    ;

STREAM : [a-zA-Z_][a-zA-Z0-9_-]*;



