import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int tc = sc.nextInt();

        int[] arr = new int[num];
        int temp = 0;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < tc; i++) {
            int a = sc.nextInt() -1;
            int b = sc.nextInt() -1;
            
            for (int j = 0; j < (b - a + 1) / 2; j++) {
                temp = arr[a + j];
                arr[a + j] = arr[b - j];
                arr[b - j] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
