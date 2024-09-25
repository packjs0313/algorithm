import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int  yong = sc.nextInt();
		
		if (yong%4 == 0) {
			if (yong%100==0) {
				if (yong%400==0) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else {
				System.out.println("1");
				}
		}else {
			System.out.println("0");
		}	
	}	
}