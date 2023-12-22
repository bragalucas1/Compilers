grammar Simple;

//---------------------------------------------------------
//    Parser Definitions
//---------------------------------------------------------

p : v b ;

v : 'var' z+ ;

z : ID ('[' NUM ']')? ;

b : '{' s* '}' ;

s : b | a | w | i | i2 | w2;

w2: 'while' '(' c ')' s;

a : ID ( '[' e1=e ']' )? '=' e2=e ';' ;

w : 'print' e ';' ;

i : 'if' '(' c ')' s ;

i2: 'if' '(' c ')' s 'else' s;

c : e x e ;

x :  '>=' | '<=' ;

e :
    e y t   # addsub
  | t       # term
  ;

y : '+' | '-' ;

t : t1 | t2 ;

t1 : NUM ;

t2 : ID ( '[' e ']' )?;

  
//---------------------------------------------------------
//    Lexer Definitions
//---------------------------------------------------------

fragment LETTER : 'a'..'z' | 'A'..'Z';
fragment DIGIT : '0'..'9';
ID : LETTER (LETTER | DIGIT)*;
NUM : DIGIT+;
CHAR_CONST : '\"' ~('\r' | '\n' | '\"')* '\"' ;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' ~('\n'|'\r')* '\r'? '\n' -> skip;
WS : (' ' | '\t' | '\r' | '\n') -> skip;
