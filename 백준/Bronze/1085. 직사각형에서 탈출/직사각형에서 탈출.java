import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int xnum = 0;
        int ynum = 0;


        if (x <= w-x){
            xnum = x;
        }else{
            xnum = w-x;
        }

        if (y <= h-y) {
            ynum = y;
        }else{
            ynum = h-y;
        }

        if (xnum<=ynum) {
            System.out.println(xnum);
        }else{
            System.out.println(ynum);
        }
    }
}
