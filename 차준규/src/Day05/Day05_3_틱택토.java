package Day05;

import java.util.Random;
import java.util.Scanner;

public class Day05_3_ƽ���� {
	
	public static void main(String[] args) {
		// �� ���� 
		Scanner sc = new Scanner(System.in);
		String[] ������ = {"[ ]","[ ]","[ ]",
							"[ ]","[ ]","[ ]",
								"[ ]","[ ]","[ ]"};
		
		String �¸��� = " "; // �¸� ���� �����ϱ� ���� ����
		//������ ���
		while(true) { //���� ��ü ���ѷ��� [ ������ �ξ����� , �¸��ڰ� ���ð�� ���� ]
			for(int i=0;i<������.length;i++) {
				// 3���� ����Ŀ� �ٹٲ�
				System.out.print(������[i]);
				if(i%3 == 2 ) System.out.println();
			}
			//����
			if(�¸���.equals("[O]")) {
				System.out.println("���� ���� : �÷��̾� �¸� ");
				break;
			}
			if(�¸���.equals("[X]")) {
				System.out.println("���� ���� : ��ǻ�� �¸� ");
				break;
			}
			// ��� �� �ξ����� => ���� 9���̸�
		
		
		// �÷��̾ �Է¹޾� �ش� ��ġ�� �� �α� 
			while(true) {
				System.out.print("[����] �ΰ����ϴ� ��ġ :");
				int �÷��̾� = sc.nextInt(); //�ε��� 
					if(�÷��̾�>8 || �÷��̾�<0) {
						System.out.println("[0~8]������ ���� �Է����ּ���.:");		
					}
					else if(!������[�÷��̾�].equals("[ ]")) {
						System.out.println("[���!] �̹� ���� �����ϴ� ��ġ�Դϴ�.");
					}
					else {
						������[�÷��̾�] = "[O]"; // �Է¹��� �ε����� �� �ٲٱ� 
						break; // ���� ����� �ݺ��� Ż��
					}
			}// while2 end
			
			int ����˼� =0;
			for(int i=0;i<9;i++) {
				if(!������[i].equals("[ ]")) {
					����˼�++;
				}
			}
			if(����˼�==9) {
				while(true) { //���� ��ü ���ѷ��� [ ������ �ξ����� , �¸��ڰ� ���ð�� ���� ]
					for(int i=0;i<������.length;i++) {
						// 3���� ����Ŀ� �ٹٲ�
						System.out.print(������[i]);
						if(i%3 == 2 ) System.out.println();
					}
					System.out.println("���º�");
					break;
			}
				
				
			while(true) {	
				// ��ǻ�� [ ���� �����ؼ� �� �α� ]
				// ���� ���� = Random
				Random random = new Random(); // ���� ��ü ���� 
				int ��ǻ�� = random.nextInt(9); // ��ü���� ���� ���� �������� 
					// random.nextInt(); : 0~20�� ������ ���� ���� 
					// random.nextInt(10); : 0~9 ������ ���� ���� => ���� ���� -1 ���� ���� 
					// random.nextInt(10)+10; 10~19���� ���� ���� ==> ���� ��ȣ �ٲٴ� ��   
				if(������[��ǻ��].equals("[ ]")) {
					������[��ǻ��] = "[X]";
					break;
				}
			}
			// ���� 
			
				// ���η� �̱�� �� [0 1 2, 3 4 5 , 6 7 8]
				for(int i=0;i<=6;i+=3) {
					//i=>0, 3, 6
					if(������[i].equals(������[i+1])&&������[i+1].equals(������[i+2])) {
						if( !������[i].equals("[ ]")) �¸��� = ������[i];
					}
				}
		
			
				// ���η� �̱�� �� [0 3 6, 1 4 7 , 2 5 8]
				for (int i=0;i<3;i++) {
					if(������[i].equals(������[i+3])&&������[i+3].equals(������[i+6])) {
						if( !������[i].equals("[ ]")) �¸��� = ������[i];
					}
				}
				// �밢������ �̱�� �� [0 4 8, 2 4 6 ]
				
				if(������[0].equals(������[4])&&������[4].equals(������[8])) {
					if( !������[0].equals("[ ]")) �¸��� = ������[0];
				}
				if(������[2].equals(������[4])&&������[4].equals(������[6])) {
					if( !������[2].equals("[ ]")) �¸��� = ������[2];
				}
				
		 
					
			
		}//while1 end 
	} 
}
}
