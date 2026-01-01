import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        str = str.toUpperCase();
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 65]++;
        }

        int max = -1;
        int temp = -1;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        char result = ' ';
        for (int i = 0; i < arr.length; i++) {
            if (temp == -1 && max == arr[i]) {
                temp = i;
                result = (char) (temp + 65);
            } else if (temp != -1 && max == arr[i]) {
                result = '?';
                break;
            }
        }
        System.out.println(result);
    }
}
