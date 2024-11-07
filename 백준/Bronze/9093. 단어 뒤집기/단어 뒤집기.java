import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int tc = sc.nextInt();
		String enter= sc.nextLine();
		for (int i = 0; i < tc; i++) {
			String str = sc.nextLine();
			
			String[] arr = str.split(" ");
			
			for (int j = 0; j < arr.length; j++) {
				StringBuilder sb = new StringBuilder(arr[j]);
				sb.reverse();				
				System.out.print(sb + " ");
			}
			System.out.println();
		}
	}
}