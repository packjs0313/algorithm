import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = num-i; k > 0; k--) {
				System.out.print("*");
			}System.out.println();
		}

	}

}