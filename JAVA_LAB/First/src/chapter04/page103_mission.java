package chapter04;

import java.util.Scanner;

import sun.java2d.opengl.WGLSurfaceData.WGLVSyncOffScreenSurfaceData;

public class page103_mission {

	public static void main(String[] args) {
		System.out.println("���� ���ڷ� �Է��ϼ���: ");
		Scanner scan = new Scanner(System.in);
		int season_num = scan.nextInt();
		String season_str;
		
		switch(season_num) {
		
		case 12:
		case 1:
		case 2:
			season_str = "�ܿ�";
			System.out.println(season_str + "�Դϴ�.");
			break;
			
		case 3:
		case 4:
		case 5:
			season_str = "��";
			System.out.println(season_str + "�Դϴ�.");
			break;
			
		case 6:
		case 7:
		case 8:
			season_str = "����";
			System.out.println(season_str + "�Դϴ�.");
			break;
			
		case 9:
		case 10:
		case 11:
			season_str = "����";
			System.out.println(season_str + "�Դϴ�.");
			break;			
		}

	}

}
