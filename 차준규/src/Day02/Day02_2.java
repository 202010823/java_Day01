package Day02;

public class Day02_2 {
	public static void main(String[] args) {
		
		//변수 
			// 1. 변하는 수 <---> 상수 : 고정된 수 
			// 2. 메모리 : 자원  [ 데이터 저장소 ]
				//변수 형태 : 
					//사람 : 문자	int 변수명; 
					//컴퓨터: 숫자	메모리크기 주소값;
			//3. 자료형 : 미리 정의된 메모리 크기 [ 메모리 효율적 => 속도 빠름 ]
				//1 비트 : 0,1
				// 1 byte: 8비트 => 0혹은1 이 8자리 
				// 1kb => 1024 byte 	// 1024kb => mb => gb 
				// boolean : 1비트 [0 [false] ,1 [true] ]
				//char : 2byte [ 아스키코드 ???? ]
					//문자열 => String 클래스 
				// byte : 1byte :정수 [+- 12정도]
				//short : 2byte :정수 [+- 3만 정도]
				// int : 4byte :정수  [+-20억정도]
				//long :8 byte :실수 [+- 20억 이상 정도]
				//float: 4byte :실수
				//double : byte :실수
		
		// 예제1
			// 1. 변수선언
				// 자료형 변수명;	//쓰레기값[임의의값]
				//자료형 변수명 = 값 ;
		
		boolean 논리변수 = true; // true 혹은 false 저장할수 있는 저장소 
		System.out.println("boolean 변수: : " + 논리변수); //변수 출력 
		
		char 문자변수 = 'a';
		System.out.println("char 변수 : " + 문자변수);
			//char 기본값 : 아스키 코드 [문자 <--> 기계어 번역표라고 생각하자] (char은 문자로만 표현)
		char 문자변수2 = 98;
		System.out.println(" char 변수 : "+ 문자변수2);
		
		byte 바이트변수 =100;
		System.out.println("바이트변수 : " + 바이트변수 );
		byte 바이트변수2 = 'a';
		System.out.println("byte변수 : "+ 바이트변수2); //바이트는 정수형이기 때문에 정수로만 표현
		
		short 쇼트변수 = 300;
		System.out.println("short 변수 :" + 쇼트변수);
		short 쇼트변수2 = 'a';
		System.out.println( "short 변수"+ 쇼트변수2);
		
		int 인트변수 = 3000;
		System.out.println("int 변수 : "+ 인트변수);
		int 인트변수2 = 'a';
		System.out.println("int 변수 : " + 인트변수2);
			// 정수의 기본 자료형은 : int 
		System.out.println( 100 ); // 이렇게 입력하면 자동으로 int 로 인식 
		long 롱변수 =9999999999999L; 
		System.out.println("long 변수 :" + 롱변수); //롱변수를 실행시키기 위해서는 L을 붙여줘야한다.
		
		
		float 실수변수 =10.51111111f;
		System.out.println("float 변수 :" + 실수변수 ); //f를 붙여줘야 실행된다.
		
		double 실수변수2 = 10.5111111111111111111111111;
		System.out.println("double 변수 : +" + 실수변수2); 
			//실수의 기본 자료형 : double 
		String 문자열객체="안녕하세요";
		System.out.println("String 객체: " + 문자열객체);
		
		
		
		
		
		

	}
}
