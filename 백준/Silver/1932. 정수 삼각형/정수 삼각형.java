import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arr[][] = new int[n][n];
        int sumArr[][] = new int[n][n];


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            if(i == 0){
                sumArr[0][0] = arr[0][0];
                continue;
            }
            for (int j = 0; j <=i; j++) {
                sumArr[i][j] = sum(sumArr,arr,i,j);
            }
        }

        int max =0;
        for (int i = 0; i < n; i++) {
            if (max < sumArr[n-1][i]) {
                max = sumArr[n-1][i];
            }
        }
        System.out.println(max);
    }

    public static int sum(int[][] sumArr, int[][] arr,int i,int j){
        if(j == 0){
            return sumArr[i-1][j]+arr[i][j];
        }
            return Math.max(sumArr[i-1][j-1],sumArr[i-1][j] ) + arr[i][j]; 
    }
}
