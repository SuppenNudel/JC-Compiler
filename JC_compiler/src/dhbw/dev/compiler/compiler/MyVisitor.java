package dhbw.dev.compiler.compiler;

import java.util.ArrayList;
import java.util.Stack;

import dhbw.dev.compiler.compiler.Value.Type;
import dhbw.dev.compiler.compiler.exceptions.UndefinedFunctionException;
import dhbw.dev.compiler.parser.JCBaseVisitor;
import dhbw.dev.compiler.parser.JCParser.AddContext;
import dhbw.dev.compiler.parser.JCParser.AndContext;
import dhbw.dev.compiler.parser.JCParser.AssignmentBoolContext;
import dhbw.dev.compiler.parser.JCParser.AssignmentDoubleContext;
import dhbw.dev.compiler.parser.JCParser.AssignmentIntContext;
import dhbw.dev.compiler.parser.JCParser.AssignmentStringContext;
import dhbw.dev.compiler.parser.JCParser.BoolContext;
import dhbw.dev.compiler.parser.JCParser.ConcatContext;
import dhbw.dev.compiler.parser.JCParser.DeclarationContext;
import dhbw.dev.compiler.parser.JCParser.DivContext;
import dhbw.dev.compiler.parser.JCParser.DoBlockContext;
import dhbw.dev.compiler.parser.JCParser.DoubleContext;
import dhbw.dev.compiler.parser.JCParser.DoubleToIntContext;
import dhbw.dev.compiler.parser.JCParser.ExpressionContext;
import dhbw.dev.compiler.parser.JCParser.FunctionBoolContext;
import dhbw.dev.compiler.parser.JCParser.FunctionCallBoolContext;
import dhbw.dev.compiler.parser.JCParser.FunctionCallIntContext;
import dhbw.dev.compiler.parser.JCParser.FunctionCallStringContext;
import dhbw.dev.compiler.parser.JCParser.FunctionIntContext;
import dhbw.dev.compiler.parser.JCParser.FunctionStringContext;
import dhbw.dev.compiler.parser.JCParser.GreaterThanContext;
import dhbw.dev.compiler.parser.JCParser.IfBlockContext;
import dhbw.dev.compiler.parser.JCParser.IntToBoolContext;
import dhbw.dev.compiler.parser.JCParser.IntToDoubleContext;
import dhbw.dev.compiler.parser.JCParser.IntToStringContext;
import dhbw.dev.compiler.parser.JCParser.IntegerContext;
import dhbw.dev.compiler.parser.JCParser.InvertationContext;
import dhbw.dev.compiler.parser.JCParser.IsContext;
import dhbw.dev.compiler.parser.JCParser.IsIntContext;
import dhbw.dev.compiler.parser.JCParser.IsNotContext;
import dhbw.dev.compiler.parser.JCParser.IsNotStrContext;
import dhbw.dev.compiler.parser.JCParser.IsStrContext;
import dhbw.dev.compiler.parser.JCParser.LighterThanContext;
import dhbw.dev.compiler.parser.JCParser.MainMethodContext;
import dhbw.dev.compiler.parser.JCParser.MethodCallContext;
import dhbw.dev.compiler.parser.JCParser.MethodContext;
import dhbw.dev.compiler.parser.JCParser.ModContext;
import dhbw.dev.compiler.parser.JCParser.MultContext;
import dhbw.dev.compiler.parser.JCParser.NegationContext;
import dhbw.dev.compiler.parser.JCParser.OrContext;
import dhbw.dev.compiler.parser.JCParser.OutputBoolContext;
import dhbw.dev.compiler.parser.JCParser.OutputDoubleContext;
import dhbw.dev.compiler.parser.JCParser.OutputIntContext;
import dhbw.dev.compiler.parser.JCParser.OutputStringContext;
import dhbw.dev.compiler.parser.JCParser.PowContext;
import dhbw.dev.compiler.parser.JCParser.StartContext;
import dhbw.dev.compiler.parser.JCParser.StringContext;
import dhbw.dev.compiler.parser.JCParser.StringToIntContext;
import dhbw.dev.compiler.parser.JCParser.SubContext;
import dhbw.dev.compiler.parser.JCParser.VariableBoolContext;
import dhbw.dev.compiler.parser.JCParser.VariableDoubleContext;
import dhbw.dev.compiler.parser.JCParser.VariableIntContext;
import dhbw.dev.compiler.parser.JCParser.VariableStringContext;
import dhbw.dev.compiler.parser.JCParser.WhileBlockContext;

