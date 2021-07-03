package Day05;

public class Day05_2 {
	public static void main(String[] args) {
		
		// 변수 : 데이터를 저장하는 메모리  
			// 컴퓨터 : 메모리주소값 , 용량단위 ,  데이터
			// 사람 : 변수명 , 자료형 , 값 
		
		// 배열 : 특정기준으로 나열 
			// [ 인덱스 ] : 배열에 저장된 요소들의 순서 번호 ( 0 번부터 시작 )
			// 동일한 자료형의 여러 변수를 관리 => 서로 다른 자료형 불가 
			
		
		
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

		
		
	}
}
