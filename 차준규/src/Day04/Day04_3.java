package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 {

	//���������� ���� 
		//1. ���� ���� �� �� �ϳ��� �Է¹޾� ���� ���� 
		//2. ��ǻ�ʹ� ���� ��� 
		//3. ���� ������ �����ؼ� ���� �¸��� 
	public static void main(String[] args) {
		int ����Ƚ��=0;
		int �÷��̾���=0;
		int ��ǻ����=0;
		int ���º�=0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {// ���ѷ���
		System.out.print("����[0]����[1]��[2] ��������[4] �� ���� :"); 
		int �÷��̾� = sc.nextInt();
		if(�÷��̾�==0||�÷��̾�==1||�÷��̾�==2) {
			����Ƚ��++;
		}
		if( �÷��̾� == 0)
			System.out.println("������ �����߽��ϴ�");
		else if (�÷��̾� == 1)
			System.out.println("������ �����߽��ϴ�.");
		else if (�÷��̾� == 2)
			System.out.println("���� �����߽��ϴ�.");
		else if(�÷��̾� == 4) {
			System.out.println("����Ƚ�� :" + ����Ƚ��);
			System.out.println("����ڰ� �̱�Ƚ��: "+ �÷��̾���+" ��ǻ�Ͱ� �̱�Ƚ�� :"+��ǻ����+" ���º� Ƚ�� : "+ ���º�);
			if(�÷��̾���>��ǻ����) {
				System.out.println("����ڰ� ���� �¸��ϼ̽��ϴ�");
			}
			else if(�÷��̾���<��ǻ����) {
				System.out.println("��ǻ�Ͱ� ���� �¸��ϼ̽��ϴ�");
			}
			else{
				System.out.println("���º� �ϼ̽��ϴ�");
			}
			System.out.println("[������ �����մϴ�.]");
			break;
		}
		else {
			System.out.println("[���] �� �� ���� ��ȣ �Դϴ�.");
		}
		
		// ��ǻ�� => ���� �̿��� ���� ����[ Random: ���� ���õ� �޼ҵ� ���� ] 
		Random random = new Random();
		int ��ǻ�� = random.nextInt(3); // ���� ��ü���� ���� �������� [.nextInt(����) 0~���������� �������� ]
		if( ��ǻ�� == 0)
			System.err.println("������ �����߽��ϴ�");
		else if (��ǻ�� == 1)
			System.err.println("������ �����߽��ϴ�.");
		else if (��ǻ�� == 2)
			System.err.println("���� �����߽��ϴ�.");
		
		// �̱�� ���� => 3���� 
		
		if((�÷��̾�==0&&��ǻ��==2)||(�÷��̾�==1&&��ǻ��==0)||(�÷��̾�==2&&��ǻ��==1)) {
			System.out.println("�÷��̾� �¸�!");
			�÷��̾���++;
		}
		else if ((�÷��̾�==2&&��ǻ��==0)||(�÷��̾�==0&&��ǻ��==1)||(�÷��̾�==1&&��ǻ��==2)) {
			System.out.println("��ǻ�� �¸�");
			��ǻ����++;
		}
		else {// ���� ��� 
			System.out.println("���º�.");
			���º�++;
		}
		
		} // w end 
	}
}
