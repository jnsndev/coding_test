import java.util.*;
 
/**
 * 연속된 자연수의 합
 */ 
public class Main {
    public int solution(int n) {
        int answer = 0, connectedNumCnt = 1;
        
        n--;
        while (n > 0) {
            connectedNumCnt++;
            n = n - connectedNumCnt;
            if (n % connectedNumCnt == 0) answer++;
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