import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count = 0;

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) == str.charAt(str.length()-1-i)) {
                count++;
            }
        }

        if (str.length()/2 == count) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
