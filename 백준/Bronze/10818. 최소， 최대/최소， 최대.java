import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = -1000000;
		int min = 1000000;
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt(); 
		}
		
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
			
		} System.out.print(min + " " + max);
		
	}

}
