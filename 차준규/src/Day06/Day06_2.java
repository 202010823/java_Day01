package Day06;

import java.util.Scanner;

public class Day06_2 { // ȸ���� ���α׷� 
	public static void main(String[] args) {
		// 1. �ִ� 100���� ȸ���� �����ϴ� �迭 ���� [ 2���� �迭 ] 
				// 1. ���̵�, ��й�ȣ 
		// 2. ���ѷ��� [ �޴� ]
				// 1. ȸ������ 
		 		// 2. �α���
				// 3. ���� 
		// 3. ���ѷ��� [ �α��� �� ]
				// 1. ȸ��Ż�� , �н����� ���� , �α׾ƿ� [�ʱ� �޴���]
		
		//�Է°�ü 
		Scanner sc = new Scanner(System.in);
		// ȸ��100���� ���̵�� ��й�ȣ 
		String[][] ȸ����� = new String[100][2];
									// [ �� : ȸ����] [�� : ���̵�, ��й�ȣ ]
		
		// �ʱ�޴� = > ���ѷ���
		while(true) {
			System.out.println("----------ȸ���� ���α׷�-----------");
			System.out.println("1. ȸ������ 2. �α��� 3. ���� ");
			int ���� = sc .nextInt();
			
			if (���� == 1 ) { // ȸ������ : ���̵� , ��й�ȣ �Է¹޾� �迭�� ���� 
				System.out.println("----> ȸ������ ȭ�� ------>");
				System.out.print("-> ���̵� : "); 
				String ���̵� = sc.next();
					// ���̵� �ߺ�üũ 
					int �ߺ�üũ = 0 ;
					for(int i = 0 ;i<ȸ�����.length;i++) {
						if(ȸ�����[i][0]!=null && ȸ�����[i][0].equals(���̵�)) { //null�̸� ���� ���� ��� ������ ���⶧���� ���� �ϳ� �߰� 
							System.err.println("\n[����] �ߺ��� ���̵� �ֽ��ϴ�");
							�ߺ�üũ = 1; // �ߺ��� �ִ°�� 1
							break;
						}
					}
				if(�ߺ�üũ == 0) { // �ߺ��� ���� ��� 0 => ȸ������ ���� 
					System.out.print("-> ��й�ȣ :"); 
					String ��й�ȣ = sc.next();
					// �Է¹��� ���� �迭�� ���� 
					for(int i = 0; i<ȸ�����.length;i++) {
						// i�� 0���� �ִ� ȸ������ŭ 1 �� ���� �ݺ� 
						if(ȸ�����[i][0]==null) { // i ��° ���� ���̵� null �̸� 
							ȸ�����[i][0]= ���̵�; // id����
							ȸ�����[i][1]= ��й�ȣ; // ��й�ȣ ���� 
							System.err.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
							break; // ������ �ݺ��� ������ 
	
						}
					}
				}
			}
			else if(���� == 2) {
				System.out.println("----> �α��� ȭ�� ------>");
				System.out.print("-> ���̵� : "); 
				String ���̵� = sc.next();
				System.out.print("-> ��й�ȣ :"); 
				String ��й�ȣ = sc.next();
				
				int �α��ο��� =0;
				for(int i =0;i<ȸ�����.length;i++) {
					
					if(ȸ�����[i][0]!=null&&ȸ�����[i][0].equals(���̵�)&&ȸ�����[i][1].equals(��й�ȣ)) {
						System.err.println("[�α��� ����] �α��� �Ǿ����ϴ�.");
						�α��ο��� = 1;
						while (true) {
							System.out.println("-------ȸ�����-------");
							System.out.println("\t���̵� \t��й�ȣ  ");
								for(int j =0;i<ȸ�����.length;j++) {
									if(ȸ�����[j][0]!=null) {
										System.out.println("\t"+ ȸ�����[j][0]+"\t"+ȸ�����[j][1]);
									}
								}
							System.out.println("1.ȸ��Ż�� 2.�н����� ���� 3.�α׾ƿ�"); 
							int ����2 = sc.nextInt();
							if(����2 == 1) { // ����ȸ���� null�� ���� [Ż��� ȸ�� �������� ��ȸ���� ��ĭ�� ����]
									// i�� ���� �α��ε� ȸ���� �ε��� ��ȣ 
								ȸ�����[i][0] = null;
								ȸ�����[i][1] = null;
								
									//Ż���� ȸ�� �������� �ڿ��ִ� ȸ������ ��ĭ�� ���� 
								for(int h = i;h<ȸ�����.length;h++) {
									
									if(ȸ�����[h+1][0] !=null ) {
										ȸ�����[h][0] = ȸ�����[h+1][0]; // ��ĭ�� ���� 
										ȸ�����[h][1] = ȸ�����[h+1][1];
										
									}else {
										ȸ�����[h][0] = null;
										ȸ�����[h][1] = null;
										break;
									}
								}
								System.out.println("ȸ��Ż�� �Ǿ����ϴ�.");
								break;						
							}
							else if(����2 == 2) {
								System.out.print("------> �н����� ���� ȭ�� -----> :"); 
								System.out.println("���ο� ��й�ȣ : ");
								ȸ�����[i][1] = sc.next();
								System.out.println("[�н����� ����Ϸ�] ");
								break;
							}
							else if(����2 == 3) {
								System.err.println("[�α׾ƿ�] �α׾ƿ� �Ǿ����ϴ�");
								break;
							}
						}
					}
				}
			}
			else if(���� ==3) {
				System.err.println("[����] �̿����ּż� �����մϴ�.");
				break; // ���� ����� �ݺ��� Ȥ�� switch Ż�� 
				}

		}
		
	}
}
