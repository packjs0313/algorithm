import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        long result = 1;

        for (int i = 0; i < N; i++) {
            result = result * sc.nextLong() % M;
        }
        System.out.println(result);
    }
}
