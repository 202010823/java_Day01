package Day02;

import java.util.Scanner; //Scanner ����ϱ����� import

public class Day02_3 {
	public static void main(String[] args) {
		
		
		//�Է¹ޱ� 
			//1. �Է¹ޱ� => ������ ���� => ��� 
		
		Scanner scan = new Scanner(System.in);
			// Scanner : �Է� ���� Ŭ���� 
		 		//Scan: ��ü�� vs ������  
					// new : ��ü�� �޸� �Ҵ� ������ 
						// Scanner(System.in) : Ŭ���� ������ System.in �� Ű���带 �ǹ��Ѵ�.
		
		System.out.print("���� �Է� : ");
		int �Է����� =  scan.nextInt();
				//nextint() : �Է°�ü�� �Էµ� ���� �������� 
		System.out.printf(" ���� �Է��� ������ : " + �Է�����);
		
		System.out.println(" ���ڿ� �Է� : ");
		String �Է¹��ڿ� = scan.next();
				// next(): �Է°�ü�� �Էµ� ���ڿ� �������� 
		System.out.println("���� �Է��� ���ڿ��� : " + �Է¹��ڿ� );
		
		
	}
}
