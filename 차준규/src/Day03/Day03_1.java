package Day03;

public class Day03_1 {
	
	// 1. 출력
		// print , printf , println 
		//  제어문자 : \n \t \r(개행 ==> 맨앞으로 가게 해주는 기능)
		// 형식문자 : %d %c %f %s
	//2. 연산자
		// 산술연산자 : + - * / %(나머지값)
		// 비교연산자 : > < >= <= == !=
		// 논리연산자 : && 		|| 		!
		// 대입연산자 : =(오른쪽에서 왼쪽으로 += 등 
		// 증감연산자 : 변수++ 변수-- ++변수 --변수 
	// 3. 변수 [ 메모리 ]
		// 자료형 : 미리 정해진 메모리 크기 
			// boolean , byte , char , short , int , long , float , double 등 
		// 변수 주소값 : 컴퓨터의 변수를 찾는 위치 값 [16진수]
	// 4. 입력 받기 [ 입력 객체 ] 
		//Scanner 클래스 -> import 를 해야한다. 
			// Scanner 객체명 = new Scanner(System.in);
		// 입력객체에서 데이터 가져오기 => .next()
	public static void main(String[] args) {
		//Day2 과제 
		//문제3 : 하나의 정수를 입력받아 7의 배수이닞 확인 => T 혹은 F 출력 
			// 배수 찾기: 값 % 수 == 0 
				// 나머지가 0이면 값은 그 수의 배수 
		
		//문제4 :
			// 홀수 / 짝수 판단하기 : 값 % 2 == 0 
				// 0이면 값은 짝수 
				// 1이면 값은 홀수 
		// 문제 5: 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 
			// 이면서 && : 조건1 && 조건2 && 조건 3 
			// 이거나 || : 조건1 || 조건2 || 조건 3
		
	}

}
