package dhbw.dev.compiler.compiler.exceptions;

import dhbw.dev.compiler.compiler.Value;
import dhbw.dev.compiler.compiler.Value.Type;


public class WrongTypeException extends RuntimeException {
	private static final long serialVersionUID = 689259161547108747L;
	
	private Type expectedType;
	private Value actualValue;
	
	public WrongTypeException(Type expectedType, Value actualValue) {
		this.expectedType = expectedType;
		this.actualValue = actualValue;
	}
	
	@Override
	public String getMessage() {
		return "expected "+expectedType+" but got "+actualValue;
	}

}
