package Day04;

import java.util.Scanner;

public class Day04_2 {
	
	
	// 반복문을 이용한 별 출력 
public static void main(String[] args) {
	
	// 문제1 : 입력한 개수 만큼 별[*] 출력
	Scanner sc = new Scanner(System.in);
	System.out.print("정수 입력 ");
	int a = sc.nextInt(); // 입력객체에서 데이터 가져옴 
	for(int i = 1;i <= a ; i++) {
		System.out.print("*");
		}
		// i 는 1부터 입력받은 수까지 i는 1 씩 증가하면서 반복 
	// 문제2 : 입력한 개수만큼 별[*] 출력 /단 5개마다 줄바꿈 
	System.out.println();
	System.out.print("정수 입력 : ");
	int a2 = sc.nextInt();
	for(int i = 1;i<=a;i++) {
		System.out.print("*");
		if (i%5==0) {
			System.out.println();
		}
	}
	System.out.println();
	// 문제 3: 입력한 줄 만큼 별삼각형 출력 
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
		for(int q =6-i;q<=a3;q++) { // for(int q = 1;q<=i;q++) 이런식으로도 풀 수 있다. 
			System.out.print("*");
		}
		System.out.println();
	}
	//문제 4 : 입력한 줄 만큼 별 삼각형 출력 (리버스)
	int a4;
	a4 =sc.nextInt();
	for(int i = 1;i<=a3;i++ ) {
		for(int q =i;q<=a3;q++) {
			System.out.print("*");
		}
		System.out.println();
	}
	//문제 5: 입력한 줄 만큼 별 삼각형 출력 
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
	//문제 6번: 입력한 줄만큼 별삼각형 출력 
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
	// 문제 7 번 
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
	
	//문제 8번 
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
	// 문제 9번 
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
	//문제 10 번  스스로 못품 
	/*
	 *   *  1: 별 2개 공백 3
	  * * 	2: 별 2개 공백 1
	   *	3: 별 1개 공백 0
	  * *	4: 
	 *   *
	 
	 
	 */
	int a10;
	a10 = sc.nextInt();
	for( int i =1;i<=a10;i++) {
		
		for(int j = 1;j<=a10;j++) {// i가 행
			
			// 행 = 열 동일한 경우 별 찍기 
			if(i==j) { // j가 열 
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
