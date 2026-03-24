import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int arr_len = Integer.parseInt(st.nextToken());
        int tc = Integer.parseInt(st.nextToken());
        int[][] arr = new int[arr_len][arr_len];
        for (int i = 0; i < arr_len; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < arr_len; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] sum_arr = new int[arr_len][arr_len];
        for (int i = 0; i < arr_len; i++) {
            for (int j = 0; j < arr_len; j++) {
                if (i == 0 && j==0) {
                    sum_arr[0][0] = arr[0][0];
                }else if(i==0){
                    sum_arr[i][j] = sum_arr[i][j-1] + arr[i][j];
                }else if(j==0){
                    sum_arr[i][j] = sum_arr[i-1][j] +arr[i][j];
                }else{
                    sum_arr[i][j] = sum_arr[i-1][j] + sum_arr[i][j-1] - sum_arr[i-1][j-1] +arr[i][j];
                }
            }
        }

        for (int i = 0; i < tc; i++) {
            st = new StringTokenizer(bf.readLine());

            int x1 = Integer.parseInt(st.nextToken())-1;
            int y1 = Integer.parseInt(st.nextToken())-1;
            int x2 = Integer.parseInt(st.nextToken())-1;
            int y2 = Integer.parseInt(st.nextToken())-1;

            if (x1 == 0 && y1 == 0) {
                System.out.println(sum_arr[x2][y2]);
            }else if(x1 == 0){
                System.out.println(sum_arr[x2][y2]- sum_arr[x2][y1-1]);
            }else if(y1 == 0){
                System.out.println(sum_arr[x2][y2] - sum_arr[x1-1][y2]);
            }else{
                System.out.println(sum_arr[x2][y2] - sum_arr[x1-1][y2]- sum_arr[x2][y1-1] + sum_arr[x1-1][y1-1]);
            }
        }

    }
}
