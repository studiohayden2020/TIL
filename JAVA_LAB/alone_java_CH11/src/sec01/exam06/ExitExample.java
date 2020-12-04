package sec01.exam06;

//프로그램 종료(exit())
public class ExitExample {
	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			if(i == 5) {
//				System.exit(0);
				break;
			}
		}
		System.out.println("마무리 코드");
	}
}

// 8번 9번 라인을 번갈아서 주석처리해 보고 실행하기