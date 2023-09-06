package day0906;        //n^2 배열 자르기

import java.util.Arrays;

public class P77 {
    public static void main(String[] args) {
        int n =4;
        int left = 7;
        int right = 14;
        System.out.println(Arrays.toString(solution(n,left,right)));
    }

    public static int[] solution(int n, long left, long right) {
        int[] arr = new int[(int) (right - left+ 1)];
        int len = (int)(right-left + 1);
        int cnt = 0;
        for (long i = left; i <= right; i++) {
            arr[cnt] = (int) Math.max((i/n) + 1 , (i%n) + 1 );
            cnt++;
        }
        return arr;
    }
}
