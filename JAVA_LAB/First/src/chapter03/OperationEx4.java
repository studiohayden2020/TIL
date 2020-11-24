package chapter03;

import sun.java2d.opengl.WGLSurfaceData.WGLVSyncOffScreenSurfaceData;

public class OperationEx4 {

	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ?  'a' : 'b' ;
				
		System.out.println(ch);

		int num = (5>3)?10:20;
		System.out.println(num);
		
		int num1 = 10;
		boolean isEven;
		isEven = (num1 % 2) == 0;
		System.out.println(isEven);		
				
	}

}
