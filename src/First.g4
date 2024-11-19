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

DOUBLE_QUOTATION: '"';
QUOTE_SYMBOL: '\'';

// Number
NUMBER: INTEGER | FLOAT | RATIONAL | COMPLEX;
SIGN: '+' | '-';
INTEGER: SIGN? [0-9]+;
FLOAT: SIGN? [0-9]+ ('/'| '.' [0-9]+)? ([eE] SIGN? [0-9]+)?;
RATIONAL: INTEGER '/' INTEGER;
COMPLEX: '#c(' NUMBER NUMBER ')';
CONSTANT: 'pi' | 'e';

// Null Literal
NULL: NIL;

EQUALS: '==';
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
// loops :
LOOP: 'loop';
DOLIST: 'dolist';
DOTIMES: 'dotimes';
TO: 'to';
DO: 'do';
DO_STAR: 'do*';
WHILE: 'while';

// Keywords
CONST: 'const';
VAR: 'var';
<<<<<<< HEAD
SETQ:'setq';

IMPORT: 'import';
EXPORT: 'export';

/////////////////////////////PRINTING/////////////////////
PRINT : 'print';
T : 't' ;
DIRECTIVE : '~' [SD%~];
=======
IMPORT: 'import';
EXPORT: 'export';

// print
PRINT : 'print';
FORMAT: 'format';
DIRECTIVE: '~'[SD%~];

// Operators

// Arithmatic Operators
PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIV :'/' ;
MODULUS: '%';
<<<<<<< HEAD
FLOOR : 'floor';
CEILING : 'ceiling';
FLOOR: 'floor';
CEILING: 'ceiling';
MOD: 'mod';
SIN: 'sin';
COS: 'cos';
TAN:'tan';
SQRT:'sqrt';
EXP: 'exp';
EXPT: 'expt';
<<<<<<< HEAD
CONS: 'cons';
CAR: 'car';
CDR: 'cdr';


LIST : 'list' ;
PUSH: 'push';
POP: 'pop';



DEFUN:'defun';
REST:'&rest';
KEY:'&key';

CAR: 'car';
CDR: 'cdr';

// Logical Operators
BIT_AND: '&';
BIT_XOR: '^';
BIT_OR: '|';

// IDENTIFIER
DEFPARAMETER :'defparameter' ;
DEFvar: 'defvar';

STRING
    : '"' (ESC | ~["\\])* '"' {
        // Unescape the string content
        setText(getText()
            .substring(1, getText().length() - 1) // Remove surrounding quotes
            .replace("\\\"", "\"")               // Unescape double quotes
            .replace("\\\\", "\\")               // Unescape backslashes
            .replace("\\n", "\n")                // Unescape newlines
            .replace("\\t", "\t")                // Unescape tabs
            .replace("\\r", "\r"));              // Unescape carriage returns
    }
    | '"' (ESC | ~["\\])* EOF {
        throw new RuntimeException("Unclosed string literal at line " + getLine() + ", column " + getCharPositionInLine());
    }
    ;
//Identifier
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]* ;
SPECIAL_VARIABLE: '*' IDENTIFIER '*';

COMMENT: ';' .*? '\n' -> skip;
BLOCK_COMMENT: ';;' .*? '\n' -> skip;
MULTI_LINE_COMMENT: '#|' .*? '|#' -> skip;

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
//Keywords

//Assignment
SETQ: 'setq';
SETF: 'setf';
PUSH: 'push';
POP: 'pop';
//Definition
DEFVAR: 'defvar';
DEFPARAMETER: 'defparameter';
DEFCONSTANT: 'defconstant';
DEFUN: 'defun';
DEFMARCO: 'defmarco';
DEFSTRUCT: 'defstruct';
MAKE: 'make-';
//Binding
LET: 'let';
LET_STAR: 'let*';
LETR: 'letrec';
//Quotion
QUOTE: 'quote';

//array
MAKE_ARRAY: 'make-array';
AREF: 'aref';

//Boolean literals
T: 't';
NIL: 'nil';
BOOLEAN: T | NIL;

//Conditional keywords
IF: 'if';
WHEN: 'when';
UNLESS: 'unless';
COND: 'cond';
CASE: 'case';
AND: 'and' | '&&';
OR: 'or' | '||';
NOT: 'not' | '!';

//Non-local exits
RETURN: 'return';
RETURN_FROM: 'return-from';
ERROR: 'error';
BLOCK: 'block';

//function
FUNCTION: 'function';
APPLY: 'apply';
FUNCALL: 'funcall';
MAPCAR: 'mapcar';
LAMBDA: 'lambda';
SORT: 'sort';
EQ: 'eq';
EQUAL: 'equal';
EQL: 'eql';
APPEND: 'append';
REVERSE: 'reverse';
MEMBER: 'member';
FIND: 'find';
SUBSETP: 'subsetp';
INTERSECTION: 'intersection';
UNION: 'union';
SETDIFFERENCE: 'set-difference';

//
CONS: 'cons';
//List
LIST : 'list' ;

REST: '&rest';
KEY: '&key';

//string
STRING: '"' (ESC | ~["\\] | '\n')* '"';
STRING_FORMAT: '"' .*? '"';
fragment ESC: '\\' ('"' | '\\' | 'n');
FORMAT_TEMPLATE: STRING;
STREAM: [a-zA-Z_][a-zA-Z0-9_-]*;


//Atom
ATOM: NUMBER | SYMBOL | STRING;


