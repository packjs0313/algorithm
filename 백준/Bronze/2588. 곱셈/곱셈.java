import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
    
        String str = Integer.toString(b);
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.println(a*(str.charAt(i) - '0'));
        }
        System.out.println(a*b);
    }
}