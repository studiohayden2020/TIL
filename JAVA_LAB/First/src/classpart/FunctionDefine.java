package classpart;

public class FunctionDefine {
	public int add(int num1, int num2) {
		int result; 
		result = num1 + num2;
		return result;
	 }
			
	public static void main(String[] args) {
		FunctionDefine result = new FunctionDefine();
		int return_result = result.add(1, 2);
		System.out.println(return_result);
		
	}
}
