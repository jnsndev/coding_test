import java.util.*;
 
/**
 * 단어 뒤집기 (StringBuilder의 reverse 사용)
 */ 
public class Main {
    public ArrayList<String> solution(String[] words) {
        ArrayList<String> answer = new ArrayList<>();

        for (String str : words) {
            String sb = new StringBuilder(str).reverse().toString();
            answer.add(sb);
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