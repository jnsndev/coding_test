import java.util.*;

/**
 * 조합 구하기
 */
public class Main {
    static int n, m;
    static int[] combination, chk;

    public void DFS(int L, int s) {
        if (L == m) {
            for (int x : combination) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i=s; i<=n; i++) {
                combination[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        kb.close();
        chk = new int[n+1];
        combination = new int[m];
        T.DFS(0, 1);
    }
}