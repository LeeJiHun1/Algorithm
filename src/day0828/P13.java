package day0828;

public class P13 {
    public static void main(String[] args) {
        int n =6;
        System.out.println(solution(n));
    }
    public static int solution(int num) {
        int answer = 0;
        while(num!=1){
            if(num%2 == 0){
                num /=2;
            }else{
                num = num*3+1;
            }
            answer++;
            if(answer>=400){
                answer = -1;
                break;
            }
        }
        return answer;
    }

}
