
/*
 * O arquivo cont�m a defini��o de uma gram�tica.
 * O tipo pode ser "grammar" ou "lexer grammar".
 * Se for "lexer grammar", � apenas um analisador l�xico;
 * se for "grammar", combina analisador l�xico e sint�tico.
 * O nome da gram�tica tem que ser o mesmo do arquivo.
 * Ser� gerada uma classe Java com mesmo nome da gram�tica.
 */

lexer grammar Lex01;

/*
 * Em seguida, devem ser listadas as regras que definem lexemas.
 * O nome dos lexemas deve come�ar com letra mai�scula.
 */

KW_CLASS : 'class';

KW_IF : 'if';

KW_WHILE : 'while';

SEMICOLON : ';';

OPEN_PAR : '(';

CLOSE_PAR : ')';

PERIOD : '.';

/*
 * Podem tamb�m ser definidos express�es auxiliares que n�o configuram lexemes,
 * mas s�o usadas para auxiliar na constru��o dos lexemas
 * (nesse caso, usar diretiva "fragment").
 */

fragment
LETTER : 'a'..'z' | 'A'..'Z' ;

fragment
DIGIT : '0'..'9' ;

//Antes do ident
KW_PROGRAM : 'program';

IDENT : LETTER (LETTER | DIGIT)* ;

//Após o ident
//KW_PROGRAM : 'program';

//Alteracao para reconhecer floats
//digito+ (('.' digito+) U λ) (('e' ('+' U '-' U λ) digito+) U λ)
//INT 				 	   ⬆                                   ⬆, logo essa solucao iria interpretar int como float
FLOAT
	: DIGIT* '.' DIGIT+
	| DIGIT* ('E'|'e') ('+'| '-' |  ) DIGIT+
	| DIGIT* '.' DIGIT+ ('E'|'e') ('+'| '-' |  ) DIGIT+
	;

INTEGER_LITERAL : DIGIT+ ;


/*
 * Se ao lexema for associada a a��o "-> skip", esse lexema ser� ignorado
 * e o programa ir� prosseguir, tentando construir novo lexema com os
 * caracteres seguintes.
 */

WS : (' '|'\r'|'\t'|'\n') -> skip ;

COMMENT : '/*' .*? '*/' -> skip ;

LINE_COMMENT : '//' ~('\n'|'\r')* '\r'? '\n' -> skip ;
