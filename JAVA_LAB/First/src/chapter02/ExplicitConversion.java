package chapter02;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; // ���� �� ��ȯ �Ǿ� ������
		int iNum4 = (int)(dNum1 + fNum2); // �� �Ǽ��� ���� ���� ���ǰ� �� ��ȯ��
		System.out.println(iNum3);
		System.out.println(iNum4);
		
	}

}
