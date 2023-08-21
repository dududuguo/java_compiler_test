lexer grammar SimpleExprRules;

   // 词法分析器, + 一个或多个, * 0个或多个, ? 0个或1个
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
RETURN : 'return' ;
FOR : 'for' ;
WHILE : 'while' ;
BREAK : 'break' ;
INT_KEYWORD : 'int';
DOUBLE_KEYWORD : 'double';
FLOAT_KEYWORD : 'float';
CHAR_KEYWORD : 'char';
VOID_KEYWORD : 'void';
STRING_KEYWORD : 'string';
BOOL_KEYWORD : 'bool';
TRUE_KEYWORD : 'true';
FALSE_KEYWORD : 'false';
CLASS_KEYWORD : 'class';
THIS_KEYWORD : 'this';
NEW_KEYWORD : 'new';
NULL_KEYWORD : 'null';
PUBLIC_KEYWORD : 'public';
PRIVATE_KEYWORD : 'private';
PROTECTED_KEYWORD : 'protected';
COMMA: ',';
LBRACE: '{';
RBRACE: '}';

// 词法分析器, 识别标识符, 以字母或者下划线开头, 后面可以是字母, 下划线, 数字
ID: (LETTER | '_')(LETTER | DIGIT | '_')* ;
// 005被堪称一个整数, 错误的, 要把0单独拿出来
INT: '0' | [1-9] DIGIT* ;
FLOAT: INT '.' DIGIT*
     | '.' DIGIT+ ;

WS: [ \t\n\r]+ -> skip ; // 空格, tab, 换行符, 回车符, 跳过

// ? 所有
//SL_COMMENT: '//' .*? '\n' -> skip ; // 单行注释
Sl_COMMENT: '//' ~[\r\n]* -> skip ; // 单行注释, 除了换行符其他的所有字符都可以
DOC_COMMENT: '/**' .*? '*/' -> skip ; // 文档注释
ML_COMMENT: '/*' .*? '*/' -> skip ; // 多行注释
parameterList: parameter (',' parameter)*;






fragment DIGIT: [0-9] ;
fragment LETTER: [a-zA-Z_] ;