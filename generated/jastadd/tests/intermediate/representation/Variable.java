package tests.intermediate.representation;

public class Variable {

	public enum Type {OTHER, FOO};
	
	public Type type;
	
	public Variable(Type type) {
		this.type = type; 
	}

	public String toString() {
		switch (this.type) {
		case FOO: return "Foo f";
		case OTHER: return "Other f";		
		}
		return "null";
	}

}
