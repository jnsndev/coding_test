import java.util.*;
 
/**
 * 임시반장 정하기
 */ 
public class Main {
    public int solution(int n, int[][] board) {
        int answer = 0, max = Integer.MIN_VALUE;

        for (int i=1; i<=n; i++) {  // 비교 기준이 되는 i번 학생
            // i번 학생의 반과 1번에서 n번 학생의 반을 비교해 한번이라도 같은 반이었던 학생 수 
            int cnt = 0;

            for (int j=1; j<=n; j++) {  // 비교 대상이 되는 j번 학생
                for (int k=1; k<=5; k++) {  // k학년
                    if (board[i][k] == board[j][k]) {
                        cnt++;
                        // i번 학생과 j번 학생이 k학년에서 같은 반인 경우
                        // 예를 들어, k+1학년 때 다시 같은 반이 될 경우 j번 학생이 더블체크 되므로 break문 필수 
                        break;
                    }
                }
            }
            
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n+1][6];

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=5; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        kb.close();
        System.out.println(T.solution(n, board));
    }
}