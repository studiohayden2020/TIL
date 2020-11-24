package chapter03;

import sun.java2d.opengl.WGLSurfaceData.WGLVSyncOffScreenSurfaceData;

public class OperationEx5 {

	public static void main(String[] args) {
		int num = 0B10101;
		
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		
		System.out.println(num);
		
	
		num = num << 2;
		System.out.println(num);
	}

}
