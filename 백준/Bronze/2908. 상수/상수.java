import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n1 = sc.next();
		String n2 = sc.next();
		String Rn1 = "";
		String Rn2 = "";
		for(int j = 2; j >= 0; j--) {
			Rn1 = Rn1 +  n1.charAt(j); 
			Rn2 = Rn2 +  n2.charAt(j); 
		}
			
		if(Integer.parseInt(Rn1) < Integer.parseInt(Rn2)) {
			System.out.println(Rn2);
		}else {
			System.out.println(Rn1);	
		}
	}
}
