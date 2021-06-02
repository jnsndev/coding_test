import java.util.*;
 
/**
 * 중복문자 제거
 */ 
public class Main {
    public String solution(String str) {
        String answer = "";
        
        for (int i=0; i<str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
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