import java.util.*;
 
/**
 * 가장 짧은 문자거리
 */ 
public class Main {
    public int[] solution(String str, char t) {
        int answer[] = new int[str.length()];
        int p = 1000;

        // 해당 문자의 왼쪽에 위치한 t를 기준으로 거리 구하기
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        // 해당 문자의 오른쪽에 위치한 t를 기준으로 거리를 구한 후, 앞서 구했던 거리와 비교하여 최소값을 저장
        p = 1000;
        for (int i=str.length()-1; i>=0; i--) {
            if (str.charAt(i) == t) p = 0;
            else {
                p++;
                answer[i] = Math.min(p, answer[i]);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char t = kb.next().charAt(0);
        kb.close();
        for (int x : T.solution(str, t)) System.out.print(x + " ");
    }
}