grammar SimpleExpr;

import SimpleExprRules;

@header {
    package SimpleExpr;
}

prog: stat* EOF;

stat
    : functionDeclaration ';'
    | varDeclaration ';'
    | assignStatement ';'
    | postIncrementStatement ';'
    | postDecrementStatement ';'
    | preIncrementStatement ';'
    | preDecrementStatement ';'
    | expr ';'
    | functionDefinition
    | 'if' condi '{' stat* '}'
        ('else' 'if' condi '{' stat* '}')*
        ('else' '{' stat* '}')?
    | loop
    | 'print' expr ';'
    | 'println' expr ';'
    | 'return' expr ';'
    ;

expr
    : expr ADD multiplyExpr        # AddExpr
    | expr MINUS multiplyExpr     # SubtractExpr
    | multiplyExpr                # BaseExpr
    ;

multiplyExpr
    : multiplyExpr MUL atomicExpr  # MultiplicationExpression
    | multiplyExpr DIV atomicExpr  # DivideExpr
    | atomicExpr                  # BaseMultiplyExpr
    ;

atomicExpr
    : ID                          # IdExpr
    | INT                         # IntLiteral
    | FLOAT                       # FloatLiteral
    | LPAREN expr RPAREN          # ParenExpr
    ;

assignStatement: ID '=' expr;
postIncrementStatement: ID '++';
postDecrementStatement: ID '--';
preIncrementStatement: '++' ID;
preDecrementStatement: '--' ID;

condi: expr (BIGGER | SMALLER | BIGGER_EQUAL | SMALLER_EQUAL | EQUAL | NOT_EQUAL) expr;

loop
    : WHILE expr '{' stat* '}'
    | FOR '(' forInit ';' condi ';' forIter ')' '{' stat* '}'
    ;

forInit: declaration;

forIter: ID '=' expr | ID '++' | '++' ID | ID '--' | '--' ID;

declaration: type ID ('=' expr)? ';';

functionDefinition: mainFunction | normalFunction;
mainFunction: 'int' 'main' LPAREN RPAREN '{' stat* '}';
normalFunction: type ID LPAREN parameterList? RPAREN '{' stat* '}';

parameter: type ID;
type: INT_KEYWORD | FLOAT_KEYWORD | STRING_KEYWORD | BOOL_KEYWORD | VOID_KEYWORD | ID;
block: '{' stat* '}';
paramList: param (',' param)*;
parameterList: parameter (',' parameter)*;
param: type ID;

varDeclaration: type ID ('=' expr)?;

functionDeclaration: type ID LPAREN (paramList)? RPAREN block;
