import java.util.Scanner;

public class Main {
    public static int gcd(int a,int b){
        if (a%b==0) {
            return b;
        }
        return gcd(b,a % b);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>=b){
            System.out.println(gcd(a,b));
            System.out.println(a * b / gcd(a,b));
        }else{
            System.out.println(gcd(a,b));
            System.out.println(a * b / gcd(a,b));
        }

    }
}