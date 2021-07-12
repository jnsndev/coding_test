import java.util.*;
 
/**
 * 연속된 자연수의 합
 */ 
public class Main {
    public int solution(int n) {
        int answer = 0, sum = 0, lt = 0;
        int m = n/2 + 1;    // 어떤 숫자까지 합할 것인지
        int[] arr = new int[m];

        for (int i=0; i<m; i++) arr[i] = i+1;   // 합할 숫자들을 배열에 저장

        for (int rt=0; rt<m; rt++) {
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt];
                lt++;
                if (sum == n) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.close();
        System.out.println(T.solution(n));
    }
}