package Day02;

public class Day02_1 {// c s 
	public static void main(String[] args) {
		
		
		// ctrl+스페이스바 => 자동완성 
		//연산자 
		
		//1. 산술연산자[ 문자 x ]
			// 문자 + 문자 : 연결 연산자 
		System.out.println("더하기" + (3+5));
		System.out.println("빼기" + (5-3));
		System.out.println("곱하기" + (5*3));
		System.out.println("나누기" + (5/3));
		System.out.println("나머지" + (5%3));
		
		// 2. 비교연산자 [ 결과 : true/false ]
			// > : 초과 	< : 미만		== : 같다 [ = 대입 ]
			// >= (크거나 같다만 있지 같거나 크다는 없다 ): 이상 		<= :이하 
		System.out.println("초과:" + (5>3));
		System.out.println("이상:" + (5>=3));
		System.out.println("미만:" + (5<3));
		System.out.println("이하:"+(5<=3));
		System.out.println("같다:" + (5==3));
		System.out.println("같지않다:"
		+(5!=3));
		
		/* 문제1
		  3 이 홀수인지 짝수인지 출력 ( 홀수/짝수 판단 ) 
		  홀수이면 [true] 짝수이면 [false
		 */
		/* 문제2
		  36의 수가 3의 배수이면 [true] 아니면 [false] 출력 
		 */
		System.out.println("3은 홀수:" + ((3%2)==1));
		// 홀수/짝수 판단 
			// 값 % 2  == 0: 나머지가 0이면 값은 짝수 아니면 홀수 
		
		
		System.out.println("36은 3의 배수 :" + ((36%3)==0));
		// 배수 판단 
			// 값 % 수 == 0 : 나머지가 0 이면 해당 값은 그 수의 배수 
		
		//3.  [ 비교연산자 2개 이상일 경우 ] ==> 관계 연산자
			//and: && :이면서 면서 이고 모두 그리고 [ 비교연산자 모두 T => T ]
			// or: || :이거나 거나 또는 하나라도 [ 비교연산자 하나라도 T=>T ]
			// 부정: ! : true => false , false => true
		System.out.println("and: "+(1<3 && 3<5));
		System.out.println("or :" +(1<3 || 3<2)); //T , 한개만 T여도 T가 나온다.
		System.out.println("부정: " + !(1<3));
		
	}
}// c e 
