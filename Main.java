import java.util.*;
 
/**
 * 재귀함수를 이용한 이진수 출력
 */ 
public class Main {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.close();
        T.DFS(n);
    }
}