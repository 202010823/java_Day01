package Day08;

public class 계좌 {
	private String 계좌번호;
	private int 비밀번호;
	private String 계좌주;
	private int 금액;
	
	// 생성자 
	public 계좌() {}
	
	public 계좌(String 계좌번호, int 비밀번호, String 계좌주, int 금액) {
		this.계좌번호 = 계좌번호;
		this.비밀번호 = 비밀번호;
		this.계좌주 = 계좌주;
		this.금액 = 금액;
	}
	
	public 계좌(String 계좌번호, int 비밀번호, String 계좌주) {
		this.계좌번호 = 계좌번호;
		this.비밀번호 = 비밀번호;
		this.계좌주 = 계좌주;
		this.금액 = 0;
	}
	
	
	// 메소드 
	
	
	public String get계좌번호() {
		return this.계좌번호;
	}
	
	public int get비밀번호() {
		return this.비밀번호;
	}
	
	public void 입금처리(int 입금액) {
		this.금액 += 입금액;
		System.err.println("입금처리가 완료되었습니다.");
		System.out.println("입금 이후 금액: "+this.금액);
	}
	
	public void 출금처리(int 출금액) {
		this.금액 -= 출금액;
		if(this.금액<출금액) {
			System.err.println("예금액이 부족합니다 ");
			return;
		}
		System.out.println("출금 이후 금액" + this.금액);
		System.err.println("출금처리가 완료되었습니다.");
	}
	
	
	
	
	// 1. 계좌 등록 메소드 
	
	public void 계좌등록() {
		System.out.println("[[[ 계좌 등록 화면 ]]]");
		System.out.print("[[ 계좌번호 : "); // 제어: 중복제거 
		String 계좌번호 = Day08_ATM.sc.next();
		System.out.print("[[ 비밀번호 : "); // 제어: 4글자 숫자
		int 비밀번호 = Day08_ATM.sc.nextInt();
		System.out.print("[[ 계좌주 : "); 
		String 계좌주 = Day08_ATM.sc.next();
		
		
		// 객체 생성
		계좌 계좌 = new 계좌(계좌번호,비밀번호,계좌주);
		
		Day08_ATM.계좌목록.add(계좌);
		
	}
	
	// 2. 입금 메소드
	
	public void 입금() {
		System.out.println("[[[ 입금 등록 화면 ]]]");
		System.out.print("[[ 계좌번호 : "); // 제어: 중복제거 
		String 계좌번호 = Day08_ATM.sc.next();
		System.out.print("[[ 비밀번호 : "); // 제어: 4글자 숫자
		int 비밀번호 = Day08_ATM.sc.nextInt();
		System.out.print("[[ 입금액 : "); 
		int 입금액 = Day08_ATM.sc.nextInt();
		
		for(계좌 temp:Day08_ATM.계좌목록 ) {
			if(temp.get계좌번호().equals(계좌번호) && temp.get비밀번호() == 비밀번호){	
				temp.입금처리(입금액);
				return;
			}
		}
		System.err.println("[실패] 동일한 계좌번호 혹은 비밀번호가 다릅니다");
	}
	
	public void 출금() {
		System.out.println("[[[ 출금 등록 화면 ]]]");
		System.out.print("[[ 계좌번호 : "); // 제어: 중복제거 
		String 계좌번호 = Day08_ATM.sc.next();
		System.out.print("[[ 비밀번호 : "); // 제어: 4글자 숫자
		int 비밀번호 = Day08_ATM.sc.nextInt();
		System.out.print("[[ 출금액 : "); 
		int 출금액 = Day08_ATM.sc.nextInt();
		
		for(계좌 temp:Day08_ATM.계좌목록 ) {
			if(temp.get계좌번호().equals(계좌번호) && temp.get비밀번호() == 비밀번호){	
				temp.출금처리(출금액);
				return;
			}
		}
		System.err.println("[실패] 동일한 계좌번호 혹은 비밀번호가 다릅니다");
	}
	
	// 4. 이체 메소드
	public void 이체() {
		System.out.println("[[[이체 화면 ]]]");
		System.out.print("[[ 계좌번호 : "); // 제어: 중복제거 
		String 계좌번호 = Day08_ATM.sc.next();
		
		
		System.out.print("[[ 비밀번호 : "); // 제어: 4글자 숫자
		int 비밀번호 = Day08_ATM.sc.nextInt();
		
		
	for(계좌 temp:Day08_ATM.계좌목록 ) {
		if(temp.get계좌번호().equals(계좌번호) && temp.get비밀번호() == 비밀번호) {
		System.out.print("[[ 이체 금액 : "); 
		int 이체금액 = Day08_ATM.sc.nextInt();
		if(temp.금액<이체금액) {
			System.err.println("[실패] 예금액이 부족합니다.");
			return;
		}
		System.out.print("받는 사람 계좌번호 : ");
		String 계좌번호2 = Day08_ATM.sc.next();
		
		for(계좌 temp2:Day08_ATM.계좌목록) {
			if(temp2.계좌번호.equals(계좌번호2)) {
				
				temp2.금액 += 이체금액;
				System.err.println("이체가 완료 되었습니다.");
			}
		}
		}
	}
	}
	
	public void 계좌찾기() {
		
	}
	
	
}
