import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		String OX;
		int a = 0;
		
		for (int i = 0; i < tc; i++) {
			OX = sc.next();
			int scr=0;
			a=0;
			for (int j = 0; j < OX.length(); j++) {
				if(OX.charAt(j)=='O') {
					a++;
				}else if (OX.charAt(j)=='X') {
					a=0;
				}scr+=a;
			}System.out.println(scr);
		}	
	}

}