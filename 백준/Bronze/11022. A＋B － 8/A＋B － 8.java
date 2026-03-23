import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int i = 0; i < tc; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int sum = a+b;

            System.out.println("Case #" + (i+1) + ": " + a+ " + " + b + " = " + sum);
        }
    }
}
