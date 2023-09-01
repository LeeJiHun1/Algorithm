package day0901;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class P64 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        System.out.println(Arrays.toString(solution(id_list,report,k)));
    }
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashSet<String> strset = new HashSet<>();
        for (int i = 0; i < report.length; i++) {
            strset.add(report[i]);
        }
        HashMap<String, Integer> repocnt = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            repocnt.put(id_list[i], 0);
        }
        for(String st : strset){
            String[] str = st.split(" ");
            int before = repocnt.get(str[1]);
            repocnt.put(str[1], before+1);
        }
        for(String st : strset) {
            String[] str = st.split(" ");
            if(repocnt.get(str[1])>=k) {
                for (int i = 0; i < id_list.length; i++) {
                    if (Objects.equals(str[0], id_list[i])) {
                        answer[i]++;
                    }
                }
            }

        }
        return answer;
    }
}