public class MyVisitor extends JCBaseVisitor<String> {
	/*
	 * globale variablen
	 * .field. static <Name> <Typ>
	 * getstatic <Klassenname> <Typ>
	 * putstatic <Klassenname> <Typ>
	 */

	/*
	 * TODO debugInformationen
	 * .source <SourceFile>
	 * .line <ZeilenNummer>
	 * 
	 * variablen Tabelle beschreiben
	 * .var <Index in Var-Tabelle> is <Name> <Typ> from <Labelname Gültigkeitsbeginn> to <Labelname Gültigkeitsende>
	 */
	
	private Scope currentScope;
	private final FunctionList definedFunctions;
	
	private int jumpCount = 0;
	
	public MyVisitor(FunctionList definedFunctions) {
		if(definedFunctions == null) {
			throw new NullPointerException("no FunctionList");
		}
		this.definedFunctions = definedFunctions;
	}
	
	@Override
	public String visitStart(StartContext ctx) {
		return  ".source Code.jc\n"
			+ ".class public JCClass\n"
			+ ".super java/lang/Object\n"
			+ "\n"
			+ visitChildren(ctx);
	}

	@Override
	public String visitMainMethod(MainMethodContext ctx) {
		currentScope = new Scope(currentScope);
		String code = ".method public static main([Ljava/lang/String;)V\n";
		String body = visit(ctx.body);
		currentScope.putVariable(ctx.methodName, "");
		code += ".limit stack "+(currentScope.getStack().getMaxStack())+"\n"
				+ ".limit locals "+(currentScope.getSize())+"\n" // +1 für [Ljava/lang/String;
				+ "scopeBegin"+currentScope.getScopeId()+":\n";
		if(body != null) {
			code += "\t" + body.replaceAll("\n", "\n\t");
		}
		return code
				+"scopeEnd"+currentScope.getScopeId()+":\n"
				+ "return\n"
				+ ".end method\n";
	}
	
	@Override
	public String visitMethod(MethodContext ctx) {
		currentScope = new Scope(currentScope);
		String code = ".method public static " + ctx.methodName.getText() + "(";
		ArrayList<Type> parameters = new ArrayList<>();
		for(DeclarationContext declaration : ctx.parameters) {
			visit(declaration);
			parameters.add(Value.jcToType(declaration.type.getText()));
			currentScope.putVariable(declaration.varName, declaration.type.getText());
			code += Value.jcToJasmin(declaration.type.getText());
		}
		code += ")V\n"
				+ ".limit stack "+(currentScope.getStack().getMaxStack()+5)+"\n"
				+ ".limit locals "+(currentScope.getSize())+"\n"
				+ "scopeBegin"+currentScope.getScopeId()+":\n"
				+ "\n";
		String body = visit(ctx.body);
		if(body != null) {
			code += "\t" + body.replaceAll("\n", "\n\t");
		}
		code += "\n"
				+"scopeEnd"+currentScope.getScopeId()+":\n"
				+ "\treturn\n"
				+ ".end method\n";
		currentScope = currentScope.getParent();
		return code;
	}

	@Override
	public String visitFunctionInt(FunctionIntContext ctx) {
		currentScope = new Scope(currentScope);
		String code = ".method public static " + ctx.functionName.getText() + "(";
		ArrayList<Type> parameters = new ArrayList<>();
		for(DeclarationContext declaration : ctx.parameters) {
			visit(declaration);
			parameters.add(Value.jcToType(declaration.type.getText()));
			currentScope.putVariable(declaration.varName, declaration.type.getText());
			code += Value.jcToJasmin(declaration.type.getText());
		}
		code += ")I\n"
				+ ".limit stack "+(currentScope.getStack().getMaxStack())+"\n"
				+ ".limit locals "+(currentScope.getSize())+"\n"
				+ "scopeBegin"+currentScope.getScopeId()+":\n"
				+ "\n";
		String body = "";
		if(ctx.body.getChildCount() != 0) {
			body += visit(ctx.body);
		}
		body += visit(ctx.returnValue)
				+ "ireturn\n";
		if(body != null) {
			code += "\t" + body.replaceAll("\n", "\n\t");
		}
		currentScope = currentScope.getParent();
		return code + "scopeEnd"+currentScope.getScopeId()+":\n" + ".end method\n";
	}

