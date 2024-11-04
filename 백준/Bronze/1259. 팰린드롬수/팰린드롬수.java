import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count;
		int j;
		String num;
		
		while (true) {
			num = sc.next();
			j = num.length()-1;
			count = 0;
			if (num.equals("0")) {
				break;
			}
			for (int i = 0; i <= num.length()/2; i++) {
				if (num.charAt(i)==num.charAt(j)) {
					count ++;
				}
				j--;
			}
			if (count==num.length()/2+1) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}
}