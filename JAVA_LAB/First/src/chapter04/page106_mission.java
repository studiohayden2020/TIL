package chapter04;

import java.util.Scanner;

/*
1. �ǹ��� �� ������ �Է� �ޱ� => scan �ϳ� �� �ޱ�
2. �� ������ �Է� ������ ���ؼ� �迭�� ������ �����ϱ� => �迭���� ������ (���� ã�ƺ���!!)
3. ���� ������ ���ؼ� Scanner�� �Է� �޾� �迭�� �ʱⰪ ���� => ����ڰ� �౹ �����ܰ� => {"�౹", "�����ܰ�"}
*/
public class page106_mission {
	
public static void main(String[] args) {
   
   System.out.println("������ ���� �� �� �ΰ���?"); // �迭���� ���� �Է� �ȳ� �޽���
   
   Scanner scan1 = new Scanner(System.in);     // ����ڿ��� �迭���� ���� �Է� ����
   int floor_count;                            // ����ڿ��� ���� ���� �����ϴ� ����
   floor_count = scan1.nextInt();              // ����ڿ��� ���� ���� ������ ����
   
   
   String[] name = new String[floor_count];    // name�� �迭���� ������ ����
   
   System.out.println("�� ���� ���� ������ �Է��ϼ���. ex) �౹ ����(�� �� ���) �����ܰ�"); // 1�� : �౹, 2�� �����ܰ�
   Scanner scan2 = new Scanner(System.in);
   
   
   System.out.println(floor_count); // �Էµ� ���� �� ���Դ��� Ȯ���ϴ� ��ɾ�
   
   for (int i = 0; i < floor_count; i++) {
      name[i] = scan2.nextLine();
   }
   
   for (int i = 0; i < floor_count; i++) {
      System.out.println("���� ���� ���� ������ " + (i+1) + "�� : " + name[i]);
   }
   
   scan1.close();
   scan2.close();
}
}