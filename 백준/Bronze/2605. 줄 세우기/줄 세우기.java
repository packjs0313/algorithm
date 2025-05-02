import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        ArrayList<Integer> line = new ArrayList<>(num); 

        for (int i = 0; i < num; i++) {
            int student = sc.nextInt();
            line.add(line.size()-student,i+1);
        }

        for (int i = 0; i < num; i++) {
            System.out.println(line.get(i));
        }
    }
}
