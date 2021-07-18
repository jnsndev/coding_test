import java.util.*;
 
/**
 * 아나그램
 */ 
public class Main {
    public String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : str1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : str2.toCharArray()) {
            // str1에 없는 문자이거나 있는 문자여도 그 수가 일치하지 않는 경우
            if (! map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x, map.get(x) - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();
        kb.close();
        System.out.println(T.solution(str1, str2));
    }
}