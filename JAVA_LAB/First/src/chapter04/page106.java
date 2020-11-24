package chapter04;

import java.util.Scanner;

import sun.java2d.opengl.WGLSurfaceData.WGLVSyncOffScreenSurfaceData;

public class page106 {

	public static void main(String[] args) {
				
		System.out.println("가고자 하는 층 번호를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int floor = scan.nextInt();
		String floor_name;
				
		switch(floor) {
		
		case 1:
			floor_name = "약국";
			System.out.println(floor + "층 " + floor_name + " 입니다.");
			scan.close();
			break;
		case 2:
			floor_name = "정형외과";
			System.out.println(floor + "층 " + floor_name + " 입니다.");
			scan.close();
			break;
		case 3:
			floor_name = "피부과";
			System.out.println(floor + "층 " + floor_name + " 입니다.");
			scan.close();
			break;
		case 4:
			floor_name = "치과";
			System.out.println(floor + "층 " + floor_name + " 입니다.");
			scan.close();
			break;
		case 5:
			floor_name = "헬스클럽";
			System.out.println(floor + "층 "
			+ floor_name + " 입니다.");
			scan.close();
			break;
		default:
			floor_name = "존재하지 않는 층입니다.";
			System.out.println(floor_name + " 이 건물은 1층 부터 5층 까지만 있습니다.");
			scan.close();
			break;
		}

	}

}
