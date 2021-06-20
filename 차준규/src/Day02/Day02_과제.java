package Day02;

import java.util.Scanner;

public class Day02_과제 {
	public static void main(String[] args) {

		/* 문제1 :  1명의 회원가입 표 만들기 
		  변수) 아이디[S] , 비밀번호[short] , 성명[S] , 이메일[S]  입력받아 출력하기
				
		  출력) 
				//  >>>>>>>>>> 회원가입 완료 아래 정보를 확인해주세요 >>>>>>>>>
				// 아이디		비밀번호		성명		이메일		
				//	qwe		1234		유재석	itdanja@kakao.com
		 */
		
		/* 문제2 : 급여 명세서 
		 * [ 조건 ] 입력받기 : 기본급 , 수당 
		 * [ 출력 ] 실수령액 = 기본급 + 수당 - 세금[ 기본급10% ]
		 */
		
		//문제3 : 하나의 정수를 입력받아 7의 배수인지 확인 => T 혹은 F 출력  
		//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 
		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 
		//문제6 : 두개의 정수를 입력받아 더 큰수 확인 
		//문제7 : 반지름을 입력받아 원 넓이 출력하기
			// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
		//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
			// 예) 54.5   84.3 이면    64.285714%
		//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기	
			// 사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
		//문제10 : 키를 정수를 입력받아 표준체중 출력하기
			// 표준체중 계산식 = > (키 - 100) * 0.9
		
		//문제11 :  키와 몸무게를 입력받아 BMI 출력하기
		//	//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))

		//문제11 : inch 를 입력받아 cm 로 변환하기
		
		//문제12 : 중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여
			// 소수 둘째 자리 까지 점수 출력하기
			// 중간고사 반영비율 => 30 %
			// 기말고사 반영비율 => 30 %
			// 수행평가 반영비율 => 40 %
		
		//예제13: 연산 순서 나열 하고 x와 y값 예측하기
			// int x = 10;
			// int y = x-- + 5 + --x;
			// printf(" x의 값 : %d , y의값 :  %d ", x, y)
		Scanner sc = new Scanner(System.in);
		//문제1 번 풀이 
//		String id,name,email;
//		short password;
//		System.out.print("아이디를 입력해주세요 : ");
//		id = sc.next();
//		System.out.print("비밀번호를 입력해주세요 : ");
//		password = sc.nextShort();
//		System.out.print("이름을 입력해주세요 : ");
//		name = sc.next();
//		System.out.print("이메일을 입력해주세요 : ");
//		email = sc.next();
//		System.out.println(">>>>>>>>>> 회원가입 완료 아래 정보를 확인해주세요 >>>>>>>>>");
//		System.out.println("아이디\t 비밀번호\t성명\t이메일");
//		System.out.println("%s\t%d\t%s\t%s",id,password,name,email);
		
		//문제2 번 풀이 
//		int basic,cost,real;
//		System.out.print("기본급을 입력해주세요 : ");
//		basic = sc.nextInt();
//		System.out.print("수당을 입력해주세요 : ");
//		cost = sc.nextInt();
//		real = basic+cost-(basic*(1/10));
//		System.out.println("실수령액은 : "+real+ "원 입니다.");
		
		//문제 3번 풀이 
//		int input;
//		System.out.print("하나의 정수를 입력해주세요: ");
//		input = sc.nextInt();
//		System.out.println("입력하신 정수는 7의배수가  " + (input%7 == 0 ) +" 입니다.");
		
		
		//문제 4번 풀이 
//		int input;
//		System.out.print("하나의 정수를 입력해주세요: ");
//		input = sc.nextInt();
//		System.out.println( input + "은 홀수가" + ((input%2)==1) +"입니다.");
		
		//문제 5번 풀이
		int input;
		System.out.print("하나의 정수를 입력해주세요: ");
		input = sc.nextInt();
		System.out.println("입력하신 정수는 7의 배수이면서 짝수가 " + (((input%142)==0) && ((input%7)==0)) + "입니다 " );
		
	}
}
