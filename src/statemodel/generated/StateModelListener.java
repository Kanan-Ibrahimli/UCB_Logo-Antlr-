// Generated from C:/Users/Kanan/Downloads/mdsd-2024-antlr-hw-main/UCB_Logo/src/statemodel/StateModel.g4 by ANTLR 4.13.1
package statemodel.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StateModelParser}.
 */
public interface StateModelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(StateModelParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(StateModelParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(StateModelParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(StateModelParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#procedure_definition}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_definition(StateModelParser.Procedure_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#procedure_definition}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_definition(StateModelParser.Procedure_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_call(StateModelParser.Procedure_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_call(StateModelParser.Procedure_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#procedure_body}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_body(StateModelParser.Procedure_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#procedure_body}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_body(StateModelParser.Procedure_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(StateModelParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(StateModelParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#move_command}.
	 * @param ctx the parse tree
	 */
	void enterMove_command(StateModelParser.Move_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#move_command}.
	 * @param ctx the parse tree
	 */
	void exitMove_command(StateModelParser.Move_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#fd_command}.
	 * @param ctx the parse tree
	 */
	void enterFd_command(StateModelParser.Fd_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#fd_command}.
	 * @param ctx the parse tree
	 */
	void exitFd_command(StateModelParser.Fd_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#bk_command}.
	 * @param ctx the parse tree
	 */
	void enterBk_command(StateModelParser.Bk_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#bk_command}.
	 * @param ctx the parse tree
	 */
	void exitBk_command(StateModelParser.Bk_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#rt_command}.
	 * @param ctx the parse tree
	 */
	void enterRt_command(StateModelParser.Rt_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#rt_command}.
	 * @param ctx the parse tree
	 */
	void exitRt_command(StateModelParser.Rt_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#lt_command}.
	 * @param ctx the parse tree
	 */
	void enterLt_command(StateModelParser.Lt_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#lt_command}.
	 * @param ctx the parse tree
	 */
	void exitLt_command(StateModelParser.Lt_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#pu_command}.
	 * @param ctx the parse tree
	 */
	void enterPu_command(StateModelParser.Pu_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#pu_command}.
	 * @param ctx the parse tree
	 */
	void exitPu_command(StateModelParser.Pu_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#pd_command}.
	 * @param ctx the parse tree
	 */
	void enterPd_command(StateModelParser.Pd_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#pd_command}.
	 * @param ctx the parse tree
	 */
	void exitPd_command(StateModelParser.Pd_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void enterControl_structure(StateModelParser.Control_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void exitControl_structure(StateModelParser.Control_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#repeat_command}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_command(StateModelParser.Repeat_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#repeat_command}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_command(StateModelParser.Repeat_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#if_command}.
	 * @param ctx the parse tree
	 */
	void enterIf_command(StateModelParser.If_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#if_command}.
	 * @param ctx the parse tree
	 */
	void exitIf_command(StateModelParser.If_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#ifelse_command}.
	 * @param ctx the parse tree
	 */
	void enterIfelse_command(StateModelParser.Ifelse_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#ifelse_command}.
	 * @param ctx the parse tree
	 */
	void exitIfelse_command(StateModelParser.Ifelse_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#while_command}.
	 * @param ctx the parse tree
	 */
	void enterWhile_command(StateModelParser.While_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#while_command}.
	 * @param ctx the parse tree
	 */
	void exitWhile_command(StateModelParser.While_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assignment(StateModelParser.Variable_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assignment(StateModelParser.Variable_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#turtle_graphics_command}.
	 * @param ctx the parse tree
	 */
	void enterTurtle_graphics_command(StateModelParser.Turtle_graphics_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#turtle_graphics_command}.
	 * @param ctx the parse tree
	 */
	void exitTurtle_graphics_command(StateModelParser.Turtle_graphics_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#setxy_command}.
	 * @param ctx the parse tree
	 */
	void enterSetxy_command(StateModelParser.Setxy_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#setxy_command}.
	 * @param ctx the parse tree
	 */
	void exitSetxy_command(StateModelParser.Setxy_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#setheading_command}.
	 * @param ctx the parse tree
	 */
	void enterSetheading_command(StateModelParser.Setheading_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#setheading_command}.
	 * @param ctx the parse tree
	 */
	void exitSetheading_command(StateModelParser.Setheading_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#pendown_command}.
	 * @param ctx the parse tree
	 */
	void enterPendown_command(StateModelParser.Pendown_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#pendown_command}.
	 * @param ctx the parse tree
	 */
	void exitPendown_command(StateModelParser.Pendown_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#penup_command}.
	 * @param ctx the parse tree
	 */
	void enterPenup_command(StateModelParser.Penup_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#penup_command}.
	 * @param ctx the parse tree
	 */
	void exitPenup_command(StateModelParser.Penup_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#fill_command}.
	 * @param ctx the parse tree
	 */
	void enterFill_command(StateModelParser.Fill_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#fill_command}.
	 * @param ctx the parse tree
	 */
	void exitFill_command(StateModelParser.Fill_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#color_command}.
	 * @param ctx the parse tree
	 */
	void enterColor_command(StateModelParser.Color_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#color_command}.
	 * @param ctx the parse tree
	 */
	void exitColor_command(StateModelParser.Color_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#input_output_command}.
	 * @param ctx the parse tree
	 */
	void enterInput_output_command(StateModelParser.Input_output_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#input_output_command}.
	 * @param ctx the parse tree
	 */
	void exitInput_output_command(StateModelParser.Input_output_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#print_command}.
	 * @param ctx the parse tree
	 */
	void enterPrint_command(StateModelParser.Print_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#print_command}.
	 * @param ctx the parse tree
	 */
	void exitPrint_command(StateModelParser.Print_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#readword_command}.
	 * @param ctx the parse tree
	 */
	void enterReadword_command(StateModelParser.Readword_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#readword_command}.
	 * @param ctx the parse tree
	 */
	void exitReadword_command(StateModelParser.Readword_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#readlist_command}.
	 * @param ctx the parse tree
	 */
	void enterReadlist_command(StateModelParser.Readlist_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#readlist_command}.
	 * @param ctx the parse tree
	 */
	void exitReadlist_command(StateModelParser.Readlist_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#mathematical_logical_command}.
	 * @param ctx the parse tree
	 */
	void enterMathematical_logical_command(StateModelParser.Mathematical_logical_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#mathematical_logical_command}.
	 * @param ctx the parse tree
	 */
	void exitMathematical_logical_command(StateModelParser.Mathematical_logical_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#sum_command}.
	 * @param ctx the parse tree
	 */
	void enterSum_command(StateModelParser.Sum_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#sum_command}.
	 * @param ctx the parse tree
	 */
	void exitSum_command(StateModelParser.Sum_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#difference_command}.
	 * @param ctx the parse tree
	 */
	void enterDifference_command(StateModelParser.Difference_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#difference_command}.
	 * @param ctx the parse tree
	 */
	void exitDifference_command(StateModelParser.Difference_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#product_command}.
	 * @param ctx the parse tree
	 */
	void enterProduct_command(StateModelParser.Product_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#product_command}.
	 * @param ctx the parse tree
	 */
	void exitProduct_command(StateModelParser.Product_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#quotient_command}.
	 * @param ctx the parse tree
	 */
	void enterQuotient_command(StateModelParser.Quotient_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#quotient_command}.
	 * @param ctx the parse tree
	 */
	void exitQuotient_command(StateModelParser.Quotient_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#mod_command}.
	 * @param ctx the parse tree
	 */
	void enterMod_command(StateModelParser.Mod_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#mod_command}.
	 * @param ctx the parse tree
	 */
	void exitMod_command(StateModelParser.Mod_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#remainder_command}.
	 * @param ctx the parse tree
	 */
	void enterRemainder_command(StateModelParser.Remainder_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#remainder_command}.
	 * @param ctx the parse tree
	 */
	void exitRemainder_command(StateModelParser.Remainder_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#equal_command}.
	 * @param ctx the parse tree
	 */
	void enterEqual_command(StateModelParser.Equal_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#equal_command}.
	 * @param ctx the parse tree
	 */
	void exitEqual_command(StateModelParser.Equal_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#greater_command}.
	 * @param ctx the parse tree
	 */
	void enterGreater_command(StateModelParser.Greater_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#greater_command}.
	 * @param ctx the parse tree
	 */
	void exitGreater_command(StateModelParser.Greater_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#less_command}.
	 * @param ctx the parse tree
	 */
	void enterLess_command(StateModelParser.Less_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#less_command}.
	 * @param ctx the parse tree
	 */
	void exitLess_command(StateModelParser.Less_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#and_command}.
	 * @param ctx the parse tree
	 */
	void enterAnd_command(StateModelParser.And_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#and_command}.
	 * @param ctx the parse tree
	 */
	void exitAnd_command(StateModelParser.And_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#or_command}.
	 * @param ctx the parse tree
	 */
	void enterOr_command(StateModelParser.Or_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#or_command}.
	 * @param ctx the parse tree
	 */
	void exitOr_command(StateModelParser.Or_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#not_command}.
	 * @param ctx the parse tree
	 */
	void enterNot_command(StateModelParser.Not_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#not_command}.
	 * @param ctx the parse tree
	 */
	void exitNot_command(StateModelParser.Not_commandContext ctx);
}