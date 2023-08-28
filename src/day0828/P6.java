package day0828;

import java.util.Arrays;

public class P6 {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(Arrays.toString(solution(2,5)));
    }
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i =0;i<n;i++){
            answer[i] = (long)x*(i+1);
        }

        return answer;
    }
}
