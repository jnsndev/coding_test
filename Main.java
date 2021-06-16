import java.util.*;
 
/**
 * 경로 탐색 (인접행렬)
 */ 
public class Main {
    static int n, m, answer;    // 정점의 수, 간선의 수, 최종 값
    static int[] ch;            // 노드 방문여부 체크
    static int[][] graph;       // 연결정보 표현

    public void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int i=1; i<=n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {   // 연결정보에 부합 && 방문한 적 없는 노드
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;           
                }
            }
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        ch = new int[n+1];
        graph = new int[n+1][n+1];
    
        for (int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1;
        }
        kb.close();

        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}