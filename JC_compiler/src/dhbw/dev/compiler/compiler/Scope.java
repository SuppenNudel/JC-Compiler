package dhbw.dev.compiler.compiler;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Token;

import dhbw.dev.compiler.compiler.exceptions.RedefinedVariableException;
import dhbw.dev.compiler.compiler.exceptions.UndeclaredVariableException;

public class Scope {
	
	private Scope parent;
	private MyStack stack = new MyStack();
	private Map<String, Variable> variables = new HashMap<String, Variable>();
	private int size;
	
	private int scopeId;
	private static int scopeNumbers = 0;
	
	public Scope(Scope parent) {
		this.parent = parent;
		scopeId = scopeNumbers++;
	}
	
	public void putVariable(Token varNameToken, String jcVarTypeStr) {
		Variable newVariable = new Variable(varNameToken, size, jcVarTypeStr, this);
		try {
			Variable existingVariable = getVariable(varNameToken);
			if(existingVariable.getVarType() != Value.jcToType(jcVarTypeStr)) {
				throw new RedefinedVariableException(varNameToken);
			}
		} catch(UndeclaredVariableException e) {
			incSize(Value.typeSize(newVariable.getVarType()));
			variables.put(varNameToken.getText(), newVariable);
		}
	}
	
	public Variable getVariable(Token varNameToken) throws UndeclaredVariableException {		
		Variable result = variables.get(varNameToken.getText());
		if(result == null) {
			if(parent == null) {
				throw new UndeclaredVariableException(varNameToken);
			} else {
				return parent.getVariable(varNameToken);
			}
		} else {
			return result;
		}
	}
	
	private void incSize(int toInc) {
		size += toInc;
		if(parent != null) {
			parent.incSize(toInc);
		}
	}
	
	public int getSize() {
		if(parent == null) {
			return size;
		} else {
			return parent.getSize();
		}
	}
	
	public MyStack getStack() {
		if(parent == null) {
			return stack;
		} else {
			return parent.getStack();
		}
	}
	
	public Scope getParent() {
		return parent;
	}
	
	private Map<String, Variable> getVariables() {
		return variables;
	}

	public int getScopeId() {
		return scopeId;
	}
	
	@Override
	public String toString() {
		String result = variables.toString();
		Scope parent = this.parent;
		while(parent != null) {
			result += ";\n\t"+parent.getVariables();
			parent = parent.getParent();
		}
		return result;
	}

}
