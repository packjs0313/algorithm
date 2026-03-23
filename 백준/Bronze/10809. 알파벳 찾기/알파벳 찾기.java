import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
            for (int j = 0; j < S.length(); j++) {
                int asc = S.charAt(j);

                if (asc == 97 + i && arr[i] == -1 ) {
                    arr[i] = j;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
