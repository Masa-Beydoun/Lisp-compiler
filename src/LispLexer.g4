lexer grammar LispLexer;

DEFSTRUCT: 'defstruct';
MAKE: 'make-';
KEYWORD: ':' IDENTIFIER;


// WhiteSpace
WS: [ \t\r\n]+ -> skip;


COMMENT: ';' .*? '\n' -> skip;
BLOCK_COMMENT: ';;' .*? '\n' -> skip;
MULTI_LINE_COMMENT: '#|' .*? '|#' -> skip;


///////////////////////////////////////
CHAR_LITERAL: HASH_TAG BACKSLASH ( [a-zA-Z0-9] | 'newline' | 'space' | 'tab' );
CHAR : 'char';
STRING_WORD : 'string';
LIST: 'listClass';
CONCATENATE : 'concatenate';
VECTOR: 'vector';
BACKSLASH : '\\';
MAKE_FOO : 'make-foo';
FORMAT: 'format' -> pushMode(FORMAT_MODE);

//////////////////////////////////////////
COMMA : ',' ;
SEMI_COLON:';';
COLON: ':';
DOT: '.';
QUESTION_MARK: '?';
HASH_TAG: '#';


NUMBER : INTEGER | FLOAT | SCIENTIFIC | COMPLEX | FLOAT;
INTEGER: ('+' | '-')? ('0' | [1-9][0-9]*);
FLOAT: ('+' | '-')? [0-9]+ '.' [0-9]+;
SCIENTIFIC: ('+' | '-')? [0-9]+ ('.' [0-9]+)? ('e' | 'E') ('+' | '-')? [0-9]+;
COMPLEX: '#c(' NUMBER NUMBER ')';
CONSTANT
    : 'pi' { setText(Double.toString(Math.PI)); }
    | 'e' { setText(Double.toString(Math.E)); }
    ;

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


PRINT : 'print';

//yara
STARS:  '**' | '***' ;
//SINGLE_QUOTE: '\'';
HASH_QUOTE: '#\'';

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
OPTIONAL:'&optional';

// Logical Operators
BIT_AND: '&';
BIT_XOR: '^';
BIT_OR: '|';

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
//DEFSTRUCT: 'defstruct';
//MAKE: 'make';
//Binding
LET: 'let';
LET_STAR: 'let*';
LETR: 'letrec';
//Quotion
QUOTE: 'quote';
SINGLE_QUOTE: '\'';
EVENP : 'evenp';

//array
MAKE_ARRAY: 'make-array';
AREF: 'aref';
INCF : 'incf';

//Boolean literals
T: 't';
NIL: 'nil';

//Conditional keywords
IF: 'if';
WHEN: 'when';
UNLESS: 'unless';
COND: 'cond';
CASE: 'case';
AND: 'and' | '&&';
OR: 'or' | '||';
NOT: 'not' | '!';
PROGN : 'progn' ;

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
STABLE_SORT: 'stable-sort';
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
//CONCATENATE :'concatenate';

//List
REST: '&rest';
KEY: '&key';

//CHAR : 'char';
//STRING_WORD : 'string';
//VECTOR : 'vector';

SPECIAL_VARIABLE: '*' [a-zA-Z_][a-zA-Z0-9_-]* '*' ;

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_-]*;

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

fragment ESC: '\\' (['"\\nrt] | UNICODE_ESCAPE) ;

fragment UNICODE_ESCAPE: 'u' HEX HEX HEX HEX;

fragment HEX
    : [0-9a-fA-F];


//IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_-]* ;
//CHAR_LITERAL: [a-zA-Z];
SYMBOL: [a-zA-Z_][a-zA-Z0-9]* ;




mode FORMAT_MODE;
WS2: [ \t\r\n]+ -> skip;
T2:'t';
NIL2:'nil';

FORMAT_STRING
    : '"' (FORMAT_ESC | DIRECTIVE | ~["\\~])* {
        setText(getText()
            .substring(1, getText().length() - 1) // Remove surrounding quotes
            .replace("\\\"", "\"")               // Unescape double quotes
            .replace("\\\\", "\\")               // Unescape backslashes
            .replace("\\n", "\n")                // Unescape newlines
            .replace("\\t", "\t")                // Unescape tabs
            .replace("\\r", "\r")                // Unescape carriage returns
            .replace("~%", "\n")                 // Handle newline directive
            .replace("~T", "\t")                 // Handle tab directive
            .replace("~~", "~")                  // Handle literal tilde directive
            .replace("~D", "<decimal>")          // Placeholder for decimals
            .replace("~A", "<string-like>")      // Placeholder for strings
            .replace("~F", "<float>")            // Placeholder for floats
            .replace("~E", "<scientific>")       // Placeholder for scientific notation
            .replace("~S", "<escaped-data>"));   // Placeholder for escaped data
    } '"' -> popMode
    ;

DIRECTIVE: '~' [a-zA-Z%~];

fragment FORMAT_ESC: '\\' (['"\\nrt] | UNICODE_ESCAPE);

