// Generated from C:/Users/Kanan/Downloads/mdsd-2024-antlr-hw-main/UCB_Logo/src/statemodel/StateModel.g4 by ANTLR 4.13.1
package statemodel.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StateModelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StateModelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(StateModelParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(StateModelParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#procedure_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_definition(StateModelParser.Procedure_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#procedure_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_call(StateModelParser.Procedure_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#procedure_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_body(StateModelParser.Procedure_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(StateModelParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#move_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove_command(StateModelParser.Move_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#fd_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFd_command(StateModelParser.Fd_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#bk_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBk_command(StateModelParser.Bk_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#rt_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRt_command(StateModelParser.Rt_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#lt_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt_command(StateModelParser.Lt_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#pu_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPu_command(StateModelParser.Pu_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#pd_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPd_command(StateModelParser.Pd_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#control_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_structure(StateModelParser.Control_structureContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#repeat_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_command(StateModelParser.Repeat_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#if_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_command(StateModelParser.If_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#ifelse_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse_command(StateModelParser.Ifelse_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#while_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_command(StateModelParser.While_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#variable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assignment(StateModelParser.Variable_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#turtle_graphics_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurtle_graphics_command(StateModelParser.Turtle_graphics_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#setxy_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetxy_command(StateModelParser.Setxy_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#setheading_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetheading_command(StateModelParser.Setheading_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#pendown_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPendown_command(StateModelParser.Pendown_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#penup_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenup_command(StateModelParser.Penup_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#fill_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFill_command(StateModelParser.Fill_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#color_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor_command(StateModelParser.Color_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#input_output_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_output_command(StateModelParser.Input_output_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#print_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_command(StateModelParser.Print_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#readword_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadword_command(StateModelParser.Readword_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#readlist_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadlist_command(StateModelParser.Readlist_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#mathematical_logical_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathematical_logical_command(StateModelParser.Mathematical_logical_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#sum_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum_command(StateModelParser.Sum_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#difference_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifference_command(StateModelParser.Difference_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#product_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduct_command(StateModelParser.Product_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#quotient_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotient_command(StateModelParser.Quotient_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#mod_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod_command(StateModelParser.Mod_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#remainder_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemainder_command(StateModelParser.Remainder_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#equal_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual_command(StateModelParser.Equal_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#greater_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater_command(StateModelParser.Greater_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#less_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess_command(StateModelParser.Less_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#and_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_command(StateModelParser.And_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#or_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_command(StateModelParser.Or_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#not_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_command(StateModelParser.Not_commandContext ctx);
}