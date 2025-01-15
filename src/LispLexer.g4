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
FORMAT: 'format';

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


FORMAT_STRING
    : '"' (FORMAT_ESC | DIRECTIVE | ~["\\])* '"' {
        setText(getText()
            .substring(1, getText().length() - 1) // Remove surrounding quotes
            .replace("\\\"", "\"")               // Unescape double quotes
            .replace("\\\\", "\\")               // Unescape backslashes
            .replace("\\n", "\n")                // Unescape newlines
            .replace("\\t", "\t")                // Unescape tabs
            .replace("\\r", "\r")                // Unescape carriage returns
            .replace("~%", "\n")                 // Handle newline directive
            .replace("~~", "~"));                // Handle literal tilde
    }
    | '"' (FORMAT_ESC | DIRECTIVE | ~["\\])* EOF {
        throw new RuntimeException("Unclosed format string literal at line " + getLine() + ", column " + getCharPositionInLine());
    }
    ;

fragment FORMAT_ESC: '\\' (['"\\nrt] | UNICODE_ESCAPE);
// Specific Format Directives
DIRECTIVE_NEWLINE: '~%';         // Represents a newline.
DIRECTIVE_TAB: '~T';             // Represents a tab.
DIRECTIVE_LITERAL: '~~';         // Represents a literal tilde (~).
DIRECTIVE_DECIMAL: '~D';         // Format decimal numbers.
DIRECTIVE_STRING: '~A';          // Format string-like data.
DIRECTIVE_FLOAT: '~F';           // Format floating-point numbers.
DIRECTIVE_EXPONENT: '~E';        // Format numbers in scientific notation.
DIRECTIVE_PERCENT: '~S';         // Format data with escaping (safe representation).

DIRECTIVE: '~' [a-zA-Z%~];  // Matches any general directive not explicitly defined.

//IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_-]* ;
//CHAR_LITERAL: [a-zA-Z];
SYMBOL: [a-zA-Z_][a-zA-Z0-9]* ;
