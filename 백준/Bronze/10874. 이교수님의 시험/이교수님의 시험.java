import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();
        int[] answer = new int[10];
        int[][] arr = new int[students][10];
        int[] reTest = new int[students]; 

        for (int i = 0; i < answer.length; i++) {
            answer[i] = i % 5 + 1;
        }

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt();
            }
            if (Arrays.equals(arr[i],answer)) {
                reTest[i] = i+1;
            }
        }
        Arrays.sort(reTest);
    
        for (int i = 0; i < reTest.length; i++) {
            if (reTest[i] != 0) {
                System.out.println(reTest[i]);
            }
        }
    }
}
