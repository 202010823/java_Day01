package Day06;

import java.util.Scanner;

public class Day06_2_2 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int[][] 회원 =  new int [2][100];
	int 메뉴선택;
	System.out.print("1. 회원가입 2. 로그인 3. 종료 ");
	메뉴선택 = sc.nextInt();
	while(true) {
		if (메뉴선택 == 1) {
			System.out.println("회원가입을 선택 하셨습니다");
			System.out.print("아이디를 입력하세요 : ");
			while(true) {
				
			}
			
		}
		else if(메뉴선택 == 2) {
			
		}
		else if (메뉴선택 == 3) {
			
		}
		else {
			System.out.print("번호를 잘못 입력하셨습니다. 다시 입력해주세요:");
		}
	}
	}
}
