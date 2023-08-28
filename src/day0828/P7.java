package day0828;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;

public class P7 {
    public static void main(String[] args) {
        long n = 11111;
        System.out.println(Arrays.toString(solution(n)));
    }
    public static Integer[] solution(long n) {
        String s = Long.toString(n);
        Integer[] answer = new Integer[s.length()];
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        for (int i = s.length()-1; i >= 0 ; i--) {
            answer[i] = (int)s.charAt(cnt) - 48;
            cnt++;
        }

        return answer;
    }
}
