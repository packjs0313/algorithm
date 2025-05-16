import java.util.Scanner;

public class Main {
    public static int gcd(int a,int b){

        int mok = a / b;
        int na = a % b;

        if (na==0) {
            return b;
        }
        return gcd(b,na);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>=b) {
            int gcd_ = gcd(a,b);
            System.out.println(gcd_);
            System.out.println(a * b / gcd_);
        }else{
            int gcd_ = gcd(b,a);
            System.out.println(gcd_);
            System.out.println(a * b / gcd_);
        }
    }
}