import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int i = 0; i < tc; i++) {
            int a = sc.nextInt();
            String word = sc.next();

            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < a; k++) {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }   
    }
}
