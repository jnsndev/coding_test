import java.util.*;
 
/**
 * 매출액의 종류
 */ 
public class Main {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // 배열의 k-1번째까지 map에 put
        for (int i=0; i<k-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // 배열의 k번째부터 탐색
        int lt = 0;
        for (int rt=k-1; rt<n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) map.remove(arr[lt]); // k 길이의 window를 sliding
            lt++;
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
        for (int x : T.solution(n, k, arr)) System.out.print(x + " ");
    }
}