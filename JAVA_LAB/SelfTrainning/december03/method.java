package december03;

public class method {
	  public static void main(String[] args) {
	    /* 1. 변수를 생성하시오. */
	    int Fork = 180;
	    double Kcal = 5.179;
	    int n = 3;
	    
	    /* 2. 메소드를 통한 칼로리를 계산하시오. */
  
	    double myMeal = kcal(3, 180, 5.179);
	    
	    /* 3. 결과를 출력하시오 */
	    System.out.printf("삼겹살 3인분: %.2f kcal", myMeal);
	  }

	  /* 4. 칼로리 계산을 위한 메소드를 작성하시오. */
	    public static double kcal(int n, int fork, double kcal) {
	      double result = (fork * kcal) * n;
	      return result;
	}
}