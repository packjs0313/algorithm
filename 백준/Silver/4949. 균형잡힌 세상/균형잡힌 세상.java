import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            ArrayDeque<Character> stack = new ArrayDeque<>();
            String str = sc.nextLine();
            if (str.equals(".")) {
                break;
            }

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    stack.push('(');
                } else if (str.charAt(i) == '[') {
                    stack.push('[');
                }
                // 닫은지 확인
                else if (str.charAt(i) == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        System.out.println("no");
                        break;
                    }
                } else if (str.charAt(i) == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        System.out.println("no");
                        break;
                    }
                } else if (str.charAt(i) == '.') {
                    if (!stack.isEmpty()) {
                        System.out.println("no");
                        break;
                    } else {
                        System.out.println("yes");
                    }
                }
            }
        }
    }
}