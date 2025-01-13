parser grammar LispParser;

options { tokenVocab=LispLexer; }

programs : ( program )* | EOF;

program: OPEN_PAREN ( true |evenp | condition |
         array |string | structure| assignment | if_statement | cond | ) CLOSE_PAREN;

atom :
    CHAR_LITERAL
    | SPECIAL_VARIABLE ;

value:
    SPECIAL_VARIABLE
    | CHAR_LITERAL
    | NUMBER
    | IDENTIFIER
    | STRING
    | OPEN_PAREN value+ CLOSE_PAREN
    | NIL ;

evenp : EVENP value ;
true : T either ;

either :(program | IDENTIFIER | NUMBER | SINGLE_QUOTE);


///////////////////////////////////////////////////////////////////////////////////////////////////////////////
// array :

array
     : array_definition
     | array_elements_access
     | array_elements_operations ;

array_definition
                : twoDArray
                | oneDArray  ;


twoDArray :  MAKE_ARRAY SINGLE_QUOTE OPEN_PAREN NUMBER NUMBER ;
oneDArray :  MAKE_ARRAY either ;

array_elements_access : AREF (multiply | IDENTIFIER either ) ;

array_elements_operations : operation_type OPEN_PAREN array_elements_access CLOSE_PAREN;
operation_type
              : PUSH either
              | POP
              | INCF ;


///////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Strings:

string
      : concatenate_definition
      | concatenate_elements_call ;


concatenate_definition : CONCATENATE SINGLE_QUOTE concatenate_type ;
concatenate_type
                :string_concatenate
                | vector_concatenate
                | list_concatenate;

string_concatenate : STRING_WORD STRING* |  STRING_WORD (either_list)*;
list_concatenate : LIST STRING* ;
vector_concatenate : VECTOR  (SINGLE_QUOTE vector_elements)* ;

either_list: SINGLE_QUOTE OPEN_PAREN (HASH_TAG BACKSLASH CHAR_LITERAL)* CLOSE_PAREN;
vector_elements: HASH_TAG OPEN_PAREN (NUMBER)* CLOSE_PAREN;

concatenate_elements_call : element_access STRING either  ;
element_access : CHAR | AREF ;



///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Structures :

structure
         : create_structures
         | create_an_instance
         | access ;

create_structures: DEFSTRUCT IDENTIFIER (IDENTIFIER)* ;

create_an_instance :  MAKE either
                    | MAKE MINUS IDENTIFIER (COLON IDENTIFIER either)*  ;

// (foo-bar *)
// (foo-baaz **)
//(foo-baaz *my-foo*)
//(foo-bar a)
//accesses : OPEN_PAREN IDENTIFIER MULTIPLY IDENTIFIER MULTIPLY CLOSE_PAREN ;
access : IDENTIFIER MINUS IDENTIFIER  ;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//assignment :

assignment : setq_assignment | setf_assignment ;
setq_assignment : SETQ SINGLE_QUOTE* IDENTIFIER either ;
setf_assignment : SETF SINGLE_QUOTE* either either ;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Booleans and Conditionals :

//  ???CLOSE PAREND ISSUE???
if_statement
    : IF either either either
    | IF comparison_type (expression_sequence)+
    | (WHEN | UNLESS) comparison_type2 (expression_sequence)*;


comparison_type
    : T either either //CLOSE_PAREN
    | NULL either either //CLOSE_PAREN
    | OPEN_PAREN condition CLOSE_PAREN ;

comparison_type2 : T | NULL either ;

expression_sequence: single_expression | multiple_expression ;

single_expression : program ;
multiple_expression : OPEN_PAREN (PROGN)* (program)* CLOSE_PAREN ;

//////////////////////////////////////////////////

cond : COND (cond_exp)*;
cond_exp : program | OPEN_PAREN (program)* either* CLOSE_PAREN  ;

//////////////////////////////////////////////

//case : CASE IDENTIFIER case_exp* ;
//case_exp :  OPEN_PAREN (program)* either* CLOSE_PAREN  ;

////////////////////////////////////////////////////////////////////////////////
