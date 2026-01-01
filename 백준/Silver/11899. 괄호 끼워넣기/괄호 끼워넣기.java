import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Character> stack = new ArrayDeque<>();
        String str = sc.nextLine();
        int temp = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            }
            else if (str.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    temp += 2;
                }
            }
        }
        System.out.println(str.length() - temp);
    }
}

