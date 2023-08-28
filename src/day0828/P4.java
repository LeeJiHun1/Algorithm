package day0828;

public class P4 {
    public static void main(String[] args) {

    }
    public int solution(int n) {
        int answer = 0;

        for(int i =1;i<=n;i++){
            if(n%i == 0){
                answer +=i;
            }
        }

        return answer;
    }
}
