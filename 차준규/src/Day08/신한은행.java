package Day08;
import Day07.Member;

public class 신한은행 extends 계좌{

	public final int 은행코드 = 10;

	public 신한은행() {
		super();
	}

	public 신한은행(String 계좌번호,int 비밀번호, String 계좌주, int 금액) {
		super(계좌번호, 비밀번호, 계좌주, 금액);
	}
	
	public 신한은행(String 계좌번호, int 비밀번호, String 계좌주) {
		super(계좌번호, 비밀번호, 계좌주);
	}

	@Override
	public void 계좌등록() {
		System.out.println("[ 신한은행 ]");
		
		System.out.println("[[[ 계좌 등록 화면 ]]]");
		System.out.print("[[ 계좌번호 : ");
		String 계좌번호 = Day08_ATM.sc.next();
		for(계좌 temp : Day08_ATM.계좌목록) {
			if(계좌번호.equals(temp.get계좌번호())){
				System.err.println("이미 등록된 계좌 번호입니다.");
				return;
			}
		}
		System.out.print("[[ 비밀번호 : ");
		int 비밀번호 = Day08_ATM.sc.nextInt();
		//제어 : 4자리 수   java에는 문자열을 다룰수 있는 함수가 많기 때문에 숫자를 문자로 바꿔서 생각하자 
		String s비밀번호 = Integer.toString(비밀번호);
		// Integer.tostring(숫자);   =>  숫자열을 문자열로 바꾸는 기능 
		if(s비밀번호.length() != 4) {
			
			System.err.println("[실패] 비밀번호는 반드시 4글자여야 합니다");
			return;
		}
					//문자열.length :문지열 길이 [글자수]
		
		System.out.print("[[ 계좌주 : ");
		String 계좌주 = Day08_ATM.sc.next();

		신한은행 temp = new 신한은행(계좌번호,비밀번호,계좌주);
		Day08_ATM.계좌목록.add(temp);
		System.out.println(" 신한은행 계좌가 생성되었습니다. ");
		
	}

	@Override
	public void 입금() {
		System.out.println("신한은행 입금화면");
		super.입금();
	}

	@Override
	public void 출금() {
		System.out.println("신한은행 출금화면 ");
		super.출금();
	}

	@Override
	public void 이체() {
		System.out.println("신한은행 이체화면 :");
		super.이체();
	}	
	
	
	
	
	
}
