import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[7];
        int a = 0;
        int b = 1;
        int stick = sc.nextInt();

        for (int i = 0; i < num.length; i++) {
            num[i] = b;
            b = b*2;
        }
        
        for (int i = num.length-1; i >= 0; i--) {
            if (stick >= num[i]) {
                stick -= num[i];
                a++;
            }
        }
        System.out.println(a);
    }
}