	@Override
	public String visitFunctionBool(FunctionBoolContext ctx) {
		currentScope = new Scope(currentScope);
		String code = ".method public static " + ctx.functionName.getText() + "(";
		ArrayList<Type> parameters = new ArrayList<>();
		for(DeclarationContext declaration : ctx.parameters) {
			visit(declaration);
			parameters.add(Value.jcToType(declaration.type.getText()));
			currentScope.putVariable(declaration.varName, declaration.type.getText());
			code += Value.jcToJasmin(declaration.type.getText());
		}
		code += ")Z\n"
				+ ".limit stack "+(currentScope.getStack().getMaxStack())+"\n"
				+ ".limit locals "+(currentScope.getSize())+"\n"
				+ "scopeBegin"+currentScope.getScopeId()+":\n"
				+ "\n";
		String body = "";
		if(ctx.body.getChildCount() != 0) {
			body += visit(ctx.body);
		}
		body += visit(ctx.returnValue)
				+ "ireturn\n";
		if(body != null) {
			code += "\t" + body.replaceAll("\n", "\n\t");
		}
		currentScope = currentScope.getParent();
		return code + "scopeEnd"+currentScope.getScopeId()+":\n" + ".end method\n";
	}
	
	@Override
	public String visitFunctionString(FunctionStringContext ctx) {
		String code = ".method public static " + ctx.functionName.getText() + "(";
		ArrayList<Type> parameters = new ArrayList<>();
		for(DeclarationContext declaration : ctx.parameters) {
			visit(declaration);
			parameters.add(Value.jcToType(declaration.type.getText()));
			currentScope.putVariable(declaration.varName, declaration.type.getText());
			code += Value.jcToJasmin(declaration.type.getText());
		}
		code += ")Ljava/lang/String;\n"
				+ ".limit stack "+(currentScope.getStack().getMaxStack())+"\n"
				+ ".limit locals "+(currentScope.getSize())+"\n"
				+ "\n";
		String body = "";
		if(ctx.body.getChildCount() != 0) {
			body += visit(ctx.body);
		}
		body += visit(ctx.returnValue)
				+ "areturn\n";
		if(body != null) {
			code += "\t" + body.replaceAll("\n", "\n\t");
		}
		return code + ".end method\n";
	}

	@Override
	public String visitMethodCall(MethodCallContext ctx) {
		String code = "";
		String parameters = "";
		Stack<Type> paramTypes = new Stack<>();
		for(ExpressionContext expression : ctx.parameters) {
			code += visit(expression);
			Type type = currentScope.getStack().peek().getType();
			paramTypes.push(type);
			parameters += Value.typeToJasmin(type);
		}
		Function function = new Function(ctx.methodName, Type.VOID, paramTypes);
		if(!functionIsDefined(function)) {
			throw new UndefinedFunctionException(ctx.methodName, function);
		}
		code += "invokestatic JCClass/" + ctx.methodName.getText() + "(" + parameters + ")V\n";
		while(paramTypes.size() > 0) {
			currentScope.getStack().pop(paramTypes.pop());
		}
		return code;
	}

	@Override
	public String visitFunctionCallInt(FunctionCallIntContext ctx) {
		String code = "";
		String parameters = "";
		Stack<Type> paramTypes = new Stack<>();
		for(ExpressionContext expression : ctx.parameters) {
			code += visit(expression);
			Type type = currentScope.getStack().peek().getType();
			paramTypes.push(type);
			parameters += Value.typeToJasmin(type);
		}
		Function function = new Function(ctx.functionName, Type.INTEGER, paramTypes);
		if(!functionIsDefined(function)) {
			throw new UndefinedFunctionException(ctx.functionName, function);
		}
		code += "invokestatic JCClass/" + ctx.functionName.getText() + "(" + parameters + ")I\n";
		while(paramTypes.size() > 0) {
			currentScope.getStack().pop(paramTypes.pop());
		}
		currentScope.getStack().push(new Value(ctx.start, Type.INTEGER));
		return code;
	}

