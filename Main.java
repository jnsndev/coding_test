import java.util.*;
 
/**
 * 경로 탐색 (인접리스트)
 */ 
public class Main {
    static int n, m, answer;
    static int[] ch;
    static List<ArrayList<Integer>> list;

    public void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int nv : list.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        list = new ArrayList<ArrayList<Integer>>();

        for (int i=0; i<=n; i++) {
            list.add(new ArrayList<Integer>());
        }

        for (int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            list.get(a).add(b);
        }
        kb.close();

        ch = new int[n+1];
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}