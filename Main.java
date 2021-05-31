import java.util.*;
 
/**
 * 문장 속 가장 긴 단어 찾기 (split 사용)
 */ 
public class Main {
    public String solution(String str) {
        String[] arr = str.split(" ");
        String answer = "";
        int cnt = Integer.MIN_VALUE;

        for (String s : arr) {
            if (cnt < s.length()) {
                cnt = s.length();
                answer = s;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        kb.close();
        System.out.println(T.solution(str));
    }
}