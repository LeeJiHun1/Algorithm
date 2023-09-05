package day0902;    //피보나치 수

public class P68 {
    public static void main(String[] args) {
        int n = 160;
        System.out.println(solution(n));

    }

    public static int solution(int n) {
        Long[] Fib = new Long[n+1];
        Fib[0] = 0L;
        Fib[1] = 1L;
        for (int i = 2; i < Fib.length; i++) {
            Fib[i] = (Fib[i-1]+Fib[i-2]) % 1234567;
        }

        return (int) (Fib[n]%1234567);
    }
}