	@Override
	public String visitFunctionCallBool(FunctionCallBoolContext ctx) {
		String code = "";
		String parameters = "";
		Stack<Type> paramTypes= new Stack<>();
		for(ExpressionContext expression : ctx.parameters) {
			code += visit(expression);
			Type type = currentScope.getStack().peek().getType();
			paramTypes.push(type);
			parameters += Value.typeToJasmin(type);
		}
		Function function = new Function(ctx.functionName, Type.BOOLEAN, paramTypes);
		if(!functionIsDefined(function)) {
			throw new UndefinedFunctionException(ctx.functionName, function);
		}
		code += "invokestatic JCClass/" + ctx.functionName.getText() + "(" + parameters + ")Z\n";
		while(paramTypes.size() > 0) {
			currentScope.getStack().pop(paramTypes.pop());
		}
		currentScope.getStack().push(new Value(ctx.start, Type.BOOLEAN));
		return code;
	}
	
	@Override
	public String visitFunctionCallString(FunctionCallStringContext ctx) {
		String code = "";
		String parameters = "";
		Stack<Type> paramTypes= new Stack<>();
		for(ExpressionContext expression : ctx.parameters) {
			code += visit(expression);
			Type type = currentScope.getStack().peek().getType();
			paramTypes.push(type);
			parameters += Value.typeToJasmin(type);
		}
		Function function = new Function(ctx.functionName, Type.STRING, paramTypes);
		if(!functionIsDefined(function)) {
			throw new UndefinedFunctionException(ctx.functionName, function);
		}
		code += "invokestatic JCClass/" + ctx.functionName.getText() + "(" + parameters + ")Ljava/lang/String;\n";
		while(paramTypes.size() > 0) {
			currentScope.getStack().pop(paramTypes.pop());
		}
		currentScope.getStack().push(new Value(ctx.start, Type.STRING));
		return code;
	}
	
	@Override
	public String visitDeclaration(DeclarationContext ctx) {
		currentScope.putVariable(ctx.varName, ctx.type.getText());
		return "";
	}
	
	@Override
	public String visitAssignmentInt(AssignmentIntContext ctx) {
		currentScope.putVariable(ctx.decl.varName, ctx.decl.type.getText());
		String code = ".line "+ctx.start.getLine()+"\n"
				+ visit(ctx.calc);
		Variable variable = currentScope.getVariable(ctx.decl.varName);
		code += ".var "+variable.getVarIndex()+" is "+variable.getVarName()+" "+Value.typeToJasmin(variable.getVarType())+" from scopeBegin"+variable.getScopeId()+" to scopeEnd"+variable.getScopeId()+"\n";
		code += "istore " + variable.getVarIndex() +"\n";
		currentScope.getStack().pop(Type.INTEGER);
		return code;
	}
	
	@Override
	public String visitAssignmentDouble(AssignmentDoubleContext ctx) {
		currentScope.putVariable(ctx.decl.varName, ctx.decl.type.getText());
		Variable variable = currentScope.getVariable(ctx.decl.varName);
		String code = ".line "+ctx.start.getLine()+"\n"
				+ visit(ctx.calc)
				+ ".var "+variable.getVarIndex()+" is "+variable.getVarName()+" "+Value.typeToJasmin(variable.getVarType())+" from scopeBegin"+variable.getScopeId()+" to scopeEnd"+variable.getScopeId()+"\n"
				+ "dstore " + currentScope.getVariable(ctx.decl.varName).getVarIndex()+"\n";
		currentScope.getStack().pop(Type.DOUBLE);
		return code;
	}
	
	@Override
	public String visitAssignmentBool(AssignmentBoolContext ctx) {
		currentScope.putVariable(ctx.decl.varName, ctx.decl.type.getText());
		Variable variable = currentScope.getVariable(ctx.decl.varName);
		String code = ".line "+ctx.start.getLine()+"\n"
				+ visit(ctx.comp)
				+ ".var "+variable.getVarIndex()+" is "+variable.getVarName()+" "+Value.typeToJasmin(variable.getVarType())+" from scopeBegin"+variable.getScopeId()+" to scopeEnd"+variable.getScopeId()+"\n"
				+ "istore " + currentScope.getVariable(ctx.decl.varName).getVarIndex()+"\n";
		currentScope.getStack().pop(Type.BOOLEAN);
		return code;
	}
	
	@Override
	public String visitAssignmentString(AssignmentStringContext ctx) {
		currentScope.putVariable(ctx.decl.varName, ctx.decl.type.getText());
		Variable variable = currentScope.getVariable(ctx.decl.varName);
		String code = ".line "+ctx.start.getLine()+"\n"
				+ visit(ctx.conc)
				+ ".var "+variable.getVarIndex()+" is "+variable.getVarName()+" "+Value.typeToJasmin(variable.getVarType())+" from scopeBegin"+variable.getScopeId()+" to scopeEnd"+variable.getScopeId()+"\n"
				+ "astore " + currentScope.getVariable(ctx.decl.varName).getVarIndex()+"\n";
		currentScope.getStack().pop(Type.STRING);
		return code;
	}
	
