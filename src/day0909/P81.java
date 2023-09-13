package day0909;        // 기능개발

import java.util.ArrayList;
import java.util.List;

public class P81 {
    public static void main(String[] args) {
//        int[] progresses = {93, 30, 55};
//        int[] speeds = {1, 30, 5};
//        System.out.println(solution(progresses, speeds));


        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        System.out.println(solution(progresses, speeds));
    }

    public static List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int day = 1;
        int idx = 0;
        while (!(progresses[progresses.length - 1] > 100 - (day * speeds[idx]) && idx == progresses.length-1)) {
            if (progresses[idx] >= 100 - (day * speeds[idx])) {
                int ans = 0;
                while (progresses[idx] >= 100 - (day * speeds[idx])) {
                    idx++;
                    ans++;
                    if (idx >= progresses.length) {
                        answer.add(ans);
                        return answer;
                    }
                }
                answer.add(ans);
            }
            day++;
        }
        return answer;
    }
}

