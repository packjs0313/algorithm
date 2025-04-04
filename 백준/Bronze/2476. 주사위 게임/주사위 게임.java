import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int max = 0;
        int maxdice = 0;

        for(int i = 0; i < num; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == b && b == c) {
                if (max < 10000 + 1000 * a) {
                    max = 10000 + 1000 * a;
                }
            }else if (a==b || b==c || a==c){
                if (a==b||b==c) {
                    if (max < 1000 + 100 * b) {
                        max = 1000 + 100 * b;
                    }
                }else{
                    if (max < 1000 + 100 * c) {
                        max = 1000 + 100 * c;
                    }
                }
            }else{
                    if(maxdice < a){
                        maxdice = a;
                    }
                    if(maxdice < b){
                        maxdice = b;
                    }
                    if(maxdice < c){
                        maxdice = c;
                    }

                    if (max < 100 * maxdice) {
                        max = 100 * maxdice;
                    }
                }
            }
            System.out.println(max);
        }
    }
