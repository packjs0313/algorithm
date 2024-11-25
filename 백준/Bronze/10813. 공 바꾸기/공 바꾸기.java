import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc= new Scanner(System.in);
		
		int num = sc.nextInt();
		int tc = sc.nextInt();
		int[] ball = new int[num];
		int b1;
		
		for (int i = 0; i < num; i++) {
			ball[i] = i+1;
		}
		for (int i = 0; i < tc; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			b1 = ball[a-1];
			ball[a-1] = ball[b-1];
			ball[b-1] = b1;
		}
		
		for (int i = 0; i < ball.length; i++) {
			System.out.print(ball[i] + " ");
		}
		
	}
}