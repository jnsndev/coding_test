import java.util.*;
 
/**
 * 봉우리 지역 개수
 */ 
public class Main {
    int[] dx = {0, 1, 0, -1};
    int[] dy = {-1, 0, 1, 0};

    public int solution(int n, int[][] board) {
        int answer = 0;

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                boolean flag = true;
                int cur = board[i][j];

                // 상하좌우 좌표값을 현재 좌표값과 비교
                for (int k=0; k<4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] >= cur) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }

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