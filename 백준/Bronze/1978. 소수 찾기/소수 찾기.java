
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] num = new int[N];
		int c = 0;
		int cuont=0;
		
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
			c=0;
			for (int j = 2; j <= num[i]; j++) {
				if (num[i] % j == 0) {
					c++;
					
				}
			}
			if (c==1) {
				cuont++;
			}
		}System.out.println(cuont);

	}

}