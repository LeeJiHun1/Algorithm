package day0828;

public class P12 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(solution(a,b));
    }
    public static long solution(int a, int b) {
        long answer = 0;

        if (a>b){
            int tmp = a;
            a = b;
            b = tmp; // 서로 교환할 때 쓰는 느낌
        }

        for (int i = a; i <= b ; i++) {
            answer = answer + i;
        }
        return answer;
    }
}
