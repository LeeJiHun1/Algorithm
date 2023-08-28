package day0828;

public class P9 {
    public static void main(String[] args) {
        long n = 121;
        System.out.println(solution(n));
    }

    public static long solution(long n) {
        long answer = 0;
        long mat = (long) Math.sqrt(n);

        if (n == mat * mat) {
            return (mat + 1) * (mat + 1);
        } else {
            return -1;
        }
    }

}
