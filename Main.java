import java.util.*;

/**
 * 수열 추측하기
 */
public class Main {
    static int n, f, sum;
    static int[] b, p, chk;  // b: 이항계수, p: 순열, chk: p배열 value 방문여부체크
    static int[][] dy = new int[35][35];    // memoization
    static boolean flag = false;
    
    public int combination(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (r == 0 || n == r) return 1;
        if (r == 1) return n;
        return dy[n][r] = combination(n-1, r-1) + combination(n-1, r);      
    }
    
    public void DFS(int L, int sum) {
        if (flag) return;
        if (sum > f) return;
        if (L == n) {
            if (sum == f) {
                flag = true;
                for (int x : p) System.out.print(x + " ");
            }
        } else {
            for (int i=1; i<=n; i++) {  // i: p배열 value
                if (chk[i] == 0) {
                    chk[i] = 1;
                    p[L] = i;
                    DFS(L+1, sum+(b[L]*p[L]));
                    chk[i] = 0;
                }
            }       
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        f = kb.nextInt();
        kb.close();
        b = new int[n];
        p = new int[n];
        // chk의 length가 n+1인 이유: chk의 index가 p배열의 value (p배열 value 방문여부체크)
        chk = new int[n+1];

        for (int i=0; i<n; i++) {
            b[i] = T.combination(n-1, i);
        }

        T.DFS(0, 0);
    }
}