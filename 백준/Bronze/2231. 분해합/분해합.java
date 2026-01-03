import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int sum = i;
            int temp = Integer.toString(i).length();
            temp = (int) Math.pow(10, temp - 1);
            int temp2 = i;
            
            while (temp > 0) {
                sum += temp2 / temp;
                temp2 %= temp;
                temp /= 10;
            }
            if (n == sum) {
                System.out.println(i);
                break;
            } else if (i == n - 1) {
                System.out.println(0);
            }
        }
    }
}
