package Day04;

import java.util.Scanner;

public class Day04_2 {
	
	
	// �ݺ����� �̿��� �� ��� 
public static void main(String[] args) {
	
	// ����1 : �Է��� ���� ��ŭ ��[*] ���
	Scanner sc = new Scanner(System.in);
	System.out.print("���� �Է� ");
	int a = sc.nextInt(); // �Է°�ü���� ������ ������ 
	for(int i = 1;i <= a ; i++) {
		System.out.print("*");
		}
		// i �� 1���� �Է¹��� ������ i�� 1 �� �����ϸ鼭 �ݺ� 
	// ����2 : �Է��� ������ŭ ��[*] ��� /�� 5������ �ٹٲ� 
	System.out.println();
	System.out.print("���� �Է� : ");
	int a2 = sc.nextInt();
	for(int i = 1;i<=a;i++) {
		System.out.print("*");
		if (i%5==0) {
			System.out.println();
		}
	}
	System.out.println();
	// ���� 3: �Է��� �� ��ŭ ���ﰢ�� ��� 
		/*
		  *
		  **
		  ***
		  ****
		  *****
		 */
	int a3;
	a3 =sc.nextInt(); 
	for(int i = 1;i<=a3;i++ ) {
		for(int q =6-i;q<=a3;q++) { // for(int q = 1;q<=i;q++) �̷������ε� Ǯ �� �ִ�. 
			System.out.print("*");
		}
		System.out.println();
	}
	//���� 4 : �Է��� �� ��ŭ �� �ﰢ�� ��� (������)
	int a4;
	a4 =sc.nextInt();
	for(int i = 1;i<=a3;i++ ) {
		for(int q =i;q<=a3;q++) {
			System.out.print("*");
		}
		System.out.println();
	}
	//���� 5: �Է��� �� ��ŭ �� �ﰢ�� ��� 
	int a5;
	a5 = sc.nextInt();
	for(int i = 1;i<=a5;i++ ) {
		for(int q =i;q<a5;q++) { 
			System.out.print(" ");
			}
		for(int p =1;p<=i;p++) {
			System.out.print("*");
		}
		System.out.println();
		}
	//���� 6��: �Է��� �ٸ�ŭ ���ﰢ�� ��� 
	int a6;
	a6 = sc.nextInt();
	for(int i = 1;i<=a5;i++ ) {
		for(int q =1;q<i;q++) { 
			System.out.print(" ");
			}
		for(int p =i;p<=a5;p++) {
			System.out.print("*");
		}
		System.out.println();
		}
	// ���� 7 �� 
	int a7;
	a7 = sc.nextInt();
	for(int i=1;i<=a7;i++) {
		for(int q =i;q<a7;q++) {
			System.out.print(" ");
		}
		for(int p=1;p<=2*i-1;p++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	//���� 8�� 
	int a8;
	a8 = sc.nextInt();
	for(int i=1;i<=a8;i++) {
		for(int q =i;q<a8;q++) {
			System.out.print(" ");
		}
		for(int p=1;p<=2*i-1;p++) {
			System.out.print(i);
		}
		System.out.println();
	}
	// ���� 9�� 
	int a9;
	a9 = sc.nextInt();
	for(int i=1;i<=a9;i++) {
		for(int q =1;q<i;q++) {
			System.out.print(" ");
		}
		for(int p=1;p<=2*(a9-i+1)-1;p++) {
			System.out.print("*");
		}
		
			System.out.println();
	}
	//���� 10 ��  ������ ��ǰ 
	/*
	 *   *  1: �� 2�� ���� 3
	  * * 	2: �� 2�� ���� 1
	   *	3: �� 1�� ���� 0
	  * *	4: 
	 *   *
	 
	 
	 */
	int a10;
	a10 = sc.nextInt();
	for( int i =1;i<=a10;i++) {
		
		for(int j = 1;j<=a10;j++) {// i�� ��
			
			// �� = �� ������ ��� �� ��� 
			if(i==j) { // j�� �� 
				System.out.print("*");
			}
			else if((i+j)==(a10+1)) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	}
}
