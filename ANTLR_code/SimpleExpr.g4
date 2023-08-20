grammar SimpleExpr;
import SimpleExprRules;

@header {
    package SimpleExpr;
}

prog: stat* EOF;

stat
    :varDeclaration
    |expr ';'
    | declaration
    | functionDeclaration
    | functionDefinition
    | classDeclaration
    | 'if' condi '{' stat* '}'
        ('else' 'if' condi '{' stat* '}')*
        ('else' '{' stat* '}')?
    | loop
    | 'print' expr ';'
    | 'println' expr ';'
    | 'return' expr ';'
    ;



classDeclaration: visibility? 'class' ID '{' classBody* '}' ;

classBody: methodDeclaration | declaration ;

methodDeclaration: type ID LPAREN parameterList? RPAREN '{' stat* '}' ;

visibility: 'public' | 'private' | 'protected' ;

expr
    : multiplyExpr ( (ADD | MINUS) multiplyExpr)*
    ;

multiplyExpr
    : atomicExpr ( (MUL | DIV) atomicExpr)*
    ;

atomicExpr
    : ID '=' expr
    | ID '++'
    | ID '--'
    | '++' ID
    | '--' ID
    | ID
    | INT
    | FLOAT
    | LPAREN expr RPAREN
    ;

condi: expr (BIGGER | SMALLER | BIGGER_EQUAL | SMALLER_EQUAL | EQUAL | NOT_EQUAL) expr;

loop
    : WHILE expr '{' stat* '}'
    | FOR '(' forInit ';' condi ';' forIter ')' '{' stat* '}'
    ;

forInit: declaration;

forIter: ID '=' expr | ID '++' | '++' ID | ID '--' | '--' ID;

declaration : type ID ('=' expr)? ';';

functionDeclaration: type ID LPAREN parameterList? RPAREN ';';

functionDefinition: type ID LPAREN parameterList? RPAREN '{' stat* '}';

parameterList: parameter (',' parameter)*;

parameter: type ID;

type: INT_KEYWORD | FLOAT_KEYWORD | STRING_KEYWORD | BOOL_KEYWORD| VOID_KEYWORD | ID;

varDeclaration
              : type ID ';'
              ;