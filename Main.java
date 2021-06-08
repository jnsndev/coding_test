import java.util.*;
 
/**
 * 피보나치 수열 재귀
 */ 
public class Main {
    static int[] arr;

    public int DFS(int n) {
        if (arr[n] > 0) return arr[n];  // 같은 노드를 재방문하지 않기 위한 조건문
        if (n == 1 || n == 2) return arr[n] = 1;
        else return arr[n] = DFS(n-2) + DFS(n-1);
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.close();
        arr = new int[n+1];
        T.DFS(n);
        for (int i=1; i<=n; i++) System.out.print(arr[i] + " ");
    }
}