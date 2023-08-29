lexer grammar SimpleExprRules;

SEMI : ';' ;
IF : 'if' ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
MINUS: '-' ;
LPAREN : '(' ;
RPAREN : ')' ;
BIGGER : '>' ;
SMALLER : '<' ;
BIGGER_EQUAL : '>=' ;
SMALLER_EQUAL : '<=' ;
EQUAL: '==' ;
ELSE : 'else' ;
ASSIGN : '=' ;
NOT_EQUAL : '!=' ;
AND : '&&' ;
OR : '||' ;
NOT : '!' ;
RETURN : 'return' ;
FOR : 'for' ;
WHILE : 'while' ;
INT_KEYWORD : 'int';
FLOAT_KEYWORD : 'float';
VOID_KEYWORD : 'void';
BOOL_KEYWORD : 'bool';
TRUE_KEYWORD : 'true';
FALSE_KEYWORD : 'false';
COMMA: ',';
LBRACE: '{';
RBRACE: '}';
INCREMENT: '++';
DECREMENT: '--';

ID: (LETTER | '_')(LETTER | DIGIT | '_')* ;
INT: '0' | [1-9] DIGIT* ;
FLOAT: INT '.' DIGIT* | '.' DIGIT+ ;
WS: [ \t\n\r]+ -> skip ;
Sl_COMMENT: '//' ~[\r\n]* -> skip ;
ML_COMMENT: '/*' .*? '*/' -> skip ;





fragment DIGIT: [0-9] ;
fragment LETTER: [a-zA-Z_] ;
