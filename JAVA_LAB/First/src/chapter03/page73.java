package chapter03;
import java.util.Scanner;

public class page73 {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("����� ����ΰ���?");
      int n;
      n = sc.nextInt();
      if (n % 10==1) {
         System.out.println("1�������� ������");
      }
      else if (n%10==2) {
         System.out.println("2�������� ������");
      }
      else if (n % 10==3) {
         System.out.println("3�������� ������");
      }
      else if (n % 10==4) {
         System.out.println("4�������� ������");
      }
      else if (n % 10==5) {
         System.out.println("5�������� ������");
      }
      else if (n % 10==6) {
         System.out.println("6�������� ������");
      }
      else if (n % 10==7) {
         System.out.println("7�������� ������");
      }
      else if (n % 10==8) {
         System.out.println("8�������� ������");
      }
      else if (n % 10==9) {
         System.out.println("9�������� ������");
      }
      else {
         System.out.println("0�������� ������");
      }      
   }
}

