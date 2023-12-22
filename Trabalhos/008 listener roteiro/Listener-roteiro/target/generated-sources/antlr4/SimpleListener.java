// Generated from Simple.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull SimpleParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull SimpleParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull SimpleParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull SimpleParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull SimpleParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull SimpleParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull SimpleParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull SimpleParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OneFactor}
	 * labeled alternative in {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void enterOneFactor(@NotNull SimpleParser.OneFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OneFactor}
	 * labeled alternative in {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void exitOneFactor(@NotNull SimpleParser.OneFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Real}
	 * labeled alternative in {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterReal(@NotNull SimpleParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Real}
	 * labeled alternative in {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitReal(@NotNull SimpleParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull SimpleParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull SimpleParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OneTerm}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOneTerm(@NotNull SimpleParser.OneTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OneTerm}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOneTerm(@NotNull SimpleParser.OneTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull SimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull SimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull SimpleParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull SimpleParser.IdContext ctx);
}