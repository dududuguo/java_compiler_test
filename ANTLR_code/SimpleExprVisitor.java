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
	 * Visit a parse tree produced by {@link SimpleExprParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(SimpleExprParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(SimpleExprParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(SimpleExprParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExprParser#visibility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibility(SimpleExprParser.VisibilityContext ctx);
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
	 * Visit a parse tree produced by {@link SimpleExprParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(SimpleExprParser.ParameterListContext ctx);
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
	 * Visit a parse tree produced by {@link SimpleExprParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(SimpleExprParser.VarDeclarationContext ctx);
}