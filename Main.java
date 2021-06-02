import java.util.*;
 
/**
 * 문장 속 가장 긴 단어 찾기 (indexOf, subString 사용)
 */ 
public class Main {
    public String solution(String str) {
        String answer = "";
        int idx, cnt = Integer.MIN_VALUE;

        while((idx = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, idx);
            int len = tmp.length();

            if (cnt < len) {
                cnt = idx;
                answer = tmp;
            }
            str = str.substring(idx+1);
        }
        if (cnt < str.length()) answer = str;

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