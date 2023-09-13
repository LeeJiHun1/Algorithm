package day0911;        //피로도

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Comparator;

public class P83 {
    public static void main(String[] args) {
        int k = 80;
        int[][] dengeons = {{80,20},{50,40},{30,10}};
        System.out.println(solution(k,dengeons));
    }
    private static boolean[] isVisit;

    public static int solution(int k, int[][] dungeons) {
        isVisit = new boolean[dungeons.length];
        return go(k, dungeons);
    }

    private static int go(int k, int[][] dungeons) {
        int ans = 0;
        for (int i = 0; i < dungeons.length; i++) {
            if (!isVisit[i] && k >= dungeons[i][0]) {
                isVisit[i] = true;
                ans = Math.max(ans, go(k - dungeons[i][1], dungeons));
                isVisit[i] = false;
            }
        }
        return Math.max(ans, adventure(isVisit));
    }

    private static int adventure(boolean[] isVisit) {
        int count = 0;
        for (boolean v : isVisit) {
            if (v)
                count++;
        }
        return count;
    }
}
