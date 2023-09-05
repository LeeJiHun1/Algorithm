package day0902;    //카펫

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P69 {
    public static void main(String[] args) {
        int brown = 8;
        int yellow = 1;
        System.out.println(Arrays.toString(solution(brown,yellow)));

    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = {};
        List<Integer> list = find(yellow);
        for(int N:list){
            int need = 0;
            need += N*2+4;
            need += (yellow/N)*2;
            if(need == brown){
                return new int[]{Math.max(N + 2, yellow / N + 2), Math.min(N + 2, yellow / N + 2)};
            }

        }

        return answer;
    }
    public static List<Integer> find(int N){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(N)+1; i++) {
            if(N%i==0){
                list.add(i);
            }
        }
        return list;
    }
}
