import java.util.*;
 
/**
 * 유효한 팰린드롬 (replaceAll)
 */ 
public class Main {
    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equals(tmp)) answer = "YES";

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