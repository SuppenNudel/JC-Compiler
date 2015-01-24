package dhbw.dev.compiler.compiler;

import org.antlr.v4.runtime.tree.ParseTree;

import dhbw.dev.compiler.compiler.Value.Type;
import dhbw.dev.compiler.compiler.exceptions.DublicateFunctionException;
import dhbw.dev.compiler.parser.JCBaseVisitor;
import dhbw.dev.compiler.parser.JCParser.FunctionBoolContext;
import dhbw.dev.compiler.parser.JCParser.FunctionIntContext;
import dhbw.dev.compiler.parser.JCParser.FunctionStringContext;
import dhbw.dev.compiler.parser.JCParser.MethodContext;

public class FunctionDefintitionFinder {
	
	public static FunctionList findFunctions(ParseTree tree) {
		final FunctionList definedFunctions = new FunctionList();
		new JCBaseVisitor<Void>() {
			@Override
			public Void visitMethod(MethodContext ctx) {
				Function function = new Function(ctx.methodName, Type.VOID, ctx.parameters);
				if(definedFunctions.contains(function)) {
					throw new DublicateFunctionException(ctx.methodName, function);
				} else {
					definedFunctions.add(function);
				}
				return null;
			}
			
			@Override
			public Void visitFunctionBool(FunctionBoolContext ctx) {
				Function function = new Function(ctx.functionName, Type.BOOLEAN, ctx.parameters);
				if(definedFunctions.contains(function)) {
					throw new DublicateFunctionException(ctx.functionName, function);
				} else {
					definedFunctions.add(function);
				}
				return null;
			}
			
			@Override
			public Void visitFunctionInt(FunctionIntContext ctx) {
				Function function = new Function(ctx.functionName, Type.INTEGER, ctx.parameters);
				if(definedFunctions.contains(function)) {
					throw new DublicateFunctionException(ctx.functionName, function);
				} else {
					definedFunctions.add(function);
				}
				return null;
			}
			
			@Override
			public Void visitFunctionString(FunctionStringContext ctx) {
				Function function = new Function(ctx.functionName, Type.STRING, ctx.parameters);
				if(definedFunctions.contains(function)) {
					throw new DublicateFunctionException(ctx.functionName, function);
				} else {
					definedFunctions.add(function);
				}
				return null;
			}
		}.visit(tree);

		return definedFunctions;
	}
	
}
