import java.util.*;
 
/**
 * 학급 회장 선출
 */ 
public class Main {
    public char solution(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char x : str.toCharArray()) {
            // getOrDefault(x, 0): x key가 존재하면 그 값을 리턴하고 존재하지 않는다면 0을 리턴
            // => 카운팅할 때, 중요
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            // System.out.println(key + " " + map.get(key));
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();   // 학생 수
        String str = kb.next();
        kb.close();
        System.out.println(T.solution(n, str));
    }
}