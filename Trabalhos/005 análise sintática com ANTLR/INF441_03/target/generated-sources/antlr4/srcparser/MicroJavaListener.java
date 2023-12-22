// Generated from MicroJava.g4 by ANTLR 4.4

package srcparser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MicroJavaParser}.
 */
public interface MicroJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#methodDeclVariable}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclVariable(@NotNull MicroJavaParser.MethodDeclVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#methodDeclVariable}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclVariable(@NotNull MicroJavaParser.MethodDeclVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#typeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeOrVoid(@NotNull MicroJavaParser.TypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#typeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeOrVoid(@NotNull MicroJavaParser.TypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(@NotNull MicroJavaParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(@NotNull MicroJavaParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull MicroJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull MicroJavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(@NotNull MicroJavaParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(@NotNull MicroJavaParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(@NotNull MicroJavaParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(@NotNull MicroJavaParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull MicroJavaParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull MicroJavaParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(@NotNull MicroJavaParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(@NotNull MicroJavaParser.MulOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MicroJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MicroJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MicroJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MicroJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull MicroJavaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull MicroJavaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull MicroJavaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull MicroJavaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull MicroJavaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull MicroJavaParser.FactorContext ctx);
}