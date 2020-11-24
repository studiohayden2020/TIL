package chapter04;

import java.util.Scanner;

import sun.java2d.opengl.WGLSurfaceData.WGLVSyncOffScreenSurfaceData;

public class page103_mission {

	public static void main(String[] args) {
		System.out.println("월을 숫자로 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int season_num = scan.nextInt();
		String season_str;
		
		switch(season_num) {
		
		case 12:
		case 1:
		case 2:
			season_str = "겨울";
			System.out.println(season_str + "입니다.");
			break;
			
		case 3:
		case 4:
		case 5:
			season_str = "봄";
			System.out.println(season_str + "입니다.");
			break;
			
		case 6:
		case 7:
		case 8:
			season_str = "여름";
			System.out.println(season_str + "입니다.");
			break;
			
		case 9:
		case 10:
		case 11:
			season_str = "가을";
			System.out.println(season_str + "입니다.");
			break;			
		}

	}

}
