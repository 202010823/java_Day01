package Day08;

public class 국민은행 extends 계좌{

	public final int 은행코드 = 20;
	
	public 국민은행() {
		super();
	}

	public 국민은행(String 계좌번호, int 비밀번호, String 계좌주, int 금액) {
		super(계좌번호, 비밀번호, 계좌주, 금액);
	}

	
}
