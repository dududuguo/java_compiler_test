grammar SimpleExpr;

import SimpleExprRules;

@header {
    package SimpleExpr;
}

prog: stat* EOF;

stat
    : functionDeclaration ';'
    | functionDefinition
    | varDeclaration ';'
    | assignStatement ';'
    | postIncrementStatement ';'
    | postDecrementStatement ';'
    | preIncrementStatement ';'
    | preDecrementStatement ';'
    | expr ';'
    | ifStatement
    | loop
    | 'print' expr ';'
    | 'println' expr ';'
    | main
    ;

expr
    : expr ADD multiplyExpr       # AddExpr
    | expr MINUS multiplyExpr     # SubtractExpr
    | multiplyExpr                # BaseExpr
    | expr (AND|OR) expr          # AndOrExpr
    | '"' expr '"'                # StringLiteral
    | expr EQUAL expr             # EqualExpr
    | expr NOT_EQUAL expr         # NotEqualExpr
    | expr BIGGER expr            # BiggerExpr
    | expr SMALLER expr           # SmallerExpr
    | expr BIGGER_EQUAL expr      # BiggerEqualExpr
    | expr SMALLER_EQUAL expr     # SmallerEqualExpr
    | callFunction                # CallFunctionExpr
    | expr (ADD|MINUS|MUL|DIV) expr # ArithmeticExpr
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

returnStatement: 'return' expr ';'
               | 'return' ';'
               | 'return' expr (ADD|MINUS|MUL|DIV) expr';'
               ;

condi: expr (BIGGER | SMALLER | BIGGER_EQUAL | SMALLER_EQUAL | EQUAL | NOT_EQUAL) expr;

comparisonExpr:expr;

loop
    : WHILE expr '{' stat* '}'
    | FOR '(' forInit ';' condi ';' forIter ')' '{' stat* '}'
    ;

forInit: varDeclaration;
forIter: ID '=' expr | ID '++' | '++' ID | ID '--' | '--' ID;
callFunction: ID '(' (expr (',' expr)*)? ')';

functionDeclaration: type ID LPAREN (paramList)? RPAREN;
functionDefinition: returnTypeFunction | voidFunction;

returnTypeFunction: functionDeclaration bolockReturn;
voidFunction: functionDeclaration blockVoid;

typeExceptVoid: INT_KEYWORD | FLOAT_KEYWORD | BOOL_KEYWORD | ID;
type: INT_KEYWORD | FLOAT_KEYWORD | BOOL_KEYWORD | VOID_KEYWORD | ID;

paramList: param (',' param)*;
parameterList: parameter (',' parameter)*;
param: type ID;
bolockReturn: '{' stat* stat* returnStatement'}';
blockVoid: '{' stat* '}';

varDeclaration: type ID ('=' expr)?((ADD|MINUS|DIV|MUL) expr)?;

main: 'int' 'main' '(' (paramList)?')' '{' stat* returnStatement '}';


parameter: type ID;
ifStatement: 'if' '(' comparisonExpr ')' '{' ifBOLOCK '}' ( 'else' '{' ifBOLOCK'}' )?;
ifBOLOCK: stat* returnStatement;