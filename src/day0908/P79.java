package day0908;    //할인 행사

import java.util.HashMap;

public class P79 {
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        System.out.println(solution(want, number, discount));

//        String[] want = {"apple"};
//        int[] number = {10};
//        String[] discount = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};
//
//        System.out.println(solution(want, number, discount));
    }

    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {

            wantMap.put(want[i], number[i]);
        }       // want를 HashMap에 저장

        for (int i = 0; i < discount.length-want.length; i++) {
            HashMap<String, Integer> forResult = new HashMap<>(wantMap);
            for (int j = 0; j < 10; j++) {
                try {
                    if (forResult.containsKey(discount[i + j])) {
                        forResult.put(discount[i + j], forResult.get(discount[i + j]) - 1);
                    }
                }catch (IndexOutOfBoundsException e ){
                    continue;
                }
            }
            boolean re = true;
            for(Integer num : forResult.values()){
                if (num>0) re = false;
            }
            if(re) answer++;
        }
        return answer;
    }
}
