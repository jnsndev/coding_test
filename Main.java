import java.util.*;
 
/**
 * 보이는 학생
 */ 
public class Main {
    public int solution(int n, int[] arr) {
        int answer = 1;
        int max = arr[0];

        for (int i=1; i<n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer++;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] height = new int[n];
        
        for (int i=0; i<n; i++) {
            height[i] = kb.nextInt();
        }
        kb.close();
        System.out.println(T.solution(n, height));
    }
}