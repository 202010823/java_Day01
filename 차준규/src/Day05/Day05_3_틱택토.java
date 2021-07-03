package Day05;

import java.util.Random;
import java.util.Scanner;

public class Day05_3_틱택토 {
	
	public static void main(String[] args) {
		// 판 생성 
		Scanner sc = new Scanner(System.in);
		String[] 게임판 = {"[ ]","[ ]","[ ]",
							"[ ]","[ ]","[ ]",
								"[ ]","[ ]","[ ]"};
		
		String 승리자 = " "; // 승리 알을 저장하기 위한 변수
		//게임판 출력
		while(true) { //게임 전체 무한루프 [ 모든알을 두었을때 , 승리자가 나올경우 종료 ]
			for(int i=0;i<게임판.length;i++) {
				// 3개씩 출력후에 줄바꿈
				System.out.print(게임판[i]);
				if(i%3 == 2 ) System.out.println();
			}
			//종료
			if(승리자.equals("[O]")) {
				System.out.println("게임 종료 : 플레이어 승리 ");
				break;
			}
			if(승리자.equals("[X]")) {
				System.out.println("게임 종료 : 컴퓨터 승리 ");
				break;
			}
			// 모든 알 두었을때 => 알이 9개이면
		
		
		// 플레이어에 입력받아 해당 위치에 알 두기 
			while(true) {
				System.out.print("[선택] 두고자하는 위치 :");
				int 플레이어 = sc.nextInt(); //인덱스 
					if(플레이어>8 || 플레이어<0) {
						System.out.println("[0~8]사이의 값을 입력해주세요.:");		
					}
					else if(!게임판[플레이어].equals("[ ]")) {
						System.out.println("[경고!] 이미 알이 존재하는 위치입니다.");
					}
					else {
						게임판[플레이어] = "[O]"; // 입력받은 인덱스에 알 바꾸기 
						break; // 가장 가까운 반복문 탈출
					}
			}// while2 end
			
			int 현재알수 =0;
			for(int i=0;i<9;i++) {
				if(!게임판[i].equals("[ ]")) {
					현재알수++;
				}
			}
			if(현재알수==9) {
				while(true) { //게임 전체 무한루프 [ 모든알을 두었을때 , 승리자가 나올경우 종료 ]
					for(int i=0;i<게임판.length;i++) {
						// 3개씩 출력후에 줄바꿈
						System.out.print(게임판[i]);
						if(i%3 == 2 ) System.out.println();
					}
					System.out.println("무승부");
					break;
			}
				
				
			while(true) {	
				// 컴퓨터 [ 난수 생성해서 알 두기 ]
				// 난수 생성 = Random
				Random random = new Random(); // 랜덤 객체 생성 
				int 컴퓨터 = random.nextInt(9); // 객체에서 정수 난수 가져오기 
					// random.nextInt(); : 0~20억 까지의 난수 생성 
					// random.nextInt(10); : 0~9 까지의 난수 생성 => 넣은 수의 -1 까지 생성 
					// random.nextInt(10)+10; 10~19까지 난수 생성 ==> 시작 번호 바꾸는 법   
				if(게임판[컴퓨터].equals("[ ]")) {
					게임판[컴퓨터] = "[X]";
					break;
				}
			}
			// 승패 
			
				// 가로로 이기는 수 [0 1 2, 3 4 5 , 6 7 8]
				for(int i=0;i<=6;i+=3) {
					//i=>0, 3, 6
					if(게임판[i].equals(게임판[i+1])&&게임판[i+1].equals(게임판[i+2])) {
						if( !게임판[i].equals("[ ]")) 승리자 = 게임판[i];
					}
				}
		
			
				// 세로로 이기는 수 [0 3 6, 1 4 7 , 2 5 8]
				for (int i=0;i<3;i++) {
					if(게임판[i].equals(게임판[i+3])&&게임판[i+3].equals(게임판[i+6])) {
						if( !게임판[i].equals("[ ]")) 승리자 = 게임판[i];
					}
				}
				// 대각선으로 이기는 수 [0 4 8, 2 4 6 ]
				
				if(게임판[0].equals(게임판[4])&&게임판[4].equals(게임판[8])) {
					if( !게임판[0].equals("[ ]")) 승리자 = 게임판[0];
				}
				if(게임판[2].equals(게임판[4])&&게임판[4].equals(게임판[6])) {
					if( !게임판[2].equals("[ ]")) 승리자 = 게임판[2];
				}
				
		 
					
			
		}//while1 end 
	} 
}
}
