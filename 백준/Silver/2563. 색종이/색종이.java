import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int[][] map = new int[100][100];
        
        for (int i = 0; i < tc; i++) {
            int a = sc.nextInt() -1;
            int b = sc.nextInt() -1;
            for (int j = 0; j < 10; j++) {
                for (int j1 = 0; j1 < 10; j1++) {
                    map[a+j][b+j1] += 1;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (map[i][j] >= 1) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}