import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int sum = 0;
		int max = 0;
		
		for (int i = 0; i < 4; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			sum = sum - a;
			sum = sum + b;
			
			if (max < sum) {
				max = sum;
			}
		}
		System.out.println(max);
	}

}