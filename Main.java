import java.util.*;
 
/**
 * 뒤집은 소수
 */ 
public class Main {
    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i=2; i<num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int x : arr) {
            int tmp = x;
            int reverse = 0;
            // 뒤집은 수 만들기
            while (tmp > 0) {
                int num = tmp % 10;
                reverse = reverse * 10 + num;
                tmp /= 10;
            }
            if (isPrime(reverse)) answer.add(reverse); 
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
        for (int x : T.solution(n, arr)) System.out.print(x + " ");;
    }
}