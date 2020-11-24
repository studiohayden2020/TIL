package staticex;

import sun.java2d.opengl.WGLSurfaceData.WGLVSyncOffScreenSurfaceData;

public class StudentTest3 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(Student1.serialNum);
		System.out.println(studentLee.studentName);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(Student1.serialNum);
		System.out.println(studentSon.studentName + "학번:" + studentSon.studentID);
	}

}
