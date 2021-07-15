import java.util.*;
 
/**
 * 최대 길이 연속부분수열
 */ 
public class Main {
    public int solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;
        
        for (int rt=0; rt<n; rt++) {
            if (arr[rt] == 0) cnt++;    // 0을 1로 변경한 횟수 카운팅
            while (cnt > k) {
                if (arr[lt] == 0) cnt--;    // 0을 1로 변경할 수 있는 최대 횟수인 k를 넘어가면 감소
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);     // 1로만 구성된 연속부분수열의 최대 길이
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();   // 수열의 길이
        int k = kb.nextInt();   // 0을 1로 변경할 수 있는 최대 횟수
        int[] arr = new int[n]; // 수열
        for (int i=0; i<n; i++) arr[i] = kb.nextInt();
        kb.close();
        System.out.println(T.solution(n, k, arr));
    }
}