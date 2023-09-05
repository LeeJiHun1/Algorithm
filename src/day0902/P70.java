package day0902;        //예상 대진표

public class P70 {
    public static void main(String[] args) {
        int N = 16;
        int A = 1;
        int B = 16;
        System.out.println(solution(N,A,B));
    }
    public static int solution(int n, int a, int b)
    {
        int answer = 0;
        int F = a;
        int B = b;
        a = Math.max(F,B);
        a = Math.min(F,B);

        while(true){
            a = (a+1)/2;
            b = (b+1)/2;
            if(a==b) return answer;
            answer++;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    }
}
