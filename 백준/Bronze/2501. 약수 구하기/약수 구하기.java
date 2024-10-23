import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = 0;
		int[] c = new int[a];
		for (int i = 1; i < a+1; i++) {
			if (a%i == 0) {
				c[k] = i;
				k++;
			}
		}
			System.out.println(c[b-1]);


	}
}