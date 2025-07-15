import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt() % 42;
        }


        Arrays.sort(arr);
        int num = 42;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            if(arr[i] != num){
                num = arr[i];
                count ++;
            }
        }
        System.out.println(count);

    }
}