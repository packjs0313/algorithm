import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		char b;
		
		String a = br.readLine();
		
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
