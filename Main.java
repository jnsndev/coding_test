import java.util.*;
 
/**
 * 소수 (에라토스테네스 체)
 */ 
public class Main {
    public int solution(int n, int[] arr) {
        int answer = 0;

        // time limit exceeded
        // for (int i=2; i<=n; i++) {
        //     if (arr[i] == 0) {
        //         answer++;
        //         for (int j=2; j<=n; j++) {
        //             if (j % i == 0) arr[j] = 1;
        //         }
        //     }
        // }

        for (int i=2; i<=n; i++) {
            if (arr[i] == 0) {
                answer++;
                // i의 배수를 소거하는 방법
                for (int j=i; j<=n; j=i+j) arr[j] = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.close();
        int[] arr = new int[n+1];
        System.out.println(T.solution(n, arr));
    }
}