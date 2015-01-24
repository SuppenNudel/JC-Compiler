// Generated from JC.g4 by ANTLR 4.2
package dhbw.dev.compiler.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JCParser#Add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull JCParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#functionBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBool(@NotNull JCParser.FunctionBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#Or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull JCParser.OrContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#StringToInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringToInt(@NotNull JCParser.StringToIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#LighterOrEquals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLighterOrEquals(@NotNull JCParser.LighterOrEqualsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#IsNotInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNotInt(@NotNull JCParser.IsNotIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#String}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull JCParser.StringContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#BoolToString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolToString(@NotNull JCParser.BoolToStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#functionInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInt(@NotNull JCParser.FunctionIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#Concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(@NotNull JCParser.ConcatContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#OutputInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputInt(@NotNull JCParser.OutputIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#functionCallBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallBool(@NotNull JCParser.FunctionCallBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(@NotNull JCParser.VarTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#Invertation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvertation(@NotNull JCParser.InvertationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#Input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(@NotNull JCParser.InputContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#IsNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNot(@NotNull JCParser.IsNotContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#OutputString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputString(@NotNull JCParser.OutputStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#AssignmentString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentString(@NotNull JCParser.AssignmentStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#Bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(@NotNull JCParser.BoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#GreaterThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(@NotNull JCParser.GreaterThanContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull JCParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#GreaterOrEquals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterOrEquals(@NotNull JCParser.GreaterOrEqualsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#innerMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerMethod(@NotNull JCParser.InnerMethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#calcIntFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcIntFunction(@NotNull JCParser.CalcIntFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#AssignmentInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentInt(@NotNull JCParser.AssignmentIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#IntToBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntToBool(@NotNull JCParser.IntToBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#functionString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionString(@NotNull JCParser.FunctionStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(@NotNull JCParser.IfBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#Sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(@NotNull JCParser.SubContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#stringFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFunction(@NotNull JCParser.StringFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(@NotNull JCParser.MethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#VariableInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInt(@NotNull JCParser.VariableIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#StringToDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringToDouble(@NotNull JCParser.StringToDoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#BracketsCalc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsCalc(@NotNull JCParser.BracketsCalcContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#VariableBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableBool(@NotNull JCParser.VariableBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#Double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(@NotNull JCParser.DoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#BoolToInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolToInt(@NotNull JCParser.BoolToIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#And}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull JCParser.AndContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull JCParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#Pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(@NotNull JCParser.PowContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#IsStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsStr(@NotNull JCParser.IsStrContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(@NotNull JCParser.MethodCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#IntToDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntToDouble(@NotNull JCParser.IntToDoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#Negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(@NotNull JCParser.NegationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#LighterThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLighterThan(@NotNull JCParser.LighterThanContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#IsNotStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNotStr(@NotNull JCParser.IsNotStrContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(@NotNull JCParser.WhileBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#VariableDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDouble(@NotNull JCParser.VariableDoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#Is}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs(@NotNull JCParser.IsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#AssignmentBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentBool(@NotNull JCParser.AssignmentBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#BracketsComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsComp(@NotNull JCParser.BracketsCompContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#functionCallString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallString(@NotNull JCParser.FunctionCallStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull JCParser.ArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#functionCallInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallInt(@NotNull JCParser.FunctionCallIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#mainMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethod(@NotNull JCParser.MainMethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#DoubleToInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleToInt(@NotNull JCParser.DoubleToIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull JCParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#Mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(@NotNull JCParser.ModContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#StringToBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringToBool(@NotNull JCParser.StringToBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#IntToString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntToString(@NotNull JCParser.IntToStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull JCParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#VariableString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableString(@NotNull JCParser.VariableStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#BoolToDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolToDouble(@NotNull JCParser.BoolToDoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#boolFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFunction(@NotNull JCParser.BoolFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull JCParser.DeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(@NotNull JCParser.CommandContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#doBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoBlock(@NotNull JCParser.DoBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#Integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(@NotNull JCParser.IntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#Div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull JCParser.DivContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#AssignmentDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentDouble(@NotNull JCParser.AssignmentDoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#Mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(@NotNull JCParser.MultContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#OutputBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputBool(@NotNull JCParser.OutputBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#OutputDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputDouble(@NotNull JCParser.OutputDoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link JCParser#IsInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsInt(@NotNull JCParser.IsIntContext ctx);
}