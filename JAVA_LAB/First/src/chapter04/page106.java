package chapter04;

import java.util.Scanner;

import sun.java2d.opengl.WGLSurfaceData.WGLVSyncOffScreenSurfaceData;

public class page106 {

	public static void main(String[] args) {
				
		System.out.println("������ �ϴ� �� ��ȣ�� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int floor = scan.nextInt();
		String floor_name;
				
		switch(floor) {
		
		case 1:
			floor_name = "�౹";
			System.out.println(floor + "�� " + floor_name + " �Դϴ�.");
			scan.close();
			break;
		case 2:
			floor_name = "�����ܰ�";
			System.out.println(floor + "�� " + floor_name + " �Դϴ�.");
			scan.close();
			break;
		case 3:
			floor_name = "�Ǻΰ�";
			System.out.println(floor + "�� " + floor_name + " �Դϴ�.");
			scan.close();
			break;
		case 4:
			floor_name = "ġ��";
			System.out.println(floor + "�� " + floor_name + " �Դϴ�.");
			scan.close();
			break;
		case 5:
			floor_name = "�ｺŬ��";
			System.out.println(floor + "�� "
			+ floor_name + " �Դϴ�.");
			scan.close();
			break;
		default:
			floor_name = "�������� �ʴ� ���Դϴ�.";
			System.out.println(floor_name + " �� �ǹ��� 1�� ���� 5�� ������ �ֽ��ϴ�.");
			scan.close();
			break;
		}

	}

}
