// Generated from C:/Users/11388/IdeaProjects/demo/src/main/java/ANTLR_code\SimpleExpr.g4 by ANTLR 4.12.0
package ANTLR_code;


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
	 * Enter a parse tree produced by the {@code BaseExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBaseExpr(SimpleExprParser.BaseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BaseExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBaseExpr(SimpleExprParser.BaseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(SimpleExprParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(SimpleExprParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubtractExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubtractExpr(SimpleExprParser.SubtractExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubtractExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubtractExpr(SimpleExprParser.SubtractExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BaseMultiplyExpr}
	 * labeled alternative in {@link SimpleExprParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void enterBaseMultiplyExpr(SimpleExprParser.BaseMultiplyExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BaseMultiplyExpr}
	 * labeled alternative in {@link SimpleExprParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void exitBaseMultiplyExpr(SimpleExprParser.BaseMultiplyExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicationExpression}
	 * labeled alternative in {@link SimpleExprParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpression(SimpleExprParser.MultiplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicationExpression}
	 * labeled alternative in {@link SimpleExprParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpression(SimpleExprParser.MultiplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideExpr}
	 * labeled alternative in {@link SimpleExprParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpr(SimpleExprParser.DivideExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideExpr}
	 * labeled alternative in {@link SimpleExprParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpr(SimpleExprParser.DivideExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link SimpleExprParser#atomicExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(SimpleExprParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link SimpleExprParser#atomicExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(SimpleExprParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link SimpleExprParser#atomicExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(SimpleExprParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link SimpleExprParser#atomicExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(SimpleExprParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatLiteral}
	 * labeled alternative in {@link SimpleExprParser#atomicExpr}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(SimpleExprParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatLiteral}
	 * labeled alternative in {@link SimpleExprParser#atomicExpr}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(SimpleExprParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link SimpleExprParser#atomicExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(SimpleExprParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link SimpleExprParser#atomicExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(SimpleExprParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(SimpleExprParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(SimpleExprParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#postIncrementStatement}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementStatement(SimpleExprParser.PostIncrementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#postIncrementStatement}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementStatement(SimpleExprParser.PostIncrementStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#postDecrementStatement}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementStatement(SimpleExprParser.PostDecrementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#postDecrementStatement}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementStatement(SimpleExprParser.PostDecrementStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#preIncrementStatement}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementStatement(SimpleExprParser.PreIncrementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#preIncrementStatement}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementStatement(SimpleExprParser.PreIncrementStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#preDecrementStatement}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementStatement(SimpleExprParser.PreDecrementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#preDecrementStatement}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementStatement(SimpleExprParser.PreDecrementStatementContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleExprParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(SimpleExprParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(SimpleExprParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(SimpleExprParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(SimpleExprParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#normalFunction}.
	 * @param ctx the parse tree
	 */
	void enterNormalFunction(SimpleExprParser.NormalFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#normalFunction}.
	 * @param ctx the parse tree
	 */
	void exitNormalFunction(SimpleExprParser.NormalFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SimpleExprParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SimpleExprParser.ParameterContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleExprParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleExprParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(SimpleExprParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(SimpleExprParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(SimpleExprParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(SimpleExprParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(SimpleExprParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(SimpleExprParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(SimpleExprParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(SimpleExprParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(SimpleExprParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(SimpleExprParser.FunctionDeclarationContext ctx);
}