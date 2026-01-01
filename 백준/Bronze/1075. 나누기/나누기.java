import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int f = sc.nextInt();

        n /= 100;
        n *= 100;

        for (int i = 0; i < 99; i++) {
            if ((n + i) % f == 0) {
                if (i < 10) {
                    System.out.print("0");
                    System.out.print(i);
                } else {
                    System.out.println(i);
                }
                break;
            }
        }
    }
}
