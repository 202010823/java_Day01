package Day05;

public class Day05_1 {
	public static void main(String[] args) {
		// 제어문 : if[논리제어(t/f)가 가능하다] switch [ 데이터 검사 ]
			// if : 경우의수가 정해져있지 않은 경우 
				// true 이면 실행문 처리후 모든 if 종료 
			// switch : 경우의수가 정해져 있는 경우 => 속도 빠름 
				// case 검사 후 아래 모든 case 처리 => break; [ 반복문 혹은 switch 탈출 ]
		
		if(5>3)System.out.println("5가크다");
		else System.out.println("5가 작다");
		
		switch(5) {
			case 5 : System.out.println("5입니다");
			case 3 : System.out.println("3입니다");
		}
	////////////////////////////////////////////////////////////////////////
		int 번호 = 3;
		if (번호 == 1) System.out.println("1입니다");
		else if (번호 ==2) System.out.println("2입니다");
		else if(번호 ==3) System.out.println("3입니다.");
		
		switch(번호) {
			case 1 : System.out.println("1입니다");
			case 2 : System.out.println("2입니다");
			case 3 : System.out.println("3입니다");
		}
	////////////////////////////////////////////////////////////////////////
		int 점수 = 80;
		
		switch( 점수 ) {
			case 90 : System.out.println("A등급"); break;
			case 80 : System.out.println("B등급"); break; 
			case 70 : System.out.println("C등급"); break;
			default : System.out.println("탈락");// 그 외 
		}
		
		int 점수1 = 80; int 점수2 = 90; int 점수3 = 100;
			// 세 점수의 평균을 계산 후 
				// 90 점 이상이면 A등급 80점 이상이면 B등급 70점 이상이면 C등급 그 외 탈락
		int 평균 = (점수1+점수2+점수3)/30;
		switch (평균) {
			case 10 : 
			case 9 : System.out.println("A등급"); break;
			case 8 : System.out.println("B등급"); break;
			case 7 : System.out.println("C등급"); break;
			default : System.out.println("탈락"); break;
		}
		
		
		// 반복문 : for , while 
			//for : 코드 간결성 
		for(int i = 0 ;  i< 10;i++) {
			// 초기값 ; 조건문 ; 증감식
			System.out.print(i + "\t");
		}
			// while :무한루프 => while(true) {}
		int i =  0;// 초기값
		while(i<10) { // 조건문
			System.out.print(i + "\t");
			i++; // 증감식
		}	
////////////////////////////////////////////////////////////////////////
		System.out.println();
		int j = 0;
		while(true) {// while 조건문}
			System.out.println("무한반복"+ j);
			if( j == 10) break;
			j++;
		}
		
		
		
	}
}
