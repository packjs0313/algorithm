import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static int count = 1;
    static int[] order;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();

        visited = new boolean[n + 1];
        graph = new ArrayList[n + 1];
        order = new int[n];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
            order[i-1] = 0;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i],Collections.reverseOrder());
        }

        dfs(start);
        for(int a : order){
            System.out.println(a);
        }
    }

    static void dfs(int now) {
        visited[now] = true;
        order[now-1] = count;
        count++;

        for (int next : graph[now]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}