import java.util.*;

public class Main {
    static boolean[] v;
    static ArrayList<Integer>[] grp;
    static int[] result;
    static int count =0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int st = sc.nextInt();

        v = new  boolean[n+1];
        grp = new ArrayList[n+1];
        result = new int[n+1];

        for (int i = 1; i <= n; i++) {
            grp[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            grp[a].add(b);
            grp[b].add(a);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(grp[i]);
        }
        bfs(st);

        for (int i = 1; i <= n; i++) {
            System.out.println(result[i]);
        }

    }
    static void bfs(int now){
        Queue<Integer> q = new LinkedList<>();
        q.add(now);
        v[now] = true;

        while (!q.isEmpty()){
            int next = q.poll();
            count++;
            result[next] = count;
            for (int a :grp[next]) {
                if (!v[a]) {
                    v[a] = true;
                    q.add(a);
                }
            }
        }
    }
}