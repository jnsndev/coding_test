import java.util.*;
 
/**
 * 멘토링
 */ 
public class Main {
    public int solution(int n, int m, int[][] board) {
        int answer = 0;

        for (int i=1; i<=n; i++) {   // i번 학생 (멘토)
            for (int j=1; j<=n; j++) {   // j번 학생 (멘티)
                int cnt = 0;

                // ex. (3번 멘토, 1번 멘티) 고정 후, 조건에 만족하는지 검사
                // 멘토-멘티 관계 충족 조건: 각 테스트에서 3번 학생의 등수가 1번 학생의 등수보다 높으면 cnt++; 
                // 멘토-멘티 관계 확정 조건: cnt 값이 m(테스트 수)과 같으면 모든 테스트에서 3번 학생의 등수가 1번 학생의 등수보다 높다는 증거이므로 멘토-멘티 관계 확정
                for (int k=0; k<m; k++) {   // k번째 테스트
                    int iGrade = 0, jGrade = 0;

                    for (int s=0; s<n; s++) {   // s등수
                        if (board[k][s] == i) iGrade = s;
                        if (board[k][s] == j) jGrade = s;
                    }
                    if (iGrade < jGrade) cnt++;
                }
                if (cnt == m) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();   // n명의 학생
        int m = kb.nextInt();   // m번의 테스트
        int[][] board = new int[m][n];

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        kb.close();
        System.out.println(T.solution(n, m, board));
    }
}