package classpart;

public class Student {	// 학생 클래스(재활용)
	int studentID;		// 학번
	String studentName; // 이름
	int grade;			// 등급
	String address;		// 주소
	
	public String getStudentName( ) {
		return studentName;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student ();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
