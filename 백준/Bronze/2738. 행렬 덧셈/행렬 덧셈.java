import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[][] sum = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];

        for (int i = 0; i < sum.length; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < sum[0].length; j++) {
                sum[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < sum.length; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < sum[0].length; j++) {
                System.out.print(sum[i][j] + Integer.parseInt(st.nextToken()));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}