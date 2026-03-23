import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int total = h*60 + m + n;
        if (total >= 1440){
            total = total%1440;
        }
        System.out.println(total/60 + " " + total%60);
    }
}