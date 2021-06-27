import java.util.*;
 
/**
 * 순열 구하기
 */ 
public class Main {
    static int n, m;   // n: n개의 자연수 m: 뽑는 횟수
    static int[] nums, ch, answer;

    public void DFS(int level) {
        if (level == m) {
            for (int x : answer) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i=0; i<n; i++) {
                if (ch[i] == 0) {   // 원소 방문 여부 체크
                    ch[i] = 1;
                    answer[level] = nums[i];
                    DFS(level+1);
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
        nums = new int[n];
        ch = new int[n];
        answer = new int[m];

        for (int i=0; i<n; i++) {
            nums[i] = kb.nextInt();           
        }
        kb.close();
        T.DFS(0);
    }
}