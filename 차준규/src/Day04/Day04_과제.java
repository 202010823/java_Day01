package Day04;

public class Day04_°úÁ¦ {
	public static void main(String[] args) {
		for(int i = 1;i<=5;i++) {
			System.out.print("*");
			for(int q=0;q<10-2*i;q++) {
				System.out.print(" ");
			}
			for(int p=0;p<i;p++) {
				System.out.print("*");
			}
		}
	}
}
