package day0906;    //H-Index

import java.util.Arrays;

public class P76 {
    public static void main(String[] args) {
        int[] citations = {4, 4, 4};
        System.out.println(solution(citations));
    }

    public static int solution(int[] citations) {
        int answer = citations[citations.length-1];
        Arrays.sort(citations);

        for (int i = answer ;i > 0; i--) {
            int hplus = 0;
            for (int j = citations.length-1; j >= 0; j--) {
                if(citations[j] >= i){
                    hplus++;
                }else break;
            }
            if(hplus >= i) return i;
        }

        return answer;
    }
}
