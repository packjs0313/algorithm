import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N+2; i++) {
			if (i==0 ||i==N+1 ) {
				for (int j = 0; j < N+2; j++) {
					System.out.print("@");
				}
			}else {
				System.out.print("@");
				for (int j = 0; j < N; j++) {
					System.out.print(" ");
				}
				System.out.print("@");
			}
			System.out.println();
		}
	}
}