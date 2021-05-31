import java.util.*;
 
/**
 * 문자 찾기
 */ 
public class Main {
    public int solution(String str, char ch) {
        int answer = 0;
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);

        for (char x : str.toCharArray()) {
            if (x == ch) answer++; 
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char ch = kb.next().charAt(0);
        kb.close();
        System.out.println(T.solution(str, ch));
    }
}