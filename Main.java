import java.util.*;
 
/**
 * 점수 계산
 */ 
public class Main {
    public int solution(int[] arr) {
        int answer = 0, point = 0;

        for (int x : arr) {
            if (x == 1) {
                point++;
                answer += point;
            } else {
                point = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) arr[i] = kb.nextInt();
        kb.close();
        System.out.println(T.solution(arr));
    }
}