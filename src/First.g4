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


// Number
NUMBER : [1-9]+;
INTEGER: '0' | [1-9][0-9]*;
FLOAT: [0-9]+ '.'[0-9]+;

BOOLEAN : 'T' | 'NIL';
//BOOLEAN: 'true' | 'false';

// Null Literal
NULL: 'nil';

// Comparison Operators
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

IMPORT: 'import';
EXPORT: 'export';



////////////////////////////////////////////////
// print
PRINT : 'print';


///////////////////////////////////////////////////
// Operators


// Arithmatic Operators
PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIV :'/' ;
MODULUS: '%';

// Logical Operators
BIT_AND: '&';
BIT_XOR: '^';
BIT_OR: '|';
AND: '&&';
OR: '||';

////////////////////////////////////////////////
// IDENTIFIER
DEFPARAMETER :'defparameter' ;
DEFvar: 'defvar';
////////////////////////////////////////////////

//variable (identifier)
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]* ;
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

// Rule for escape sequences
fragment ESC_SEQ : '\\' [nrtbf\\"] ;


