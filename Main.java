import java.util.*;
 
/**
 * 바둑이 승차
 */ 
public class Main {
    static int c, n, answer = Integer.MIN_VALUE;
    static int[] arr;

    public void DFS(int level, int sum) {
        if (sum > c) return;    // ckg을 넘어가면 밑에 로직 실행할 필요x
        if (level == n) {       // 부분집합 완성
            answer = Math.max(sum, answer);
        } else {
            DFS(level+1, sum+arr[level]);   // arr[level] 값을 부분집합에 포함
            DFS(level+1, sum);              // arr[level] 값을 부분집합에 미포함
        }
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n = kb.nextInt();
        arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();
        T.DFS(0, 0);
        System.out.println(answer);
    }
}