import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s =sc.nextLine();
		int a[] = new int[123]; 
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = 97; j <= 122; j++) {
					if (s.charAt(i)==j) {
						a[j]++;
					
				}
			}
		}
		for (int i = 97; i <= 122; i++) {
			System.out.print(a[i] + " ");
			}
		}	
	}
