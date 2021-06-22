import java.util.*;
 
/**
 * 합이 같은 부분집합 (아마존 인터뷰)
 */ 
public class Main {
    static String answer = "NO";
    static int n, total;
    static int[] arr;
    static boolean flag = false;

    public void DFS(int level, int sum) {
        if (flag) return;
        if (sum > total/2) return;
        if (level == n) {
            if ((total-sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(level+1, arr[level]+sum);
            DFS(level+1, sum);
        }
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }
        kb.close();
        T.DFS(0, 0);
        System.out.println(answer);
    }
}