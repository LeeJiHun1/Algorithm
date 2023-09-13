package day0909;    // 프로세스

import java.util.LinkedList;
import java.util.Queue;

public class P82 {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.println(solution(priorities,location));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Pri> Pri = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            Pri p = new Pri(priorities[i]);
            if(i == location) p.answer=true;
            Pri.offer(p);
        }
        int max = findMax(Pri);
        int cnt =0;
        while(true){
            if(Pri.peek().prio == max) {
                cnt++;
                boolean c = Pri.poll().answer;
                if(c){
                    return cnt;
                }
                max = findMax(Pri);
            }
            else{
                Pri.offer(Pri.poll());
            }
        }
    }
    public static class Pri {
        public int prio;
        public boolean answer = false;

        public Pri(int priority) {
            this.prio = priority;
        }
    }
    public static int findMax(Queue<Pri> pri){
        int max = 0;
        Queue<Pri> forSerarch = new LinkedList<>(pri);
        for (int i = 0; i < pri.size(); i++) {
            max = Math.max(forSerarch.poll().prio, max);
        }
        return max;
    }
}
