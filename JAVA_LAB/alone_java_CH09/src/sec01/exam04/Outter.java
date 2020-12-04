package sec01.exam04;

public class Outter {
	// before JAVA 7
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100;
		//localVarible = 100;
		class Inner {
			public void method() {
				int result = args + localVariable;
			}
		}
	}
}

	// after JAVA 8
	public void method2(int arg) {
		//arg = 100;
		//localVarible = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}