import java.util.*;
 
/**
 * 두 배열 합치기
 */ 
public class Main {
    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        // 주어진 배열 오름차순 정렬
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (p1 < n && p2 < m) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1]);
                p2++;
            }
            // 각 배열이 오름차순으로 정렬된 상태 =>
            // arr1[p1]이 arr2[p2]보다 작다면 더 큰 수인 arr1[p1+1]과 arr2[p2]를 비교해야하므로 p1++;
            else if (arr1[p1] < arr2[p2]) p1++;
            else p2++;
        }

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