	@Override
	public String visitInteger(IntegerContext ctx) {
		String code = ".line "+ctx.start.getLine()+"\n"
				+ "ldc " + ctx.getText()+"\n";
		currentScope.getStack().push(new Value(ctx.start, Type.INTEGER));
		return code;
	}
	
	@Override
	public String visitDouble(DoubleContext ctx) {
		String code = ".line "+ctx.start.getLine()+"\n"
				+ "ldc2_w " + ctx.getText()+"\n";
		currentScope.getStack().push(new Value(ctx.start, Type.DOUBLE));
		return code;
	}
	
	@Override
	public String visitBool(BoolContext ctx) {
		String code = ".line "+ctx.start.getLine()+"\n";
		if(ctx.getText().equals("true")) {
			code += "ldc 1\n";
			currentScope.getStack().push(new Value(ctx.start, Type.BOOLEAN));
		} else if(ctx.getText().equals("false")) {
			code += "ldc 0\n";
			currentScope.getStack().push(new Value(ctx.start, Type.BOOLEAN));
		} else {
			throw new RuntimeException("Something went wrong with a Boolean at "+ctx.value + ":" + ctx.value.getCharPositionInLine());
		}
		return code;
	}
	
	@Override
	public String visitString(StringContext ctx) {
		String code = ".line "+ctx.start.getLine()+"\n"
				+ "ldc " + ctx.getText()+"\n";
		currentScope.getStack().push(new Value(ctx.start, Type.STRING));
		return code;
	}
	
	@Override
	public String visitVariableInt(VariableIntContext ctx) {
		currentScope.getStack().push(new Value(ctx.start, Type.INTEGER));
		return "iload " + currentScope.getVariable(ctx.varName).getVarIndex()+"\n";
	}
	
	@Override
	public String visitVariableDouble(VariableDoubleContext ctx) {
		currentScope.getStack().push(new Value(ctx.start, Type.DOUBLE));
		return "dload " + currentScope.getVariable(ctx.varName).getVarIndex()+"\n";
	}
	
	@Override
	public String visitVariableBool(VariableBoolContext ctx) {
		currentScope.getStack().push(new Value(ctx.start, Type.BOOLEAN));
		return "iload " + currentScope.getVariable(ctx.varName).getVarIndex()+"\n";
	}
	
	@Override
	public String visitVariableString(VariableStringContext ctx) {
		currentScope.getStack().push(new Value(ctx.start, Type.STRING));
		return "aload " + currentScope.getVariable(ctx.varName).getVarIndex()+"\n";
	}
	
	@Override
	public String visitAdd(AddContext ctx) {
		String code = visit(ctx.left)
			+ visit(ctx.right)
			+ "iadd\n";
		currentScope.getStack().pop(Type.INTEGER);
		currentScope.getStack().pop(Type.INTEGER);
		currentScope.getStack().push(new Value(ctx.start, Type.INTEGER));
		return code;
	}
	
	@Override
	public String visitSub(SubContext ctx) {
		String code = visit(ctx.left)
			+ visit(ctx.right)
			+ "isub\n";
		currentScope.getStack().pop(Type.INTEGER);
		currentScope.getStack().pop(Type.INTEGER);
		currentScope.getStack().push(new Value(ctx.start, Type.INTEGER));
		return code;
	}
	
	@Override
	public String visitMult(MultContext ctx) {
		String code = visit(ctx.left)
			+ visit(ctx.right)
			+ "imul\n";
		currentScope.getStack().pop(Type.INTEGER);
		currentScope.getStack().pop(Type.INTEGER);
		currentScope.getStack().push(new Value(ctx.start, Type.INTEGER));
		return code;
	}

	@Override
	public String visitDiv(DivContext ctx) {
		String code = visit(ctx.left)
			+ visit(ctx.right)
			+ "idiv\n";
		currentScope.getStack().pop(Type.INTEGER);
		currentScope.getStack().pop(Type.INTEGER);
		currentScope.getStack().push(new Value(ctx.start, Type.INTEGER));
		return code;
	}
	
