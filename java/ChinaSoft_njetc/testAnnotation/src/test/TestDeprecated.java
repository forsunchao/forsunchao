package test;

public class TestDeprecated {
	@Deprecated
	public void oldMethod() {
	}

	public void newMethod() {
	}
	
	public static void main(String args[]) {
		TestDeprecated test = new TestDeprecated();
		test.oldMethod();
		test.newMethod();
	}
}
