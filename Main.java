import java.util.*;
 
/**
 * 회문문자열 (원소 직접 비교)
 */ 
public class Main {
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();

        // 방법1
        // int lt = 0, rt = str.length()-1;

        // while (lt < rt) {
        //     if (str.charAt(lt) != str.charAt(rt)) answer = "NO";
        //     lt++;
        //     rt--;
        // }

        // 방법2
        int len = str.length();

        for (int i=0; i<len/2; i++) {
            if (str.charAt(i) != str.charAt(len-i-1)) answer = "NO";
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