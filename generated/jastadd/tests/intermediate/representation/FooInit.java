package tests.intermediate.representation;

public class FooInit extends Statement {

	@Override
	public <T> T process(StatementProcessor<T> v) {
		return v.dispatch(this);
	}

}
