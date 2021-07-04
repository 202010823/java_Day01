package Day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Day06_4_게시판 {
	// 게시판 프로그램 
	static Scanner sc = new Scanner(System.in);
	//main 밖에 선언하는 이유 : 다른 클래스에서 해당 메모리[변수/객체] 접근하기 위해
		//단점 : main 실행되기 때문에 main메소드가 해당 메모리 인식 x 
			// static : main 메소드 보다 메모리 우선할당 
				// 프로그램 종료시까지 메모리 할당 
				// 전반적인 모든 코드에 사용되는 메모리 할당시 
	// 리스트 
	static ArrayList<게시물> 게시물목록 = new ArrayList<>();
		// ArrayList<리스트에 담을 클래스> 객체명 = new ArrayList<>();
			// < > : 제네릭
	public static void main(String[] args) {
	
		
		while(true) {
			게시물.게시물출력();
			System.out.println("1.글쓰기 2.게시물보기 3.게시물삭제");
			int 선택 = sc.nextInt();
			if(선택 == 1) {
				게시물.게시물등록();
			}
			if(선택 == 2) {
				System.out.println("게시물번호 선택 : ");
				int 번호 = sc.nextInt();
				게시물.게시물상세보기(번호);
			}
			if(선택 == 3) {}
		}
	}
}

