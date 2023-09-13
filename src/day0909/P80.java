package day0909;        // 의상

import java.util.HashMap;

public class P80 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, Integer> clothes_map = new HashMap<>();
        for(String[] str : clothes){
            clothes_map.put(str[1], clothes_map.containsKey(str[1])? clothes_map.get(str[1])+1 : 1); // 들어있으면 값을 가져와서 +1 추가하고, 안 들어있으면 1
        }

        int count = 1;

        if(clothes_map.size() == 1) return clothes.length;

        for(Integer val : clothes_map.values()) count *= val+1;
        return count-1;
    }
}
