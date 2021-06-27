import java.util.*;
 
/**
 * 동전교환
 */ 
public class Main {
    static int n, total, answer = Integer.MAX_VALUE;
    static int[] coin;

    public void DFS(int level, int price) {
        if (price > total) return;
        if (level >= answer) return;
        if (price == total) {
            answer = Math.min(answer, level);
        } else {
            for (int i=0; i<coin.length; i++) {
                DFS(level+1, price+coin[i]);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        coin = new int[n];
        for (int i=n-1; i>=0; i--) {
            coin[i] = kb.nextInt();
        }
        total = kb.nextInt();
        kb.close();
        T.DFS(0, 0);
        System.out.println(answer);
    }
}