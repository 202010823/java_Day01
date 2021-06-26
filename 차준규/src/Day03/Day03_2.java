package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	// 제어문 : 경우의 따른 판단력 
		// if [논리검사] , switch[ 값 검사 ] 
	public static void main(String[] args) {
		// if 형태 
			// 만약에 ~ 이면 
			// 1. if (T / F ) 실행문;
			// 2. if (T / F ) T실행문;
			// 		else F실행문;
			// 3. if( T/F ) {실행문; 실행문2; }
			// 		else { 실행문; 실행문2}
			// 4. if(T / F) 실행문[T1]
		//예1
		if (5 >3) 
			System.out.println("5가 크다.");
		if(5>10)
			System.out.println("5가 크다2");
		
		if(5>3) 
			System.out.println("5가 크다3 ");
		else 
			System.out.println("5가 더 작다3");
		if(5>3) {
			System.out.println("true");
			System.out.println("5가 크다. ");
		}
		else {
			System.out.println("false");
			System.out.println("5가 작다.");
		}
		
		
		if (5>10)
			System.out.println("5가 크다1");
		else if (5>8) 
			System.out.println("5가 크다2");
		else if (5>6)
			System.out.println("5가 크다3");
		else if (5>4)
			System.out.println("5가 크다4");
		else 
			System.out.println("5보다 작은 데이터가 없다 ");
		
		// 문제1: 하나의 정수를 입력받아 80점 이상이면 합격 아니면 불합격 출력 
		Scanner sc = new Scanner(System.in);
//		int a;
//		System.out.print("하나의 정수를 입력해주세요 :");
//		a = sc.nextInt();
//		if (a>80) {
//			System.out.println("합격입니다.");
//		}
//		else 
//			System.out.println("불합격입니다.");
		// 문제2: 하나의 점수를 입력받아 90점 이상이면 A 80점이상이면 B 그외 탈락 
//		int b;
//		System.out.print("하나의 정수를 입력해주세요 :");
//		b = sc.nextInt();
//		if ( b>=90)
//			System.out.println("A입니다.");
//		else if(b>=80&&b<90)
//			System.out.println("B입니다");
//		else 
//			System.out.println("탈락입니다.");
		// 문제3: 하나의 점수와 성별을 입력받아
			// 남자이면서 90점 이상이면 A-1 클래스 출력 
			// 여자이면서 90점 이상이면 A-2 클레스 출력 
				// 남자이면서 80점 이상이면 B-1 클래스 출력
				// 여자이면서 80점 이상이면 B-2 클래스 출력 
				// 그 외 C 클래스
		//문제 3번 풀이 
//		int a;
//		String name;
//		System.out.print("점수를 입력하세요");
//		a = sc.nextInt();
//		System.out.print("성별을 입력하세요");
//		name = sc.next();
//		if (name.equals("남자")&& a>=90)
//			System.out.println("A-1클래스 입니다.");
//		else if (name.equals("여자")&& a>=90)
//			System.out.println("A-2클래스 입니다.");
//		else if (name.equals("남자")&& a>=80 && a<90 )
//			System.out.println("B-1클래스 입니다.");
//		else if (name.equals("여자")&& a>=80 && a<90)
//			System.out.println("B-2클래스 입니다.");
//		else 
//			System.out.println("C클래스 입니다.");
		
		//문제4번 : 2개의 정수를 입력받아 가장 큰 수 출력 
		//풀이
//		int a ,b;
//		System.out.print("두개의 정수를 입력해주세요:");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		if (a>b)
//			System.out.println(a+" 가 더 큽니다.");
//		else if (b>a)
//			System.out.println(b + "가 더 큽니다");
		
		//문제5번 : 3개의 정수를 입력받아 가장 큰수 출력 < 변수가 많아질수록 max를 만들어서 효율적으로 푸는게 더 좋다. >
		//풀이 
//		int a,b,c;
//		int max=0;
//		System.out.print("3개의 정수를 입력해주세요:");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		if (max < a) {
//			max = a;
//		}
//		if (max < b) {
//			max = b;
//		}
//		if (max < c) {
//			max = c;
//		}
//		System.out.println(max);
		//문제 6번: 4개 정수를 입력받아 가장 큰수 출력 
		//임의로 첫번째 변수를 max에 대입.
		// ififif 하고 if else if else if 의 차이점을 알아야한다. 전자는 tf와 상관없이 두번째 세번째 if 안에 있는 문장도 실행되지만 후자는 
		//조건에 맞는하나가 실행되면 그 뒤는 실행되지 않는다. 
		//풀이
//		int a,b,c,d;
//		int max = a
//		System.out.print("4개의 정수를 입력해주세요:");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		d = sc.nextInt();
//		if (max < b) {
//			max = b;
//		}
//		if (max < c) {
//			max = c;
//		}
//		if (max <d) {
//			max = d;
//		}
//		System.out.println(max);
		
		//문제7: 3개 정수를 입력받아 오름차순 정렬후 출력 
//		int a,b,c;
//		int temp;// 교체용 임시 변수 
//		int max = 0;
//		System.out.print("3개의 정수를 입력해주세요:");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		
//		System.out.printf("정렬 전 :%d %d %d", a,b,c);
//		if(a > b) {
//			temp = a;
//			a = b;
//			b = temp;
//		}
//		if(a > c) {
//			temp = a;
//			a = c;
//			c = temp;
//		}
//		if( b>c) {
//			temp = b;
//			b = c;
//			c = temp;
//		}
//		System.out.printf("정렬 후 : %d %d %d ",a,b,c);
		
		
		// 문제8: 3개의 정수를 입력받아 내림차순 정렬 후 출력  오름차순과 내림차순은 부등호를 반대로 하면 된다 (비교대상과 크기를 비교하여 교체 하는 것이 중요)
		// swap 하는 방법 
		// 풀이 
//		int a,b,c;
//		int temp;// 교체용 임시 변수 
//		int max = 0;
//		System.out.print("3개의 정수를 입력해주세요:");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		
//		System.out.printf("정렬 전 :%d %d %d", a,b,c);
//		if(a < b) {
//			temp = a;
//			a = b;
//			b = temp;
//		}
//		if(a < c) {
//			temp = a;
//			a = c;
//			c = temp;
//		}
//		if( b<c) {
//			temp = b;
//			b = c;
//			c = temp;
//		}
//		System.out.printf("정렬 후 : %d %d %d ",a,b,c);
//		
		
		
		
	}
}
