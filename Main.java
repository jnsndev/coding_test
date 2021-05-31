import java.util.*;
 
/**
 * 대소문자 변환 (아스키코드 이용)
 */ 
public class Main {
    public String solution(String str) {
        String answer = "";

        for (int x : str.toCharArray()) {
            // 대문자 아스키코드 : 65 ~ 90, 소문자 아스키코드 : 97 ~ 122
            if (x >= 97 && x <= 122) answer += (char) (x-32);
            else answer += (char) (x+32);
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        kb.close();
        System.out.println(T.solution(str));
    }
}