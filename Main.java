import java.util.*;
 
/**
 * 암호해석
 */ 
public class Main {
    public String solution(int cnt, String str) {
        String answer = "";

        for (int i=0; i<cnt; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int binary = Integer.parseInt(tmp, 2);  // 2진수 
            answer += (char) binary;
            str = str.substring(7);
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        String str = kb.next();
        kb.close();
        System.out.println(T.solution(cnt, str));
    }
}