import java.util.*;
 
/**
 * 두 배열 합치기
 */ 
public class Main {
    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;
            } else {
                answer.add(arr2[p2]);
                p2++;
            }
        }

        // 길이가 더 긴 배열의 남은 원소들을 출력
        while (p1 < n) answer.add(arr1[p1++]);
        while (p2 < m) answer.add(arr2[p2++]);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for (int i=0; i<n; i++) arr1[i] = kb.nextInt();
        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for (int j=0; j<m; j++) arr2[j] = kb.nextInt();
        kb.close();
        for (int x : T.solution(n, m, arr1, arr2)) System.out.print(x + " ");
    }
}