import java.util.*;
 
/**
 * 부분집합 구하기
 */ 
public class Main {
    static int n;
    static int[] arr;

    public void DFS(int L) {
        if (L == n+1) {
            String tmp = "";
            for (int i=1; i<=n; i++) {
                if (arr[i] == 1) tmp += i + " ";
            }
            // 공집합을 출력하지 않기 위한 조건문
            if (tmp.length() > 0) System.out.println(tmp);
        } else {
            // L을 부분집합 원소로 사용
            arr[L] = 1;
            DFS(L+1);
            // L을 부분집합 원소로 사용하지않음
            arr[L] = 0;
            DFS(L+1);
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new int[n+1];
        kb.close();
        T.DFS(1);
    }
}