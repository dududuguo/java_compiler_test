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
	 * Visit a parse tree produced by {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SimpleExprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#multiplyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpr(SimpleExprParser.MultiplyExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#atomicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicExpr(SimpleExprParser.AtomicExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#condi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondi(SimpleExprParser.CondiContext ctx);
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
	 * Visit a parse tree produced by {@link SimpleExprParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SimpleExprParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(SimpleExprParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(SimpleExprParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#normalFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFunction(SimpleExprParser.NormalFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SimpleExprParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SimpleExprParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SimpleExprParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(SimpleExprParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(SimpleExprParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(SimpleExprParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(SimpleExprParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(SimpleExprParser.ParameterListContext ctx);
}