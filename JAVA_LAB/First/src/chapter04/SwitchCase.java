package chapter04;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
		case 1 : 
			medalColor = '��'; // ���� ����� �ݺ� ��������
			break;
		case 2 : 
			medalColor = '��';
			break;
		case 3 : 
			medalColor = '��';
			break;
		default:
			medalColor = 'A';
		}
		System.out.println(ranking + "�� �޴��� ������ " + medalColor + " �Դϴ�.");
	}

}
