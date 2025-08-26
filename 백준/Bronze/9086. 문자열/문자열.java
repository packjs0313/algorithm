import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            String str = sc.next();
            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
        }
    }
}