	@Override
	public String visitMod(ModContext ctx) {
		String code = visit(ctx.left)
			+ visit(ctx.right)
			+ "irem\n";
		currentScope.getStack().pop(Type.INTEGER);
		currentScope.getStack().pop(Type.INTEGER);
		currentScope.getStack().push(new Value(ctx.start, Type.INTEGER));
		return code;
	}
	
	@Override
	public String visitPow(PowContext ctx) {
		String code = visit(ctx.left)
				+ visit(ctx.right)
				+ "invokestatic java/lang/Math/pow(DD)D\n";
		currentScope.getStack().pop(Type.DOUBLE);
		currentScope.getStack().pop(Type.DOUBLE);
		currentScope.getStack().push(new Value(ctx.start, Type.DOUBLE));
		return code;
	}
	
	@Override
	public String visitNegation(NegationContext ctx) {
		String code = visit(ctx.calc);
		code += "ineg\n";
		return code;
	}
	
	@Override
	public String visitOr(OrContext ctx) {
		String code = visit(ctx.left)
				+ visit(ctx.right)
				+ "ior\n";
		currentScope.getStack().pop(Type.BOOLEAN);
		currentScope.getStack().pop(Type.BOOLEAN);
		currentScope.getStack().push(new Value(ctx.start, Type.BOOLEAN));
		return code;
	}
	
	@Override
	public String visitAnd(AndContext ctx) {
		String code = visit(ctx.left)
				+ visit(ctx.right)
				+ "iand\n";
		currentScope.getStack().pop(Type.BOOLEAN);
		currentScope.getStack().pop(Type.BOOLEAN);
		currentScope.getStack().push(new Value(ctx.start, Type.BOOLEAN));
		return code;
	}
	
	@Override
	public String visitIs(IsContext ctx) {
		int jumpNr = jumpCount++;
		String code = visit(ctx.left)
				+ visit(ctx.right)
				+ "if_icmpeq isNotTrue"+jumpNr+"\n";
		currentScope.getStack().pop(Type.BOOLEAN);
		currentScope.getStack().pop(Type.BOOLEAN);
		code += "ldc 0\n"
				+ "goto isNotEnd"+jumpNr+"\n"
				+ "isNotTrue"+jumpNr+":\n"
				+ "ldc 1\n"
				+ "isNotEnd"+jumpNr+":\n";
		currentScope.getStack().push(new Value(ctx.start, Type.BOOLEAN));
		return code;
	}
	
	@Override
	public String visitIsInt(IsIntContext ctx) {
		int jumpNr = jumpCount++;
		String code = visit(ctx.left)
				+ visit(ctx.right)
				+ "if_icmpeq isNotTrue"+jumpNr+"\n";
		currentScope.getStack().pop(Type.INTEGER);
		currentScope.getStack().pop(Type.INTEGER);
		code += "ldc 0\n"
				+ "goto isNotEnd"+jumpNr+"\n"
				+ "isNotTrue"+jumpNr+":\n"
				+ "ldc 1\n"
				+ "isNotEnd"+jumpNr+":\n";
		currentScope.getStack().push(new Value(ctx.start, Type.BOOLEAN));
		return code;
	}
	
	@Override
	public String visitIsNot(IsNotContext ctx) {
		int jumpNr = jumpCount++;
		String code = visit(ctx.left)
				+ visit(ctx.right)
				+ "if_icmpne isNotTrue"+jumpNr+"\n";
		currentScope.getStack().pop(Type.BOOLEAN);
		currentScope.getStack().pop(Type.BOOLEAN);
		code += "ldc 0\n"
				+ "goto isNotEnd"+jumpNr+"\n"
				+ "isNotTrue"+jumpNr+":\n"
				+ "ldc 1\n"
				+ "isNotEnd"+jumpNr+":\n";
		currentScope.getStack().push(new Value(ctx.start, Type.BOOLEAN));
		return code;
	}
	
	@Override
	public String visitLighterThan(LighterThanContext ctx) {
		int jumpNr = jumpCount++;
		String code = visit(ctx.left)
				+ visit(ctx.right)
				+ "if_icmplt lighterTrue"+jumpNr+"\n";
		currentScope.getStack().pop(Type.INTEGER);
		currentScope.getStack().pop(Type.INTEGER);
		code += "ldc 0\n"
				+ "goto lighterEnd"+jumpNr+"\n"
				+ "lighterTrue"+jumpNr+":\n"
				+ "ldc 1\n"
				+ "lighterEnd"+jumpNr+":\n";
		currentScope.getStack().push(new Value(ctx.start, Type.BOOLEAN));
		return code;
	}
	
