package chapter03;
import java.util.Scanner;

public class page73 {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("당신은 몇번인가요?");
      int n;
      n = sc.nextInt();
      if (n % 10==1) {
         System.out.println("1번방으로 가세요");
      }
      else if (n%10==2) {
         System.out.println("2번방으로 가세요");
      }
      else if (n % 10==3) {
         System.out.println("3번방으로 가세요");
      }
      else if (n % 10==4) {
         System.out.println("4번방으로 가세요");
      }
      else if (n % 10==5) {
         System.out.println("5번방으로 가세요");
      }
      else if (n % 10==6) {
         System.out.println("6번방으로 가세요");
      }
      else if (n % 10==7) {
         System.out.println("7번방으로 가세요");
      }
      else if (n % 10==8) {
         System.out.println("8번방으로 가세요");
      }
      else if (n % 10==9) {
         System.out.println("9번방으로 가세요");
      }
      else {
         System.out.println("0번방으로 가세요");
      }      
   }
}

