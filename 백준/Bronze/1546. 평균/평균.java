import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        float M = 0;

        float arr[] = new float[tc];
        for (int i = 0; i < tc; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > M){
                M = arr[i];
            }
        }

        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] / M) *100;
        }
        System.out.println(sum/tc);

    }
}
