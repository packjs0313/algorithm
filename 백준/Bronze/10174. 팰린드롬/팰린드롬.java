import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < tc; i++) {
			String str = br.readLine();
			str = str.toUpperCase();
			StringBuilder sb = new StringBuilder(str);
			
			if(str.equals(sb.reverse().toString())) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
            }
		}
	}
}
