import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1000 - sc.nextInt();
        int[] arr = {500,100,50,10,5,1};
        int count = 0;
        
        for (int i : arr) {
            count += (num/i);
            num = num%i;
        }
        System.out.println(count);
    }
}
