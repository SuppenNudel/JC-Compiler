package dhbw.dev.compiler.compiler;

import java.util.Stack;

import dhbw.dev.compiler.compiler.Value.Type;
import dhbw.dev.compiler.compiler.exceptions.WrongTypeException;

public class MyStack extends Stack<Value> {
	private static final long serialVersionUID = 9051946782517408754L;
	
	private int maxStack = 0;
	
	public synchronized void pop(Type expectedType) {
		for(int i=0; i<Value.typeSize(expectedType); ++i) {
			Value value = super.pop();
			if(expectedType != value.getType()) {
				throw new WrongTypeException(expectedType, value);
			}
		}
	}

	@Override
	public Value push(Value item) {
		for(int i=0; i<Value.typeSize(item.getType()); ++i) {
			super.push(item);
			if(size() > maxStack) {
				maxStack = size();
			}
		}
		return item;
	}
	
	public int getMaxStack() {
		return maxStack;
	}
	
}
