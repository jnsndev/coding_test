import java.util.*;

/**
 * 조합 경우의 수 (memoization)
 */
public class Main {
    // memoization을 위한 적당한 크기의 int 타입 2차원 배열 생성
    int[][] memo = new int[35][35];
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        kb.close();
        System.out.println(T.DFS(n, r));
    }
    public int DFS(int n, int r) {
        if(r == 0 || n == r) return 1;
        if(r == 1) return n;
        if(memo[n][r] > 0) return memo[n][r];
        
        return memo[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }
}