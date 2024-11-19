lexer grammar First;


// WhiteSpace
WS: [ \t\r\n]+ -> skip;

COMMA : ',' ;
SEMI_COLON: ';';
COLON: ':';
DOT: '.';
QUESTION_MARK: '?';
HASH_TAG: '#';
DOUBLE_QUOTATION: '"';

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
//For multi-line comments, you can use the #| and |# delimiters:
COMMENTS1 : '#|';
COMMENTS2 : '|#';



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



FORMAT_TEMPLATE: STRING ;
STREAM : [a-zA-Z_][a-zA-Z0-9_-]*;



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


//variable (identifier)
SYMBOL : [a-zA-Z_][a-zA-Z_0-9]* ;


STRING : '"' ( ESC_SEQ | ~[\\"\n\r] )* '"'
      {
          // Java code to handle the unescaping within ANTLR
          String text = getText();
          setText(text.substring(1, text.length() - 1)  // Remove the surrounding quotes
                     .replace("\\\\", "\\")
                     .replace("\\n", "\n")
                     .replace("\\t", "\t")
                     .replace("\\r", "\r")
                     .replace("\\b", "\b")
                     .replace("\\f", "\f")
                     .replace("\\\"", "\""));
      };

fragment ESC_SEQ : '\\' [nrtbf\\"] ;


