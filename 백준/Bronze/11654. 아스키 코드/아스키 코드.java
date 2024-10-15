import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = a.charAt(a.length()-1);
		
		System.out.println(b);
	}
}
