package test;

public class TestOverride {
	@Override
	public String toString() {
		return super.toString() + " [Override Tester Implementation]";
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
}
