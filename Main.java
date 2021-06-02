import java.util.*;
 
/**
 * 숫자만 추출 (Character.isDigit)
 */ 
public class Main {
    public int solution(String str) {
        int answer = 0;
        char[] ch = str.toCharArray();
        
        for (char x : ch) {
            // 방법1
            if (Character.isDigit(x)) answer = answer*10 + Character.getNumericValue(x);

            // 방법2
            // if (Character.isDigit(x)) answer += x;
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