import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[] time = {300,60,10};
        int t = sc.nextInt();
        int[] count = new int[3];

        for (int i =0; i < time.length; i++) {
            count[i] = t / time[i];
            t = t%time[i];
        }

        if (t == 0) {
            for (int i : count) {
                System.out.print(i + " ");
            }
        }else{
            System.out.println(-1);
        }
    }
}
