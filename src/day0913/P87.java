package day0913;                //모음 사전

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class P87 {
    public static void main(String[] args) {
        String word = "AAAAE";
        System.out.println(solution(word));
    }
    public static int solution(String word) {
        int answer = 0;
        char[] chararr = {'A','E','I','O','U'};
        int[] numarr = new int[word.length()];
        int cnt = 0;
        for (int i = 0; i < word.length(); i++) {
            int num = 0;
            for (int j = 0; j < chararr.length; j++) {
                if(word.charAt(i)== chararr[j]) {
                    numarr[cnt] = j;
                    cnt++;
                }
            }
        }
        // 781   156   31   6   1
        System.out.println(Arrays.toString(numarr));
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0,781);
        hashMap.put(1,156);
        hashMap.put(2,31);
        hashMap.put(3,6);
        hashMap.put(4,1);

        for (int i = 0; i < numarr.length; i++) {
            answer += hashMap.get(i)*numarr[i]+1;
        }

        return answer;
    }
}
