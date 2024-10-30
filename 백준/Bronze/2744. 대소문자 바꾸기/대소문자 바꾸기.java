import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		char b;
		
		String a = sc.next();
		
		for (int i = 0; i < a.length(); i++) {
			int ascll = a.charAt(i);
			if (ascll >= 65 && ascll<= 90 ) {
				ascll +=32;
				
				b = (char)ascll;
				System.out.print(b);
			}else if (ascll >= 97  && ascll <= 122 ) {
				ascll -=32;
				
				b = (char)ascll;
				System.out.print(b);
			}
		}

	}

}
