package day0828;

import java.util.Arrays;

public class P10 {
    public static void main(String[] args) {
        long n = 118372;
        System.out.println(solution(n));
    }
    public static long solution(long n) {
        long answer=0;
        String str = ""+n;
        char[] arr = str.toCharArray();

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr));
        sb.reverse();

        answer = Long.parseLong(sb.toString());
        System.out.println(answer);
        return answer;
    }
}
