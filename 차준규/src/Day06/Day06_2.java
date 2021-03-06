package Day06;

import java.util.Scanner;

public class Day06_2 { // 회원제 프로그램 
	public static void main(String[] args) {
		// 1. 최대 100명의 회원을 저장하는 배열 생성 [ 2차원 배열 ] 
				// 1. 아이디, 비밀번호 
		// 2. 무한루프 [ 메뉴 ]
				// 1. 회원가입 
		 		// 2. 로그인
				// 3. 종료 
		// 3. 무한루프 [ 로그인 시 ]
				// 1. 회원탈퇴 , 패스워드 변경 , 로그아웃 [초기 메뉴로]
		
		//입력객체 
		Scanner sc = new Scanner(System.in);
		// 회원100명의 아이디와 비밀번호 
		String[][] 회원목록 = new String[100][2];
									// [ 행 : 회원수] [열 : 아이디, 비밀번호 ]
		
		// 초기메뉴 = > 무한루프
		while(true) {
			System.out.println("----------회원제 프로그램-----------");
			System.out.println("1. 회원가입 2. 로그인 3. 종료 ");
			int 선택 = sc .nextInt();
			
			if (선택 == 1 ) { // 회원가입 : 아이디 , 비밀번호 입력받아 배열에 저장 
				System.out.println("----> 회원가입 화면 ------>");
				System.out.print("-> 아이디 : "); 
				String 아이디 = sc.next();
					// 아이디 중복체크 
					int 중복체크 = 0 ;
					for(int i = 0 ;i<회원목록.length;i++) {
						if(회원목록[i][0]!=null && 회원목록[i][0].equals(아이디)) { //null이면 비교할 값이 없어서 오류가 나기때문에 조건 하나 추가 
							System.err.println("\n[실패] 중복된 아이디가 있습니다");
							중복체크 = 1; // 중복이 있는경우 1
							break;
						}
					}
				if(중복체크 == 0) { // 중복이 없는 경우 0 => 회원가입 성공 
					System.out.print("-> 비밀번호 :"); 
					String 비밀번호 = sc.next();
					// 입력받은 값을 배열에 저장 
					for(int i = 0; i<회원목록.length;i++) {
						// i는 0부터 최대 회원수만큼 1 씩 증가 반복 
						if(회원목록[i][0]==null) { // i 번째 행의 아이디가 null 이면 
							회원목록[i][0]= 아이디; // id저장
							회원목록[i][1]= 비밀번호; // 비밀번호 저장 
							System.err.println("회원가입이 완료되었습니다.");
							break; // 저장후 반복문 끝내기 
	
						}
					}
				}
			}
			else if(선택 == 2) {
				System.out.println("----> 로그인 화면 ------>");
				System.out.print("-> 아이디 : "); 
				String 아이디 = sc.next();
				System.out.print("-> 비밀번호 :"); 
				String 비밀번호 = sc.next();
				
				int 로그인여부 =0;
				for(int i =0;i<회원목록.length;i++) {
					
					if(회원목록[i][0]!=null&&회원목록[i][0].equals(아이디)&&회원목록[i][1].equals(비밀번호)) {
						System.err.println("[로그인 성공] 로그인 되었습니다.");
						로그인여부 = 1;
						while (true) {
							System.out.println("-------회원목록-------");
							System.out.println("\t아이디 \t비밀번호  ");
								for(int j =0;i<회원목록.length;j++) {
									if(회원목록[j][0]!=null) {
										System.out.println("\t"+ 회원목록[j][0]+"\t"+회원목록[j][1]);
									}
								}
							System.out.println("1.회원탈퇴 2.패스워드 변경 3.로그아웃"); 
							int 선택2 = sc.nextInt();
							if(선택2 == 1) { // 기존회원을 null로 변경 [탈퇴된 회원 기준으로 뒤회원들 한칸씩 당기기]
									// i는 현재 로그인된 회원의 인덱스 번호 
								회원목록[i][0] = null;
								회원목록[i][1] = null;
								
									//탈퇴한 회원 기준으로 뒤에있는 회원들은 한칸씩 당기기 
								for(int h = i;h<회원목록.length;h++) {
									
									if(회원목록[h+1][0] !=null ) {
										회원목록[h][0] = 회원목록[h+1][0]; // 한칸씩 당기기 
										회원목록[h][1] = 회원목록[h+1][1];
										
									}else {
										회원목록[h][0] = null;
										회원목록[h][1] = null;
										break;
									}
								}
								System.out.println("회원탈퇴 되었습니다.");
								break;						
							}
							else if(선택2 == 2) {
								System.out.print("------> 패스워드 변경 화면 -----> :"); 
								System.out.println("새로운 비밀번호 : ");
								회원목록[i][1] = sc.next();
								System.out.println("[패스워드 변경완료] ");
								break;
							}
							else if(선택2 == 3) {
								System.err.println("[로그아웃] 로그아웃 되었습니다");
								break;
							}
						}
					}
				}
			}
			else if(선택 ==3) {
				System.err.println("[종료] 이용해주셔서 감사합니다.");
				break; // 가장 가까운 반복문 혹은 switch 탈출 
				}

		}
		
	}
}
