package Day06;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Day06_1 {
	
	
	// ���� : �޸� �Ҵ� 
	// �迭 : ������ �ڷ����� ���� ������ ����/����
		//�ڷ��� �迭�� = new �ڷ���[����]
			// new : �޸� �Ҵ� ������ 
		// [�ε���] : �迭�� ����Ǵ� ���� ��ȣ 
		// �پ��� �޼ҵ� [�̸� �ۼ��� �ڵ�] ==> Arrays Ŭ���� ��� 
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// �л����� �Է¹޾� �л�����ŭ �迭�� �޸��Ҵ�
		
		Integer[] �л����� = null; // ���� �޸𸮰� null�� �迭 ����
			// int 	   : ���� �ڷ���  [ new x ] => ���� 
			// Integer : ���� Ŭ����  [ new o ] => ��ü 
		while(true)  {  // ���� ���� 
		
			System.out.println("----�л� ���� ���α׷� ----");
			System.out.println("1. �л��� 2. ���� �Է� 3.��� 4. ���� ");
			int ���� = sc.nextInt();
			if(���� == 1 ) {
				System.out.print("---> �л��� : ");
				int �ο��� = sc.nextInt();
				�л����� = new Integer[�ο���];
				System.out.println(�ο��� + "��ŭ �л������� �Է��Ҽ� �ֽ��ϴ�.");
			}
			else if(���� == 2 ) {
				for(int i = 0;i<�л�����.length;i++) {
					System.out.println((i+1)+"��°�� �л����� �Է� : ");
					�л�����[i]= sc.nextInt();
				}
			}
			else if(���� == 3 ) {
				// ���� = sort() => �׽�Ʈ�� �غ��ϸ� �����ٵ� �˾ƾ��Ѵ�.
				Arrays.sort(�л�����); // ��������
				//��� 
				System.out.println("------- �������� ---------");
				for(int i = 0;i<�л�����.length;i++) {
					System.out.println((i+1)+"��° �л��� ���� " +�л�����[i]);
				}
				
				// �������� => �������� �ݴ�� [ �⺻ �ڷ���
				Arrays.sort(�л�����,Collections.reverseOrder() );
				System.out.println("------- �������� ---------");
				for(int i = 0;i<�л�����.length;i++) {
					System.out.println((i+1)+"��° �л��� ���� " +�л�����[i]);
				}
				
				// ���� ���� ���� ��� 
//				int max = 0;
//				for(int i=0;i< �л�����.length;i++) {
//					if(max < �л�����[i]) max = �л�����[i];
//				}
				// ���
				int high;
				int ����=0;
				double ���;
				System.out.println("���� ���� ���� : "+ �л�����[0]);
				for( int i =0;i<�л�����.length;i++) {
					���� += �л�����[i];
				}
				��� = ���� / �л�����.length ;
				System.out.println("����� : " + ���);
						// �÷��� : �迭 , ����Ʈ 
			}
			if(���� == 4 ) {}
			else {}
}
		
		
	} // main end
}
