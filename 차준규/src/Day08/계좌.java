package Day08;

public class ���� {
	private String ���¹�ȣ;
	private int ��й�ȣ;
	private String ������;
	private int �ݾ�;
	
	// ������ 
	public ����() {}
	
	public ����(String ���¹�ȣ, int ��й�ȣ, String ������, int �ݾ�) {
		this.���¹�ȣ = ���¹�ȣ;
		this.��й�ȣ = ��й�ȣ;
		this.������ = ������;
		this.�ݾ� = �ݾ�;
	}
	
	public ����(String ���¹�ȣ, int ��й�ȣ, String ������) {
		this.���¹�ȣ = ���¹�ȣ;
		this.��й�ȣ = ��й�ȣ;
		this.������ = ������;
		this.�ݾ� = 0;
	}
	
	
	// �޼ҵ� 
	
	
	public String get���¹�ȣ() {
		return this.���¹�ȣ;
	}
	
	public int get��й�ȣ() {
		return this.��й�ȣ;
	}
	
	public void �Ա�ó��(int �Աݾ�) {
		this.�ݾ� += �Աݾ�;
		System.err.println("�Ա�ó���� �Ϸ�Ǿ����ϴ�.");
		System.out.println("�Ա� ���� �ݾ�: "+this.�ݾ�);
	}
	
	public void ���ó��(int ��ݾ�) {
		this.�ݾ� -= ��ݾ�;
		if(this.�ݾ�<��ݾ�) {
			System.err.println("���ݾ��� �����մϴ� ");
			return;
		}
		System.out.println("��� ���� �ݾ�" + this.�ݾ�);
		System.err.println("���ó���� �Ϸ�Ǿ����ϴ�.");
	}
	
	
	
	
	// 1. ���� ��� �޼ҵ� 
	
	public void ���µ��() {
		System.out.println("[[[ ���� ��� ȭ�� ]]]");
		System.out.print("[[ ���¹�ȣ : "); // ����: �ߺ����� 
		String ���¹�ȣ = Day08_ATM.sc.next();
		System.out.print("[[ ��й�ȣ : "); // ����: 4���� ����
		int ��й�ȣ = Day08_ATM.sc.nextInt();
		System.out.print("[[ ������ : "); 
		String ������ = Day08_ATM.sc.next();
		
		
		// ��ü ����
		���� ���� = new ����(���¹�ȣ,��й�ȣ,������);
		
		Day08_ATM.���¸��.add(����);
		
	}
	
	// 2. �Ա� �޼ҵ�
	
	public void �Ա�() {
		System.out.println("[[[ �Ա� ��� ȭ�� ]]]");
		System.out.print("[[ ���¹�ȣ : "); // ����: �ߺ����� 
		String ���¹�ȣ = Day08_ATM.sc.next();
		System.out.print("[[ ��й�ȣ : "); // ����: 4���� ����
		int ��й�ȣ = Day08_ATM.sc.nextInt();
		System.out.print("[[ �Աݾ� : "); 
		int �Աݾ� = Day08_ATM.sc.nextInt();
		
		for(���� temp:Day08_ATM.���¸�� ) {
			if(temp.get���¹�ȣ().equals(���¹�ȣ) && temp.get��й�ȣ() == ��й�ȣ){	
				temp.�Ա�ó��(�Աݾ�);
				return;
			}
		}
		System.err.println("[����] ������ ���¹�ȣ Ȥ�� ��й�ȣ�� �ٸ��ϴ�");
	}
	
	public void ���() {
		System.out.println("[[[ ��� ��� ȭ�� ]]]");
		System.out.print("[[ ���¹�ȣ : "); // ����: �ߺ����� 
		String ���¹�ȣ = Day08_ATM.sc.next();
		System.out.print("[[ ��й�ȣ : "); // ����: 4���� ����
		int ��й�ȣ = Day08_ATM.sc.nextInt();
		System.out.print("[[ ��ݾ� : "); 
		int ��ݾ� = Day08_ATM.sc.nextInt();
		
		for(���� temp:Day08_ATM.���¸�� ) {
			if(temp.get���¹�ȣ().equals(���¹�ȣ) && temp.get��й�ȣ() == ��й�ȣ){	
				temp.���ó��(��ݾ�);
				return;
			}
		}
		System.err.println("[����] ������ ���¹�ȣ Ȥ�� ��й�ȣ�� �ٸ��ϴ�");
	}
	
	// 4. ��ü �޼ҵ�
	public void ��ü() {
		System.out.println("[[[��ü ȭ�� ]]]");
		System.out.print("[[ ���¹�ȣ : "); // ����: �ߺ����� 
		String ���¹�ȣ = Day08_ATM.sc.next();
		
		
		System.out.print("[[ ��й�ȣ : "); // ����: 4���� ����
		int ��й�ȣ = Day08_ATM.sc.nextInt();
		
		
	for(���� temp:Day08_ATM.���¸�� ) {
		if(temp.get���¹�ȣ().equals(���¹�ȣ) && temp.get��й�ȣ() == ��й�ȣ) {
		System.out.print("[[ ��ü �ݾ� : "); 
		int ��ü�ݾ� = Day08_ATM.sc.nextInt();
		if(temp.�ݾ�<��ü�ݾ�) {
			System.err.println("[����] ���ݾ��� �����մϴ�.");
			return;
		}
		System.out.print("�޴� ��� ���¹�ȣ : ");
		String ���¹�ȣ2 = Day08_ATM.sc.next();
		
		for(���� temp2:Day08_ATM.���¸��) {
			if(temp2.���¹�ȣ.equals(���¹�ȣ2)) {
				
				temp2.�ݾ� += ��ü�ݾ�;
				System.err.println("��ü�� �Ϸ� �Ǿ����ϴ�.");
			}
		}
		}
	}
	}
	
	public void ����ã��() {
		
	}
	
	
}
