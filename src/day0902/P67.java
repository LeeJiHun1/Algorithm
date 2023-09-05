package day0902;        // 이진 변환 반복하기

import java.util.Arrays;

public class P67 {
    public static void main(String[] args) {
        String S = "110010101001";

        System.out.println(Arrays.toString(solution(S)));
    }

    public static int[] solution(String s) {
        int cnt = 0;
        int len = 0;
        while(!s.equals("1")){
            int beforelen = s.length();
            s = s.replaceAll("0", "");
            int afterlen = s.length();
            len += beforelen - afterlen;
            s= Integer.toBinaryString(afterlen);
            cnt++;
        }
        int[] answer = {cnt, len};
        return answer;
    }
}
