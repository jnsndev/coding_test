import java.util.*;
 
/**
 * 섬나라 아일랜드 (DFS)
 */
class Point {
    int x, y;
    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 
public class Main {
    static int n, answer;
    static int[][] island;
    static int[] dx = {0,   1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {-1, -1, 0, 1, 1,  1,  0, -1};

    public void DFS(int x, int y) {
        // 현재 좌표를 기준으로 상하좌우, 대각선이 섬인지 검사
        for (int z=0; z<8; z++) {
            int nx = x + dx[z];
            int ny = y + dy[z];

            if (nx >= 0 && nx < n && ny >= 0 && ny < n && island[nx][ny] == 1) {
                island[nx][ny] = 0;
                DFS(nx, ny);
            }
        }
    }
    
    public void solution() {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (island[i][j] == 1) {
                    island[i][j] = 0;
                    DFS(i, j);
                    answer++;
                }
            }
        }
    }
 
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        island = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                island[i][j] = kb.nextInt();
            }
        }
        kb.close();

        T.solution();
        System.out.println(answer);
    }
}