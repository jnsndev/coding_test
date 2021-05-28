import java.util.*;
 
/**
 * 토마토가 다 익는 최소일수 (BFS)
 */
class Point {
    int x, y;
    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 
public class Main {
    static int m, n;
    static int[][] tomatoBox, days;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static Queue<Point> Q = new LinkedList<>();
 
    public void BFS() {
 
        while (! Q.isEmpty()) {
            Point cp = Q.poll();
            
            for (int i=0; i<4; i++) {
                // 다음 좌표 구하기
                int nx = cp.x + dx[i];
                int ny = cp.y + dy[i];
 
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && tomatoBox[nx][ny] == 0) {
                    tomatoBox[nx][ny] = 1;
                    Q.offer(new Point(nx, ny));
                    days[nx][ny] = days[cp.x][cp.y] + 1;    // 토마토 익는 일수 구하기
                }
            }
        }        
    }
 
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        m = kb.nextInt();   // 가로
        n = kb.nextInt();   // 세로
        days = new int[n][m];
        tomatoBox = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                tomatoBox[i][j] = kb.nextInt();
                // 익은 토마토(=1)는 큐에 미리 offer
                if (tomatoBox[i][j] == 1) Q.offer(new Point(i, j));
            }
        }
        kb.close();
        T.BFS();
        boolean flag = true;    // 토마토상자에 안 익은 토마토가 있을 경우를 위해 존재
        int answer = Integer.MIN_VALUE;

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (tomatoBox[i][j] == 0) flag = false;
            }
        }

        if (flag) {
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    answer = Math.max(answer, days[i][j]);
                }
            }
            System.out.println(answer);
        }
        else System.out.println(-1);
    }
}