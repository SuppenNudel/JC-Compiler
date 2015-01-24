package dhbw.dev.compiler.compiler;

import org.antlr.v4.runtime.Token;

public class Value {
	
	private int line;
	private int column;
	private Type type;
	
	public Value(Token token, Type type) {
		this.line = token.getLine();
		this.column = token.getCharPositionInLine();
		this.type = type;
	}
	
	public int getLine() {
		return line;
	}
	
	public int getColumn() {
		return column;
	}
	
	public Type getType() {
		return type;
	}
	
	public static String jcToJasmin(String JCType) {
		switch (JCType) {
		case "#": return "I"; //Integer
		case "$": return "Z"; //Boolean
		case "§": return "Ljava/lang/String;"; //String
		case "%%": return "D"; //Double
		default: return "V"; //void
		}
	}
	
	public static Type jcToType(String JCType) {
		switch (JCType) {
		case "#": return Type.INTEGER; //Integer
		case "$": return Type.BOOLEAN; //Boolean
		case "§": return Type.STRING; //String
		case "%%": return Type.DOUBLE; //Double
		default: return Type.VOID; //void
		}
	}
	
	public static String typeToJasmin(Type type) {
		switch (type) {
		case INTEGER: return "I"; //Integer
		case BOOLEAN: return "Z"; //Boolean
		case STRING: return "Ljava/lang/String;"; //String
		case DOUBLE: return "D"; //Double
		case OBJECT: return "Ljava/lang/Object;"; //Double
		default: return "V"; //void
		}
	}
	
	public static int typeSize(Type type) {
		switch(type) {
		case INTEGER: return 1; //Integer
		case BOOLEAN: return 1; //Boolean
		case STRING: return 1; //String
		case DOUBLE: return 2; //Double
		case OBJECT: return 1; //Object
		default: return 1; //void
		}
	}
	
	@Override
	public String toString() {
		return line+":"+column+" "+type+" value";
	}
	
	public enum Type {
		INTEGER, BOOLEAN, STRING, DOUBLE, OBJECT, VOID;
	}

}
