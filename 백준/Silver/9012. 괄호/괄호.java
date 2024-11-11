import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for (int i = 0; i < tc; i++) {
			String str = sc.next();
			int Count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j)=='(') {
					Count++;
				}else {
					Count--;
				}
				
				if (Count == -1) {
					break;
				}
			}if (Count == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}