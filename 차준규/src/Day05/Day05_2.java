package Day05;

public class Day05_2 {
	public static void main(String[] args) {
		
		// 변수 : 데이터를 저장하는 메모리  
			// 컴퓨터 : 메모리주소값 , 용량단위 ,  데이터
			// 사람 : 변수명 , 자료형 , 값 
		
		// 배열 : 특정기준으로 나열 
			// [ 인덱스 ] : 배열에 저장된 요소들의 순서 번호 ( 0 번부터 시작 )
			// 동일한 자료형의 여러 변수를 관리 => 서로 다른 자료형 불가 
			// 클래스를 이용한 배열 선언 
			// 선언과 동시에 메모리 할당 [ 메모리 비효율성 ]
		
		
		// 변수 
		int 정수1; // 4바이트 변수 
		int 정수2; // 4바이트 변수 
		int 정수3; // 4바이트 변수 
		// 배열
		int[] 정수배열 = new int [3];// int형 3개 저장할 수 있는 배열 
		int[] 정수배열2 = {3,4,7}; // 선언과 동시에 초기값
		// 배열 값 호출 => 배열명[ 인덱스 번호 ]
		System.out.println(" 배열: " + 정수배열2); // 배열의 주소값
		System.out.println(" 배열의 0인덱스"+ 정수배열2[0]); // 인덱스 위치 값
		System.out.println(" 배열의 1인덱스"+ 정수배열2[1]); // 인덱스 위치 값
		System.out.println(" 배열의 2인덱스"+ 정수배열2[2]); // 인덱스 위치 값
		// 배열의 길이 
		System.out.println(" 배열 : "+ 정수배열2.length); // 배열내 요소 개수[ 배열의 길이 ]
		System.out.println(" 배열 :" + 정수배열2.toString()); // 배열의 주소값
			
			//문제 : 반복문을 이용한 0~99까지 int 형 배열에 각 인덱스에 저장하고 출력 
			int[] 정수배열3 = new int[100];
			for(int i = 0 ;i<정수배열3.length;i++) {
				정수배열3[i] = i; // i 번째 인덱스에 i 를 대입 
			}
			//호출 
			for (int i =0;i<정수배열3.length;i++) {
				System.out.print(정수배열3[i]+"\t");
			}
			System.out.println();
		// 2차원 배열 [행인덱스][열인덱스]
			//행 = row
			//열 = column
		int[][] 배열2 = new int[2][3];
		int[][] 배열3 = { {10,20,30},{40,50,60} };
		배열2[0][0]= 80;
		배열2[0][1] = 90;
		배열2[0][2] = 100;
		배열2[1][0] = 40;
		배열2[1][1]= 50;
		배열2[1][2] = 60;
		System.out.println(" 2차원 배열 호출 :" + 배열2[0][0]);
		System.out.println(" 2차원 배열 호출 :" + 배열2[0][1]);
		System.out.println(" 2차원 배열 호출 :" + 배열2[0][2]);
		System.out.println(" 2차원 배열 호출 :" + 배열2[1][0]);
		System.out.println(" 2차원 배열 호출 :" + 배열2[1][1]);
		System.out.println(" 2차원 배열 호출 :" + 배열2[1][2]);
		
		
		// 문제2: 0~49 까지 첫번째 행 저장 50~99 까지 두번째 행 저장하는 2차월 배열 선언하고 출력 
		int[][] 배열4 = new int[2][50];
		for(int i = 0;i<2;i++) {
			for(int j=0;j<50;j++) {
				배열4[i][j]=50*i+j;
			}
		}
		int[][] 배열5 = new int[2][50];

		for(int i = 0;i<100;i++) {
			
			if(i<50) 배열5[0][i]=i;
			else 배열5[1][i-50]=i;
		}
		
		for(int i=0;i<100;i++) {
			if(i<50)System.out.println(배열4[0][i]);
			else System.out.println(배열4[1][i-50]);
		}

		for(int i=0;i<100;i++) {
			if(i<50)System.out.println(배열5[0][i]);
			else System.out.println(배열5[1][i-50]);
		}

		
	
			
		
			
		

		
		
	}
}
