package Day04;

public class Day04_1 {
	
	// 제어문 = if 
	
	// 반복문 = for , while(무한루프만들때 자주사용) , do~while
		
		// 어디서부터 어디까지 반복 
	// for 형태 
		// for( 초기값; 조건문; 증감식){실행문; }
		// for( 어디서부터 ; 어디까지; 이동단위){실행문};
			// 초기값 : 반복의 시작값 [for 시작할때 1번 검사]
			// 조건문: 반복 실행의 조건[ 바교연산자 , 실행코드 실행전 검사 ]
			// 증감식 : 실행코드 실행후 초기값 증감
	// 예1 
	public static void main(String[] args) {
		
	
		for(int 변수 = 0; 변수<10 ; 변수++) {
			// 변수는 0부터 10 미만까지 1 씩 증가하면서 반복 
			System.out.print(변수+"\t");
				// 반복문 실행순서
				// 변수 = 0 => 변수<10 => T =>  코드 실행 
				// 변수 ++ => 변수 = 1 => 변수<10 => T => 코드 실행 
				// 계속 해서 실행되다가~~~~~~~~~~~~~
				// 변수++ => 변수=10 => 변수 < 10 => F => 반복문 종료 
		
		}
		System.out.println("\n");
		// 예2 : 1~50 까지의 출력 
		for(int i = 1 ; i <=50;i++) {
			System.out.print(i);
		}
		System.out.println();
		// 예3: 1~50까지의 3배수 출력
		for (int i = 3; i< 50 ; i+=3) {
			System.out.print(i);
		}
		System.out.println();
		for(int i = 1; i< 50; i++) {
			if (i%3 == 0) {
				System.out.print(i);
			}
		}
		System.out.println();
		
		// 예4 : 1~50 까지의 누적 합계 
		int sum = 0;
		for (int i = 0 ; i<=50; i++) {
			sum += i;
		}
		System.out.println("1부터 50 까지의 누적 합계: "+sum);
		
		// 예5 : 1~50 까지의 3배수들의 누적합계 
		int sum2=0;
		for(int i = 0;i<50;i++) {
			if (i%3 == 0) {
				sum2 += i;
			}
		}
		System.out.println("3의 배수들의 누적 합계(1~50) : "+sum2);
		
		
	}
}
