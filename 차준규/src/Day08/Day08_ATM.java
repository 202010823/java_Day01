package Day08;

import java.util.ArrayList;
import java.util.Scanner;

public class Day08_ATM {  
	
	public static Scanner sc = new Scanner(System.in);
	
	public static ArrayList<����> ���¸�� = new ArrayList<>(); 
	
	public static void main(String[] args) {
		start();
	}
	
	public static void start() {
		
		while(true) {
			System.out.println("[[[ ATM ]]]");
			System.out.println("[[ 1.���»��� 2.�Ա� 3.��� 4.��ü 5.����ã�� 6.���� ");
			int ���� = sc.nextInt();
			if(���� == 1) {
				
				System.out.println("[[1.�������� 2.��������]]");
				int ����2 = sc.nextInt();
				if(����2 == 1) {
					�������� �������� = new ��������();
					��������.���µ��();
				}
			}
			else if(���� == 2) {
				System.out.println("[[1.�������� 2.��������]]");
				int ����2 = sc.nextInt();
				if(����2 == 1) {
					���� �������� = new ��������();
					��������.�Ա�();
			 }
			}
			else if(���� == 3) {
				System.out.println("[[1.�������� 2.��������]]");
				int ����2 = sc.nextInt();
				if(����2 == 1) {
					���� �������� = new ��������();
					��������.���();
			 }
			}
			else if (���� == 4) {
				
			}
			else if (���� == 5 ) {
				
			}
			else if(���� == 6) {
				System.err.println("[����]");
				break;
			}
			else {
				System.err.println("[���] : �˼� ���� ��ȣ �Դϴ�");
			}
					
			
		}
	}
	
	
	
}

