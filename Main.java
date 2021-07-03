import java.util.*;
 
/**
 * 격자판 최대합
 */ 
public class Main {
    public int solution(int n, int[][] board) {
        int answer = Integer.MIN_VALUE;
        int sum1 = 0, sum2 = 0;
        
        for (int i=0; i<n; i++) {
            sum1 = sum2 = 0;
            for (int j=0; j<n; j++) {
                sum1 += board[i][j];
                sum2 += board[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        
        for (int i=0; i<n; i++) {
            sum1 += board[i][i];
            sum2 += board[i][n-1-i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        kb.close();
        System.out.println(T.solution(n, board));
    }
}