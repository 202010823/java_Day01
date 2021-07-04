package Day06;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Day06_1 {
	
	
	// 변수 : 메모리 할당 
	// 배열 : 동일한 자료형의 변수 여러개 선언/관리
		//자료형 배열명 = new 자료형[개수]
			// new : 메모리 할당 연산자 
		// [인덱스] : 배열에 저장되는 순서 번호 
		// 다양한 메소드 [미리 작성된 코드] ==> Arrays 클래스 사용 
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 학생수를 입력받아 학생수만큼 배열의 메모리할당
		
		Integer[] 학생점수 = null; // 현재 메모리가 null인 배열 선언
			// int 	   : 정수 자료형  [ new x ] => 변수 
			// Integer : 정수 클래스  [ new o ] => 객체 
		while(true)  {  // 무한 루프 
		
			System.out.println("----학생 관리 프로그램 ----");
			System.out.println("1. 학생수 2. 점수 입력 3.통계 4. 종료 ");
			int 선택 = sc.nextInt();
			if(선택 == 1 ) {
				System.out.print("---> 학생수 : ");
				int 인원수 = sc.nextInt();
				학생점수 = new Integer[인원수];
				System.out.println(인원수 + "만큼 학생점수를 입력할수 있습니다.");
			}
			else if(선택 == 2 ) {
				for(int i = 0;i<학생점수.length;i++) {
					System.out.println((i+1)+"번째의 학생점수 입력 : ");
					학생점수[i]= sc.nextInt();
				}
			}
			else if(선택 == 3 ) {
				// 정렬 = sort() => 테스트를 준비하면 만들줄도 알아야한다.
				Arrays.sort(학생점수); // 오름차순
				//출력 
				System.out.println("------- 오름차순 ---------");
				for(int i = 0;i<학생점수.length;i++) {
					System.out.println((i+1)+"번째 학생의 점수 " +학생점수[i]);
				}
				
				// 내림차순 => 오름차순 반대로 [ 기본 자료형
				Arrays.sort(학생점수,Collections.reverseOrder() );
				System.out.println("------- 내림차순 ---------");
				for(int i = 0;i<학생점수.length;i++) {
					System.out.println((i+1)+"번째 학생의 점수 " +학생점수[i]);
				}
				
				// 가장 높은 점수 출력 
//				int max = 0;
//				for(int i=0;i< 학생점수.length;i++) {
//					if(max < 학생점수[i]) max = 학생점수[i];
//				}
				// 평균
				int high;
				int 총합=0;
				double 평균;
				System.out.println("가장 높은 점수 : "+ 학생점수[0]);
				for( int i =0;i<학생점수.length;i++) {
					총합 += 학생점수[i];
				}
				평균 = 총합 / 학생점수.length ;
				System.out.println("평균은 : " + 평균);
						// 컬렉션 : 배열 , 리스트 
			}
			if(선택 == 4 ) {}
			else {}
}
		
		
	} // main end
}
