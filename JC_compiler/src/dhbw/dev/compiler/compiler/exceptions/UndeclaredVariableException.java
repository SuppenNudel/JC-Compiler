package dhbw.dev.compiler.compiler.exceptions;

import org.antlr.v4.runtime.Token;

public class UndeclaredVariableException extends CompileException {
	private static final long serialVersionUID = 207922997479424131L;
	
	private String varName;
	
	public UndeclaredVariableException(Token varNameToken) {
		super(varNameToken);
		varName = varNameToken.getText();
	}
	
	@Override
	public String getMessage() {
		return line + ":" + column + " undeclared variable <" + varName + ">";
	}

}