	@Override
	public String visitGreaterThan(GreaterThanContext ctx) {
		int jumpNr = jumpCount++;
		String code = visit(ctx.left)
				+ visit(ctx.right)
				+ "if_icmpgt greaterTrue"+jumpNr+"\n";
		currentScope.getStack().pop(Type.INTEGER);
		currentScope.getStack().pop(Type.INTEGER);
		code += "ldc 0\n"
				+ "goto greaterEnd"+jumpNr+"\n"
				+ "greaterTrue"+jumpNr+":\n"
				+ "ldc 1\n"
				+ "greaterEnd"+jumpNr+":\n";
		currentScope.getStack().push(new Value(ctx.start, Type.BOOLEAN));
		return code;
	}

	@Override
	public String visitInvertation(InvertationContext ctx) {
		int jumpNr = jumpCount++;
		String code = visit(ctx.comp)
				+ "ifeq invertToTrue"+jumpNr+"\n";
		currentScope.getStack().pop(Type.BOOLEAN);
		code += "ldc 0\n"
			+ "goto invertEnd"+jumpNr+"\n"
			+ "invertToTrue"+jumpNr+":\n"
			+ "ldc 1\n"
			+ "invertEnd"+jumpNr+":\n";
		currentScope.getStack().push(new Value(ctx.start, Type.BOOLEAN));
		return code;
	}
	
	@Override
	public String visitIsStr(IsStrContext ctx) {
		String code = visit(ctx.left)
				+ visit(ctx.right)
				+ "invokevirtual java/lang/String/equals(Ljava/lang/Object;)Z\n";
		currentScope.getStack().pop(Type.STRING);
		currentScope.getStack().pop(Type.STRING);
		currentScope.getStack().push(new Value(ctx.start, Type.BOOLEAN));
		return code;
	}
	
	@Override
	public String visitIsNotStr(IsNotStrContext ctx) {
		int jumpNr = jumpCount++;
		String code = visit(ctx.left)
				+ visit(ctx.right)
				+ "invokevirtual java/lang/String/equals(Ljava/lang/Object;)Z\n";
		currentScope.getStack().pop(Type.STRING);
		currentScope.getStack().pop(Type.STRING);
		currentScope.getStack().push(new Value(ctx.start, Type.BOOLEAN));
		
		code += "ifeq invertToTrue"+jumpNr+"\n";
		currentScope.getStack().pop(Type.BOOLEAN);
		code += "ldc 0\n"
			+ "goto invertEnd"+jumpNr+"\n"
			+ "invertToTrue"+jumpNr+":\n"
			+ "ldc 1\n"
			+ "invertEnd"+jumpNr+":\n";
		currentScope.getStack().push(new Value(ctx.start, Type.BOOLEAN));
		return code;
	}
	
	@Override
	public String visitConcat(ConcatContext ctx) {
		String code = visit(ctx.left)
				+ visit(ctx.right)
				+ "invokevirtual java/lang/String/concat(Ljava/lang/String;)Ljava/lang/String;\n";
		currentScope.getStack().pop(Type.STRING);
		currentScope.getStack().pop(Type.STRING);
		currentScope.getStack().push(new Value(ctx.start, Type.STRING));
		return code;
	}

	@Override
	public String visitOutputInt(OutputIntContext ctx) {
		String code = "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
		currentScope.getStack().push(new Value(ctx.start, Type.OBJECT));
		code += visit(ctx.value);
		code += "invokevirtual java/io/PrintStream/println(I)V\n";
		currentScope.getStack().pop(Type.INTEGER);
		currentScope.getStack().pop(Type.OBJECT);
		return code;
	}
	
	@Override
	public String visitOutputDouble(OutputDoubleContext ctx) {
		String code = "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
		currentScope.getStack().push(new Value(ctx.start, Type.OBJECT));
		code += visit(ctx.value)
				+ "invokevirtual java/io/PrintStream/println(D)V\n";
		currentScope.getStack().pop(Type.DOUBLE);
		currentScope.getStack().pop(Type.OBJECT);
		return code;
	}
	
