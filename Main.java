import java.util.*;
 
/**
 * 송아지 찾기
 */ 
public class Main {
    int[] dis = {-1, 1, 5};     // 한번에 이동할 수 있는 거리
    int[] ch;   // index = 좌표점 (방문 여부 체크)
    Queue<Integer> q = new LinkedList<>();

    public int BFS(int sn, int en) {    // start number, end number
        ch = new int[10001];
        int level = 0;
        q.offer(sn);

        while (! q.isEmpty()) {
            int len = q.size();
            
            for (int i=0; i<len; i++) {
                int x = q.poll();
                for (int j=0; j<3; j++) {
                    int nx = x + dis[j];    // 다음 좌표
                    
                    if (nx == en) return level+1;
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {    // 방문하지 않은 좌표만 q에 offer
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            level++;
        }
        
        return 0;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int sn = kb.nextInt();
        int en = kb.nextInt();
        kb.close();
        System.out.println(T.BFS(sn, en));
    }
}