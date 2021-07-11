package Day08;

import java.util.ArrayList;
import java.util.Scanner;

public class Day08_ATM {  
	
	public static Scanner sc = new Scanner(System.in);
	
	public static ArrayList<계좌> 계좌목록 = new ArrayList<>(); 
	
	public static void main(String[] args) {
		start();
	}
	
	public static void start() {
		
		while(true) {
			System.out.println("[[[ ATM ]]]");
			System.out.println("[[ 1.계좌생성 2.입금 3.출금 4.이체 5.계좌찾기 6.종료 ");
			int 선택 = sc.nextInt();
			if(선택 == 1) {
				
				System.out.println("[[1.신한은행 2.국민은행]]");
				int 선택2 = sc.nextInt();
				if(선택2 == 1) {
					신한은행 신한은행 = new 신한은행();
					신한은행.계좌등록();
				}
			}
			else if(선택 == 2) {
				System.out.println("[[1.신한은행 2.국민은행]]");
				int 선택2 = sc.nextInt();
				if(선택2 == 1) {
					계좌 신한은행 = new 신한은행();
					신한은행.입금();
			 }
			}
			else if(선택 == 3) {
				System.out.println("[[1.신한은행 2.국민은행]]");
				int 선택2 = sc.nextInt();
				if(선택2 == 1) {
					계좌 신한은행 = new 신한은행();
					신한은행.출금();
			 }
			}
			else if (선택 == 4) {
				
			}
			else if (선택 == 5 ) {
				
			}
			else if(선택 == 6) {
				System.err.println("[종료]");
				break;
			}
			else {
				System.err.println("[경고] : 알수 없는 번호 입니다");
			}
					
			
		}
	}
	
	
	
}

