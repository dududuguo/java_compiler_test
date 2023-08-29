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
	 * Enter a parse tree produced by the {@code EqualExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(SimpleExprParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(SimpleExprParser.EqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SmallerEqualExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSmallerEqualExpr(SimpleExprParser.SmallerEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SmallerEqualExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSmallerEqualExpr(SimpleExprParser.SmallerEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BiggerEqualExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBiggerEqualExpr(SimpleExprParser.BiggerEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BiggerEqualExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBiggerEqualExpr(SimpleExprParser.BiggerEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOrExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndOrExpr(SimpleExprParser.AndOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOrExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndOrExpr(SimpleExprParser.AndOrExprContext ctx);
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
	 * Enter a parse tree produced by the {@code NotEqualExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualExpr(SimpleExprParser.NotEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualExpr(SimpleExprParser.NotEqualExprContext ctx);
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
	 * Enter a parse tree produced by the {@code SmallerExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSmallerExpr(SimpleExprParser.SmallerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SmallerExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSmallerExpr(SimpleExprParser.SmallerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SimpleExprParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SimpleExprParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BiggerExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBiggerExpr(SimpleExprParser.BiggerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BiggerExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBiggerExpr(SimpleExprParser.BiggerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpr(SimpleExprParser.ArithmeticExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpr(SimpleExprParser.ArithmeticExprContext ctx);
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
	 * Enter a parse tree produced by the {@code CallFunctionExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallFunctionExpr(SimpleExprParser.CallFunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallFunctionExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallFunctionExpr(SimpleExprParser.CallFunctionExprContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleExprParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SimpleExprParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SimpleExprParser.ReturnStatementContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleExprParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(SimpleExprParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(SimpleExprParser.ComparisonExprContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleExprParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(SimpleExprParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(SimpleExprParser.CallFunctionContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleExprParser#returnTypeFunction}.
	 * @param ctx the parse tree
	 */
	void enterReturnTypeFunction(SimpleExprParser.ReturnTypeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#returnTypeFunction}.
	 * @param ctx the parse tree
	 */
	void exitReturnTypeFunction(SimpleExprParser.ReturnTypeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunction(SimpleExprParser.VoidFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunction(SimpleExprParser.VoidFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#typeExceptVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeExceptVoid(SimpleExprParser.TypeExceptVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#typeExceptVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeExceptVoid(SimpleExprParser.TypeExceptVoidContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleExprParser#bolockReturn}.
	 * @param ctx the parse tree
	 */
	void enterBolockReturn(SimpleExprParser.BolockReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#bolockReturn}.
	 * @param ctx the parse tree
	 */
	void exitBolockReturn(SimpleExprParser.BolockReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#blockVoid}.
	 * @param ctx the parse tree
	 */
	void enterBlockVoid(SimpleExprParser.BlockVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#blockVoid}.
	 * @param ctx the parse tree
	 */
	void exitBlockVoid(SimpleExprParser.BlockVoidContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleExprParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(SimpleExprParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(SimpleExprParser.MainContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleExprParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SimpleExprParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SimpleExprParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#ifBOLOCK}.
	 * @param ctx the parse tree
	 */
	void enterIfBOLOCK(SimpleExprParser.IfBOLOCKContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#ifBOLOCK}.
	 * @param ctx the parse tree
	 */
	void exitIfBOLOCK(SimpleExprParser.IfBOLOCKContext ctx);
}