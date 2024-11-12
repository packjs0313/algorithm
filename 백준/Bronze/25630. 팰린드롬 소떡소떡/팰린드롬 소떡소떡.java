import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String st = br.readLine();
		int count = 0;
		
		for (int i = 0; i < num/2; i++) {
			if(st.charAt(i) != st.charAt(st.length()-1-i)) {
				count++;
			}
		}
		System.out.println(count);	
	}
}