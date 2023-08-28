package day0828;

public class P3 {
    public static void main(String[] args) {
        int N = 123;

    }
    public int solution(int n) {
        int answer = 0;

        while(n>0){
            answer += n%10;
            n = n/10;
        }


        return answer;
    }
}
