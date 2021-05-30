import java.util.*;
 
/**
 * 피자 배달 거리 (DFS)
 */
class Point {
    int x, y;
    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 
public class Main {
    static int n, m, answer = Integer.MAX_VALUE;
    static int[] combi;
    static int[][] cityArr;
    static ArrayList<Point> hs, pz;

    public void DFS(int L, int s) {    // L: Level, s: start number
        if (L == m) {   // 피자집 조합 4개 다 뽑힌 경우
            int sum = 0;
            
            for (Point h : hs) {
                int dis = Integer.MAX_VALUE;    // 해당 집의 피자배달거리
                for (int idx : combi) {
                    Point p = pz.get(idx);
                    dis = Math.min(dis, Math.abs(h.x-p.x) + Math.abs(h.y-p.y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i=s; i<pz.size(); i++) {   // 피자집 조합 구하기
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
 
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];
        cityArr = new int[n][n];
        hs = new ArrayList<>();
        pz = new ArrayList<>();

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                cityArr[i][j] = kb.nextInt();
                if (cityArr[i][j] == 1) hs.add(new Point(i, j));
                else if (cityArr[i][j] == 2) pz.add(new Point(i, j));
            }
        }
        kb.close();
        T.DFS(0, 0);
        System.out.println(answer);
    }
}