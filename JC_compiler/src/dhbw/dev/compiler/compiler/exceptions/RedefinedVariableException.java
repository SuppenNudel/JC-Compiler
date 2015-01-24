package dhbw.dev.compiler.compiler.exceptions;

import org.antlr.v4.runtime.Token;

public class RedefinedVariableException extends CompileException {
	private static final long serialVersionUID = 8957398873297101333L;
	
	private String varName;
	
	public RedefinedVariableException(Token varNameToken) {
		super(varNameToken);
		varName = varNameToken.getText();
	}
	
	@Override
	public String getMessage() {
		return line + ":" + column + " redefined variable <" + varName + ">";
	}

}
