package day0904;        //멀리 뛰기

import java.util.Arrays;

public class P72 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));
    }
    public static long solution(int n) {
        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1L;
        if(n>=2) {
            dp[2] = 2L;
        }
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567L ;
        }


        return dp[n];
    }
}
