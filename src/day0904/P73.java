package day0904;        // 귤 고르기

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class P73 {
    public static void main(String[] args) {
        int k = 2;
        int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};
        System.out.println(solution(k, tangerine));
    }
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> Map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            if(Map.containsKey(tangerine[i])){
                Map.put(tangerine[i], Map.get(tangerine[i])+1);
            }else{
                Map.put(tangerine[i], 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(Integer x : Map.keySet()){
            list.add(Map.get(x));
        }
        Collections.sort(list, Collections.reverseOrder());
        int sum =0;
        for (Integer x : list){
            answer++;
            sum +=x;
            if(sum>=k) break;
        }
        return answer;
    }
}
