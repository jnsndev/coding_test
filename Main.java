import java.util.*;
 
/**
 * 팩토리얼
 */ 
public class Main {
    static int answer = 1;

    public int DFS(int n) {
        if (n == 1) return 1;
        else return n * DFS(n-1);
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.close();
        System.out.println(T.DFS(n));
    }
}