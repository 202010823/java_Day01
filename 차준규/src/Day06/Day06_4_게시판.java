package Day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Day06_4_�Խ��� {
	// �Խ��� ���α׷� 
	static Scanner sc = new Scanner(System.in);
	//main �ۿ� �����ϴ� ���� : �ٸ� Ŭ�������� �ش� �޸�[����/��ü] �����ϱ� ����
		//���� : main ����Ǳ� ������ main�޼ҵ尡 �ش� �޸� �ν� x 
			// static : main �޼ҵ� ���� �޸� �켱�Ҵ� 
				// ���α׷� ����ñ��� �޸� �Ҵ� 
				// �������� ��� �ڵ忡 ���Ǵ� �޸� �Ҵ�� 
	// ����Ʈ 
	static ArrayList<�Խù�> �Խù���� = new ArrayList<>();
		// ArrayList<����Ʈ�� ���� Ŭ����> ��ü�� = new ArrayList<>();
			// < > : ���׸�
	public static void main(String[] args) {
	
		
		while(true) {
			�Խù�.�Խù����();
			System.out.println("1.�۾��� 2.�Խù����� 3.�Խù�����");
			int ���� = sc.nextInt();
			if(���� == 1) {
				�Խù�.�Խù����();
			}
			if(���� == 2) {
				System.out.println("�Խù���ȣ ���� : ");
				int ��ȣ = sc.nextInt();
				�Խù�.�Խù��󼼺���(��ȣ);
			}
			if(���� == 3) {}
		}
	}
}

