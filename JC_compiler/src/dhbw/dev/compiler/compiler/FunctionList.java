package dhbw.dev.compiler.compiler;

import java.util.ArrayList;


public class FunctionList extends ArrayList<Function> {
	private static final long serialVersionUID = 7085162751130512793L;

	@Override
	public boolean contains(Object o) {
		for(Function function : this) {
			if(function.equals(o)) {
				return true;
			}
		}
		return false;
	}
	
}
