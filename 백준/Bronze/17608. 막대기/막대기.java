import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		int[] a = new int[tc];
		int max = 0;
		int count = 0;
		
		
		for (int i = 0; i < tc; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		for (int i = tc-1; i >= 0; i--) {
			if (a[i]>max) {
				max = a[i];
				count++;
				}
		}
		System.out.println(count);	
 	}
}