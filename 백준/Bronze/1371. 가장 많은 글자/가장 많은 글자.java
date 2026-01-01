import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[26];
        while (sc.hasNextLine()) {
            String str = sc.nextLine();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) !=' ') {
                    arr[str.charAt(i) - 97]++;
                }
            }
        }
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                System.out.print((char)(i+97));
            }
        }
    }
}

