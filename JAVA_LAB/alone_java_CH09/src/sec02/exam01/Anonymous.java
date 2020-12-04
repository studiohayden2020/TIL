package sec02.exam01;

public class Anonymous {
	// input field default value
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	void method1() {
		// input local variable value
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		
		// use local variable
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
