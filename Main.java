import java.util.*;
 
/**
 * 최대 매출
 */ 
public class Main {
    public int solution(int n, int k, int[] arr) {
        int answer, sum = 0;

        // 주어진 배열의 0 index부터 k-1까지 합산 
        for (int i=0; i<k; i++) sum += arr[i];
        answer = sum;

        for (int i=k; i<n; i++) {
            sum += (arr[i] - arr[i-k]);
            answer = Math.max(answer, sum);   
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = kb.nextInt();
        kb.close();
        System.out.println(T.solution(n, k, arr));
    }
}