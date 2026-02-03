import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int i = 0; i < tc; i++) {
            int a = sc.nextInt()%10;
            int b = sc.nextInt();

            if (a == 1 || a == 5 || a == 6) {
                System.out.println(a);
            }else if(a == 4 || a == 9){
                if (b%2== 1) {
                    System.out.println(a);
                }else{
                    System.out.println(a*a % 10);
                }
            }else if(a == 2 || a == 3 || a == 7 || a == 8){
                if (b%4 == 1) {
                    System.out.println(a);
                }else if(b%4 == 2){
                    System.out.println(a*a % 10);
                }else if(b%4 == 3){
                    System.out.println(a*a*a % 10);
                }else{
                    System.out.println(a*a*a*a % 10);
                }
            }else{
                System.out.println(10);
            }
        }
    }
}