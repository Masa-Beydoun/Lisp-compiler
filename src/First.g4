lexer grammar First;

// WhiteSpace
WS: [ \t\r\n]+ -> skip;

//Symbols
SYMBOL: [a-zA-Z_][a-zA-Z_0-9]* ;
COMMA : ',' ;
SEMI_COLON: ';';
COLON: ':';
DOT: '.';
QUESTION_MARK: '?';
HASH_TAG: '#';
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

// Comparison Operators
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
FLOOR: 'floor';
CEILING: 'ceiling';
MOD: 'mod';
SIN: 'sin';
COS: 'cos';
TAN:'tan';
SQRT:'sqrt';
EXP: 'exp';
EXPT: 'expt';
CAR: 'car';
CDR: 'cdr';

// Logical Operators
BIT_AND: '&';
BIT_XOR: '^';
BIT_OR: '|';

//Identifier
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]* ;
SPECIAL_VARIABLE: '*' IDENTIFIER '*';

//Comment
COMMENT: ';' .*? '\n' -> skip;
BLOCK_COMMENT: ';;' .*? '\n' -> skip;
MULTI_LINE_COMMENT: '#|' .*? '|#' -> skip;

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

// Rule for escape sequences
fragment ESC_SEQ : '\\' [nrtbf\\"] ;

//Atom
ATOM: NUMBER | SYMBOL | STRING;


