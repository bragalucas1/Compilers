// Generated from MicroJava.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MicroJavaParser}.
 */
public interface MicroJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code New}
	 * labeled alternative in {@link MicroJavaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNew(@NotNull MicroJavaParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code New}
	 * labeled alternative in {@link MicroJavaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNew(@NotNull MicroJavaParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Stblock}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStblock(@NotNull MicroJavaParser.StblockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Stblock}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStblock(@NotNull MicroJavaParser.StblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DesigDot}
	 * labeled alternative in {@link MicroJavaParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesigDot(@NotNull MicroJavaParser.DesigDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DesigDot}
	 * labeled alternative in {@link MicroJavaParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesigDot(@NotNull MicroJavaParser.DesigDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MicroJavaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull MicroJavaParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MicroJavaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull MicroJavaParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link MicroJavaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull MicroJavaParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link MicroJavaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull MicroJavaParser.ParensContext ctx);
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
	 * Enter a parse tree produced by the {@code TypeWithoutArray}
	 * labeled alternative in {@link MicroJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeWithoutArray(@NotNull MicroJavaParser.TypeWithoutArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeWithoutArray}
	 * labeled alternative in {@link MicroJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeWithoutArray(@NotNull MicroJavaParser.TypeWithoutArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DesigArray}
	 * labeled alternative in {@link MicroJavaParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesigArray(@NotNull MicroJavaParser.DesigArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DesigArray}
	 * labeled alternative in {@link MicroJavaParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesigArray(@NotNull MicroJavaParser.DesigArrayContext ctx);
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
	 * Enter a parse tree produced by {@link MicroJavaParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(@NotNull MicroJavaParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(@NotNull MicroJavaParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DesigId}
	 * labeled alternative in {@link MicroJavaParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesigId(@NotNull MicroJavaParser.DesigIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DesigId}
	 * labeled alternative in {@link MicroJavaParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesigId(@NotNull MicroJavaParser.DesigIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Read}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRead(@NotNull MicroJavaParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Read}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRead(@NotNull MicroJavaParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#actPars}.
	 * @param ctx the parse tree
	 */
	void enterActPars(@NotNull MicroJavaParser.ActParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#actPars}.
	 * @param ctx the parse tree
	 */
	void exitActPars(@NotNull MicroJavaParser.ActParsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull MicroJavaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull MicroJavaParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeWithArray}
	 * labeled alternative in {@link MicroJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeWithArray(@NotNull MicroJavaParser.TypeWithArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeWithArray}
	 * labeled alternative in {@link MicroJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeWithArray(@NotNull MicroJavaParser.TypeWithArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OneFactor}
	 * labeled alternative in {@link MicroJavaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterOneFactor(@NotNull MicroJavaParser.OneFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OneFactor}
	 * labeled alternative in {@link MicroJavaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitOneFactor(@NotNull MicroJavaParser.OneFactorContext ctx);
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
	 * Enter a parse tree produced by {@link MicroJavaParser#formPar}.
	 * @param ctx the parse tree
	 */
	void enterFormPar(@NotNull MicroJavaParser.FormParContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#formPar}.
	 * @param ctx the parse tree
	 */
	void exitFormPar(@NotNull MicroJavaParser.FormParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn(@NotNull MicroJavaParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn(@NotNull MicroJavaParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MicroJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull MicroJavaParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MicroJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull MicroJavaParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(@NotNull MicroJavaParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(@NotNull MicroJavaParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(@NotNull MicroJavaParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(@NotNull MicroJavaParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Funcall}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFuncall(@NotNull MicroJavaParser.FuncallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Funcall}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFuncall(@NotNull MicroJavaParser.FuncallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OneTerm}
	 * labeled alternative in {@link MicroJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOneTerm(@NotNull MicroJavaParser.OneTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OneTerm}
	 * labeled alternative in {@link MicroJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOneTerm(@NotNull MicroJavaParser.OneTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull MicroJavaParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull MicroJavaParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstStr}
	 * labeled alternative in {@link MicroJavaParser#valConst}.
	 * @param ctx the parse tree
	 */
	void enterConstStr(@NotNull MicroJavaParser.ConstStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstStr}
	 * labeled alternative in {@link MicroJavaParser#valConst}.
	 * @param ctx the parse tree
	 */
	void exitConstStr(@NotNull MicroJavaParser.ConstStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstInt}
	 * labeled alternative in {@link MicroJavaParser#valConst}.
	 * @param ctx the parse tree
	 */
	void enterConstInt(@NotNull MicroJavaParser.ConstIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstInt}
	 * labeled alternative in {@link MicroJavaParser#valConst}.
	 * @param ctx the parse tree
	 */
	void exitConstInt(@NotNull MicroJavaParser.ConstIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#formPars}.
	 * @param ctx the parse tree
	 */
	void enterFormPars(@NotNull MicroJavaParser.FormParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#formPars}.
	 * @param ctx the parse tree
	 */
	void exitFormPars(@NotNull MicroJavaParser.FormParsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Semicolon}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(@NotNull MicroJavaParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Semicolon}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(@NotNull MicroJavaParser.SemicolonContext ctx);
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
	 * Enter a parse tree produced by the {@code Value}
	 * labeled alternative in {@link MicroJavaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull MicroJavaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Value}
	 * labeled alternative in {@link MicroJavaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull MicroJavaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull MicroJavaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull MicroJavaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroJavaParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(@NotNull MicroJavaParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroJavaParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(@NotNull MicroJavaParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull MicroJavaParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link MicroJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull MicroJavaParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Desig}
	 * labeled alternative in {@link MicroJavaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterDesig(@NotNull MicroJavaParser.DesigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Desig}
	 * labeled alternative in {@link MicroJavaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitDesig(@NotNull MicroJavaParser.DesigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstReal}
	 * labeled alternative in {@link MicroJavaParser#valConst}.
	 * @param ctx the parse tree
	 */
	void enterConstReal(@NotNull MicroJavaParser.ConstRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstReal}
	 * labeled alternative in {@link MicroJavaParser#valConst}.
	 * @param ctx the parse tree
	 */
	void exitConstReal(@NotNull MicroJavaParser.ConstRealContext ctx);
}