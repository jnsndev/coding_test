import java.util.*;
 
/**
 * 단어 뒤집기 (직접 교환)
 */ 
public class Main {
    public ArrayList<String> solution(String[] words) {
        ArrayList<String> answer = new ArrayList<>();

        // 방법1
        // for (String str : words) {
        //     int len = str.length();
        //     char[] ch = str.toCharArray();

        //     // len = 4인 경우 첫번째 문자와 맨 뒤의 문자, 두번째 문자와 세번째 문자를 바꿔주면 됨 => 총 2회
        //     for (int i=0; i<len/2; i++) {
        //         char tmp = ch[i];
        //         ch[i] = ch[len-i-1];
        //         ch[len-i-1] = tmp;
        //     }
        //     answer.add(String.valueOf(ch));
        // }

        // 방법2
        for (String str : words) {
            char[] ch = str.toCharArray();
            int lt = 0, rt = ch.length-1;

            while (lt < rt) {
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(ch));
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] words = new String[n];

        for (int i=0; i<n; i++) {
            words[i] = kb.next();
        }

        kb.close();
        for (String x : T.solution(words)) System.out.println(x);
    }
}