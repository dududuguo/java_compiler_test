// Generated from C:/Users/11388/IdeaProjects/demo/src/main/java/ANTLR_code\SimpleExpr.g4 by ANTLR 4.12.0
package ANTLR_code;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SimpleExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(SimpleExprParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpr(SimpleExprParser.EqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SmallerEqualExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallerEqualExpr(SimpleExprParser.SmallerEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BiggerEqualExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBiggerEqualExpr(SimpleExprParser.BiggerEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOrExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOrExpr(SimpleExprParser.AndOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(SimpleExprParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualExpr(SimpleExprParser.NotEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BaseExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExpr(SimpleExprParser.BaseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SmallerExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallerExpr(SimpleExprParser.SmallerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SimpleExprParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BiggerExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBiggerExpr(SimpleExprParser.BiggerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpr(SimpleExprParser.ArithmeticExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubtractExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractExpr(SimpleExprParser.SubtractExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallFunctionExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunctionExpr(SimpleExprParser.CallFunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BaseMultiplyExpr}
	 * labeled alternative in {@link SimpleExprParser#multiplyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseMultiplyExpr(SimpleExprParser.BaseMultiplyExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicationExpression}
	 * labeled alternative in {@link SimpleExprParser#multiplyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression(SimpleExprParser.MultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivideExpr}
	 * labeled alternative in {@link SimpleExprParser#multiplyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideExpr(SimpleExprParser.DivideExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link SimpleExprParser#atomicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(SimpleExprParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link SimpleExprParser#atomicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(SimpleExprParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatLiteral}
	 * labeled alternative in {@link SimpleExprParser#atomicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(SimpleExprParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link SimpleExprParser#atomicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(SimpleExprParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(SimpleExprParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#postIncrementStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementStatement(SimpleExprParser.PostIncrementStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#postDecrementStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementStatement(SimpleExprParser.PostDecrementStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#preIncrementStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementStatement(SimpleExprParser.PreIncrementStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#preDecrementStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementStatement(SimpleExprParser.PreDecrementStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SimpleExprParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#condi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondi(SimpleExprParser.CondiContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#comparisonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(SimpleExprParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(SimpleExprParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(SimpleExprParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#forIter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIter(SimpleExprParser.ForIterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(SimpleExprParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(SimpleExprParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(SimpleExprParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#returnTypeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnTypeFunction(SimpleExprParser.ReturnTypeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#voidFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunction(SimpleExprParser.VoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#typeExceptVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExceptVoid(SimpleExprParser.TypeExceptVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SimpleExprParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(SimpleExprParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(SimpleExprParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(SimpleExprParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#bolockReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBolockReturn(SimpleExprParser.BolockReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#blockVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockVoid(SimpleExprParser.BlockVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(SimpleExprParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(SimpleExprParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SimpleExprParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SimpleExprParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#ifBOLOCK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBOLOCK(SimpleExprParser.IfBOLOCKContext ctx);
}