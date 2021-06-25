import java.util.*;
 
/**
 * 최대 점수 구하기
 */ 
public class Main {
    static int n, m, answer = Integer.MIN_VALUE;
    static int[] a, b;  // a: 점수, b: 시간
    
    public void DFS(int level, int point, int time) {
        if (time > m) return;
        if (level == n) {   // 부분집합 완성
            answer = Math.max(answer, point);
        } else {
            DFS(level+1, point+a[level], time+b[level]);
            DFS(level+1, point, time);
        }
    } 

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        a = new int[n];
        b = new int[n];

        for (int i=0; i<n; i++) {
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }
        kb.close();
        T.DFS(0, 0, 0);
        System.out.println(answer);
    }
}