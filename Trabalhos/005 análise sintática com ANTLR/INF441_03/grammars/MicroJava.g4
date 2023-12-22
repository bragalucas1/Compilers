grammar MicroJava;

@header {
package srcparser;
}

//---------------------------------------------------------
//    Lexer Definitions
//---------------------------------------------------------

fragment LETTER 
	: 'a'..'z' 
	| 'A'..'Z'
	;
	
fragment DIGIT 
	: '0'..'9'
	;
	
fragment EXPONENT 
	: ('e'|'E') ('+'|'-')? DIGIT+ 
	;
	
TYPE
	: 'int'
	| 'float'
	| 'double'
	| 'char'
	;

IDENT 
	: LETTER (LETTER | DIGIT)*
	;
	
	
INT_NUMBER 
	: DIGIT+
	;

REAL_NUMBER 
	: DIGIT+ ('.' DIGIT*)? EXPONENT?
  	| '.' DIGIT+ EXPONENT?
  	;

CHAR_CONST 
	: '\"' ~('\r' | '\n' | '\"')* '\"' 
	;

COMMENT 
	: '/*' .*? '*/' 
	;
	
LINE_COMMENT 
	: '//' ~('\n'|'\r')* '\r'? '\n'  
	;
	
WS
	: (' ' | '\t' | '\r' | '\n') -> skip 
	;



//---------------------------------------------------------
//    Parser Definitions
//---------------------------------------------------------

program 
	: 'program' IDENT methodDecl* 
	;

typeOrVoid 
	: TYPE
	| 'void' 
	;

 	
methodDecl 
	: typeOrVoid IDENT '(' ')'  methodDeclVariable* block 
	;

methodDeclVariable
 	: TYPE IDENT (';'| (',' IDENT)+ ';' ) //TYPE IDENT  (',' IDENT)* ';'
 	;

block 
	: '{' statement* '}' 
	;

statement 
	: IDENT '=' expr ';'
  	| 'return' expr? ';'
  	| block
  	| 'if' '(' condition ')' statement ('else' statement)?
  	;

condition 
	: expr relOp expr 
	;

relOp 
	: '<' 
	| '>' 
	| '<=' 
	| '>=' 
	| '!=' 
	| '==' 
	;

expr 
	: '-'? term (addOp term)* 
	;

term 
	: factor (mulOp factor)* 
	;

factor 
	: INT_NUMBER
	| REAL_NUMBER
	| CHAR_CONST 
  	| IDENT
  	| '(' expr ')'
  	;

addOp 
	: '+' 
	| '-' 
	;
	
mulOp 
	: '*' 
	| '/' 
	| '%' 
	;

