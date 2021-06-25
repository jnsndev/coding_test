import java.util.*;
 
/**
 * 중복순열 구하기
 */ 
public class Main {
    static int n, m;    // n: 구슬에 적힌 마지막 번호, m: 뽑는 횟수
    static int[] arr;
    
    public void DFS(int level) {
        if (level == m) {
            for (int x : arr) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i=1; i<=n; i++) {
                arr[level] = i;
                DFS(level+1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[m];
        kb.close();
        T.DFS(0);
    }
}