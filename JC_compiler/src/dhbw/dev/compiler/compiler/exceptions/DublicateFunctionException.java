package dhbw.dev.compiler.compiler.exceptions;

import org.antlr.v4.runtime.Token;

import dhbw.dev.compiler.compiler.Function;

public class DublicateFunctionException extends CompileException {
	private static final long serialVersionUID = 6351586469132921244L;

	private Function function;
	
	public DublicateFunctionException(Token functionNameToken, Function function) {
		super(functionNameToken);
		this.function = function;
	}
	
	@Override
	public String getMessage() {
		return line+":"+column+" redefined function "+function;
	}

}
