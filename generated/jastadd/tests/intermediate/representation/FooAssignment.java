package tests.intermediate.representation;

public class FooAssignment extends Statement {

	@Override
	public <T> T process(StatementProcessor<T> v) {
		return v.dispatch(this);
	}
	
}
