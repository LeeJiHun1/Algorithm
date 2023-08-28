package day0828;

public class P5 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = 0;
        for(int i =1;i<=n;i++){
            if(n%i == 1){
                return i;
            }
        }
        return answer;
    }
}
