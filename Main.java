import java.util.*;
 
/**
 * 그래프 최단거리
 */ 
public class Main {
    static int n, m;
    static int[] ch, answer;
    static List<ArrayList<Integer>> graph;

    public void BFS(int v) {
        ch[v] = 1;      // ch[1] = 1
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);

        while (! q.isEmpty()) {
            int cv = q.poll();

            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {  // 방문 여부 체크
                    ch[nv] = 1;
                    q.offer(nv);
                    answer[nv] = answer[cv] + 1;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();

        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        kb.close();

        answer = new int[n+1];
        ch = new int[n+1];

        T.BFS(1);
        for (int i=2; i<answer.length; i++) System.out.println(i + " : " + answer[i]);
    }
}