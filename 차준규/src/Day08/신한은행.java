package Day08;
import Day07.Member;

public class �������� extends ����{

	public final int �����ڵ� = 10;

	public ��������() {
		super();
	}

	public ��������(String ���¹�ȣ,int ��й�ȣ, String ������, int �ݾ�) {
		super(���¹�ȣ, ��й�ȣ, ������, �ݾ�);
	}
	
	public ��������(String ���¹�ȣ, int ��й�ȣ, String ������) {
		super(���¹�ȣ, ��й�ȣ, ������);
	}

	@Override
	public void ���µ��() {
		System.out.println("[ �������� ]");
		
		System.out.println("[[[ ���� ��� ȭ�� ]]]");
		System.out.print("[[ ���¹�ȣ : ");
		String ���¹�ȣ = Day08_ATM.sc.next();
		for(���� temp : Day08_ATM.���¸��) {
			if(���¹�ȣ.equals(temp.get���¹�ȣ())){
				System.err.println("�̹� ��ϵ� ���� ��ȣ�Դϴ�.");
				return;
			}
		}
		System.out.print("[[ ��й�ȣ : ");
		int ��й�ȣ = Day08_ATM.sc.nextInt();
		//���� : 4�ڸ� ��   java���� ���ڿ��� �ٷ�� �ִ� �Լ��� ���� ������ ���ڸ� ���ڷ� �ٲ㼭 �������� 
		String s��й�ȣ = Integer.toString(��й�ȣ);
		// Integer.tostring(����);   =>  ���ڿ��� ���ڿ��� �ٲٴ� ��� 
		if(s��й�ȣ.length() != 4) {
			
			System.err.println("[����] ��й�ȣ�� �ݵ�� 4���ڿ��� �մϴ�");
			return;
		}
					//���ڿ�.length :������ ���� [���ڼ�]
		
		System.out.print("[[ ������ : ");
		String ������ = Day08_ATM.sc.next();

		�������� temp = new ��������(���¹�ȣ,��й�ȣ,������);
		Day08_ATM.���¸��.add(temp);
		System.out.println(" �������� ���°� �����Ǿ����ϴ�. ");
		
	}

	@Override
	public void �Ա�() {
		System.out.println("�������� �Ա�ȭ��");
		super.�Ա�();
	}

	@Override
	public void ���() {
		System.out.println("�������� ���ȭ�� ");
		super.���();
	}

	@Override
	public void ��ü() {
		System.out.println("�������� ��üȭ�� :");
		super.��ü();
	}	
	
	
	
	
	
}
