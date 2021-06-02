import java.util.*;
 
/**
 * 특정 문자 뒤집기
 */ 
public class Main {
    public String solution(String str) {
        char[] ch = str.toCharArray();
        int lt = 0, rt = ch.length-1;

        while (lt < rt) {
            if (! Character.isAlphabetic(ch[lt])) lt++;
            else if (! Character.isAlphabetic(ch[rt])) rt--;
            else {
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        kb.close();
        System.out.println(T.solution(str));
    }
}