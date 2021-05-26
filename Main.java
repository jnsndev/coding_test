import java.util.*;

/**
 * 미로탐색 (DFS)
 */
public class Main {
    static int[][] miro = new int[8][8];
    // index 0: 좌 1: 상 2: 우 2: 하
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int answer = 0;

    public void DFS(int x, int y) {
        if (x == 7 && y == 7) answer++;
        else {
            // 현재좌표의 상하좌우 4방향 검사
            for (int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >=1 && nx <=7 && ny >= 1 && ny <=7 && miro[nx][ny] == 0) {
                    miro[nx][ny] = 1;
                    DFS(nx, ny);
                    miro[nx][ny] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        for (int i=1; i<=7; i++) {
            for (int j=1; j<=7; j++) {
                miro[i][j] = kb.nextInt();
            }
        }
        kb.close();
        miro[1][1] = 1;

        // 출발점 좌표 (x: 1, y: 1)
        T.DFS(1, 1);
        System.out.println(answer);
    }
}