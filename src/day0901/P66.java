package day0901;

import java.util.Arrays;

public class P66 {
    public static void main(String[] args) {
        String s = "3people    unFollowed me";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] strArr = s.toLowerCase().split("");
        boolean blank = true;

        for(String str : strArr) {
            answer.append((blank) ? str.toUpperCase() : str);
            blank = str.equals(" ");
        }
        return answer.toString();
    }
}
