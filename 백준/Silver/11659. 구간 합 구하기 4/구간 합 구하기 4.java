import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] num = new int[N];
        int[] sum = new int[N];
        
        for(int i =0;i < N; i++){
            num[i] = sc.nextInt();
            if(i != 0 ){
                sum[i] = sum[i-1]+num[i];
            }else{
                sum[i] = num[i];
            }
        }
        
        for(int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 1 ){
                System.out.println(sum[b-1]);
            }else{
                System.out.println(sum[b-1]-sum[a-2]);
            }
        }
    }
}
