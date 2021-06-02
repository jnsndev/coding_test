import java.util.*;
 
/**
 * 숫자만 추출 (아스키코드)
 */ 
public class Main {
    public int solution(String str) {
        int answer = 0;
        char[] ch = str.toCharArray();
        
        for (char x : ch) {
            if (x >= 48 && x <= 57) answer = answer*10 + (x-48);
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