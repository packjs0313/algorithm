import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args )throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int count = 0;
		
		if(str.equals(" ")) {
			System.out.println(0);
		}else {
		for (int i = 1; i < str.length()-1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}System.out.println(count+1);}
	}
}