package dhbw.dev.compiler.compiler.exceptions;

import org.antlr.v4.runtime.Token;

import dhbw.dev.compiler.compiler.Function;

public class UndefinedFunctionException extends CompileException {
	private static final long serialVersionUID = 3858332912964787605L;

	private Function function;
	
	public UndefinedFunctionException(Token functionNameToken, Function function) {
		super(functionNameToken);
		this.function = function;
	}
	
	@Override
	public String getMessage() {
		return line + ":" + column + " call to undefined function " + function;
	}
	
}
