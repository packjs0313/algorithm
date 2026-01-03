import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] T_size = new int[6];
        for (int i = 0; i < 6; i++) {
            T_size[i] = sc.nextInt();
        }
        int T = sc.nextInt();
        int P = sc.nextInt();

        int count = 0;
        for (int i = 0; i < T_size.length; i++) {
            while (T_size[i] > 0) {
                T_size[i] -= T;
                count++;
            }
        }
        System.out.println(count);
        System.out.println(N / P + " " + N % P);
    }
}