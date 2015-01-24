package dhbw.dev.compiler.compiler;

import org.antlr.v4.runtime.Token;

import dhbw.dev.compiler.compiler.Value.Type;

public class Variable {
	
	private String varName;
	private int varIndex;
	private Type varType;
	private Scope scope;
	
	public Variable(Token varNameToken, int varIndex, String varTypeStr, Scope scope) {
		this.varName = varNameToken.getText();
		this.varIndex = varIndex;
		this.varType = Value.jcToType(varTypeStr);
		this.scope = scope;
	}
	
	public String getVarName() {
		return varName;
	}
	
	public int getVarIndex() {
		return varIndex;
	}
	
	public Type getVarType() {
		return varType;
	}
	
	public Scope getScope() {
		return scope;
	}
	
	public int getScopeId() {
		return scope.getScopeId();
	}
	
	@Override
	public String toString() {
		return varName+" is a "+varType+" and in varTable on place "+varIndex+" in Scope "+getScopeId();
	}

}
