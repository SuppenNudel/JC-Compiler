package dhbw.dev.compiler.compiler;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.Token;

import dhbw.dev.compiler.compiler.Value.Type;
import dhbw.dev.compiler.parser.JCParser.DeclarationContext;

public class Function {
	
	private String funcName;
	private Type type;
	private ArrayList<Type> parameters = new ArrayList<Type>();

	public Function(Token functionNameToken, Type returnType, List<DeclarationContext> parameters) {
		funcName = functionNameToken.getText();
		type = returnType;
		for(DeclarationContext declaration : parameters) {
			this.parameters.add(Value.jcToType(declaration.type.getText()));
		}
	}

	public Function(Token functionNameToken, Type returnType, Stack<Type> paramTypes) {
		funcName = functionNameToken.getText();
		type = returnType;
		for(Type type : paramTypes) {
			this.parameters.add(type);
		}
	}

	public String getFuncName() {
		return funcName;
	}
	
	public ArrayList<Type> getParameters() {
		return parameters;
	}
	
	public Type getType() {
		return type;
	}
	
	@Override
	public boolean equals(Object obj) {
		Function function = (Function) obj;
		return function.getFuncName().equals(this.getFuncName())
			&& function.getType().equals(this.getType())
			&& function.getParameters().equals(this.getParameters());
	}
	
	@Override
	public String toString() {
		return funcName+" "+parameters+ " returns "+type;
	}

}