	@Override
	public String visitOutputBool(OutputBoolContext ctx) {
		String code = "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
		currentScope.getStack().push(new Value(ctx.start, Type.OBJECT));
		code += visit(ctx.value);
		code += "invokevirtual java/io/PrintStream/println(Z)V\n";
		currentScope.getStack().pop(Type.BOOLEAN);
		currentScope.getStack().pop(Type.OBJECT);
		return code;

	}
	
	@Override
	public String visitOutputString(OutputStringContext ctx) {
		String code = "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
		currentScope.getStack().push(new Value(ctx.start, Type.OBJECT));
		code += visit(ctx.value)
				+ "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n";
		currentScope.getStack().pop(Type.STRING);
		currentScope.getStack().pop(Type.OBJECT);
		return code;
	}

	@Override
	public String visitIfBlock(IfBlockContext ctx) {
		int jumpNr = jumpCount++;
		String code = visit(ctx.condition);
		if(ctx.bodyelse == null) {
			code += "ifeq endIf"+jumpNr+"\n";
			currentScope.getStack().pop(Type.BOOLEAN);
			code += visit(ctx.bodyif)
					+ "endIf"+jumpNr+":\n";
		} else {
			code += "ifeq else"+jumpNr+"\n";
			currentScope.getStack().pop(Type.BOOLEAN);
			code+= visit(ctx.bodyif)
					+ "goto endIf"+jumpNr+"\n"
					+ "else"+jumpNr+":\n"
					+ visit(ctx.bodyelse)
					+ "endIf"+jumpNr+":\n";
		}
		return code;
	}

	@Override
	public String visitWhileBlock(WhileBlockContext ctx) {
		int jumpNr = jumpCount++;
		String code = "beginWhile"+jumpNr+":\n"
				+ visit(ctx.condition)
				+ "ifeq endWhile"+jumpNr+"\n";
		currentScope.getStack().pop(Type.BOOLEAN);
		code += visit(ctx.body)
				+ "goto beginWhile"+jumpNr+"\n"
				+ "endWhile"+jumpNr+":\n";
		return code;
	}
	
	@Override
	public String visitDoBlock(DoBlockContext ctx) {
		int jumpNr = jumpCount++;
		String code = "beginDo"+jumpNr+":\n"
				+ visit(ctx.body)
				+ visit(ctx.condition)
				+ "ifne beginDo"+jumpNr+"\n";
		currentScope.getStack().pop(Type.BOOLEAN);
		return code;
	}
	
	@Override
	public String visitIntToDouble(IntToDoubleContext ctx) {
		String code = visit(ctx.from)
				+ "i2d\n";
		currentScope.getStack().pop(Type.INTEGER);
		currentScope.getStack().push(new Value(ctx.start, Type.DOUBLE));
		return code;
	}
	
	@Override
	public String visitIntToBool(IntToBoolContext ctx) {
		String code = visit(ctx.from);
		currentScope.getStack().pop(Type.INTEGER);
		currentScope.getStack().push(new Value(ctx.start, Type.BOOLEAN));
		return code;
	}
	
	@Override
	public String visitIntToString(IntToStringContext ctx) {
		String code = visit(ctx.from)
				+ "invokestatic java/lang/String/valueOf(I)Ljava/lang/String;\n";
		currentScope.getStack().pop(Type.INTEGER);
		currentScope.getStack().push(new Value(ctx.start, Type.STRING));
		return code;
	}
	
	@Override
	public String visitDoubleToInt(DoubleToIntContext ctx) {
		String code = visit(ctx.from)
				+ "d2i\n";
		currentScope.getStack().pop(Type.DOUBLE);
		currentScope.getStack().push(new Value(ctx.start, Type.INTEGER));
		return code;
	}
		
	@Override
	public String visitStringToInt(StringToIntContext ctx) {
		String code = visit(ctx.from)
				+ "invokestatic java/lang/Integer/parseInt(Ljava/lang/String;)I\n";
		currentScope.getStack().pop(Type.STRING);
		currentScope.getStack().push(new Value(ctx.start, Type.INTEGER));
		return code;
				
	}
	
	@Override
	protected String aggregateResult(String aggregate, String nextResult) {
		if(aggregate == null) {
			return nextResult;
		}
		if(nextResult == null) {
			return aggregate;
		}
		return aggregate + "\n" + nextResult;
	}
	
	private boolean functionIsDefined(Function function) {
		for(Function definedFunction : definedFunctions) {
			if(function.equals(definedFunction)) {
				return true;
			}
		}
		return false;
	}
	
}
