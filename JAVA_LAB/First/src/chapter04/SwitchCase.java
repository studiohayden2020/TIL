package chapter04;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
		case 1 : 
			medalColor = '금'; // 가장 가까운 반복 빠져나옴
			break;
		case 2 : 
			medalColor = '은';
			break;
		case 3 : 
			medalColor = '동';
			break;
		default:
			medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");
	}

}
