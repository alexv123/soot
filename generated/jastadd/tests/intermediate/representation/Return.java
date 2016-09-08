package tests.intermediate.representation;

public class Return extends Statement {

	@Override
	public <T> T process(StatementProcessor<T> v) {
		return v.dispatch(this);
	}	

}
