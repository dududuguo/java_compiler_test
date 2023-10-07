// Generated from C:/Users/11388/IdeaProjects/demo/src/main/java/ANTLR\SimpleExpr.g4 by ANTLR 4.12.0
package ANTLR_code;

    package SimpleExpr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleExprParser}.
 */
public interface SimpleExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SimpleExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimpleExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SimpleExprParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SimpleExprParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#additionExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpr(SimpleExprParser.AdditionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#additionExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpr(SimpleExprParser.AdditionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpr(SimpleExprParser.MultiplyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpr(SimpleExprParser.MultiplyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#atomicExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomicExpr(SimpleExprParser.AtomicExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#atomicExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomicExpr(SimpleExprParser.AtomicExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#condi}.
	 * @param ctx the parse tree
	 */
	void enterCondi(SimpleExprParser.CondiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#condi}.
	 * @param ctx the parse tree
	 */
	void exitCondi(SimpleExprParser.CondiContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(SimpleExprParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(SimpleExprParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(SimpleExprParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(SimpleExprParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#forIter}.
	 * @param ctx the parse tree
	 */
	void enterForIter(SimpleExprParser.ForIterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#forIter}.
	 * @param ctx the parse tree
	 */
	void exitForIter(SimpleExprParser.ForIterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SimpleExprParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SimpleExprParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimpleExprParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimpleExprParser.TypeContext ctx);
}