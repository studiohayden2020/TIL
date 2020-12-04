package december03;

public class Println {
	public static void main(String[] args) {
	        
	        int age = 10;        
	        String addr = "경기도";
	        
	        //'%n'지시자를 사용 안 했을 경우
	        System.out.printf("줄바꿈 기능");
	        System.out.printf("없음.");
	        
	        //'%n'지시자를 사용한 경우
	        System.out.printf("줄바꾸기%n");
	        System.out.printf("성공!%n");
	        
	        System.out.printf("내 나이는 %d살 입니다.%n",age);
	        System.out.printf("내 나이는 %d살 이고 %s에 살고 있습니다.%n",age,addr);
	        
	    }//main
	 
	}//class

