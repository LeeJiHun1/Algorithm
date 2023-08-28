package day0828;

public class P30 {
    public static void main(String[] args) {
        int n = 125;
        System.out.println(solution(n));
    }
    public static int solution(int n) {

        StringBuilder sb = new StringBuilder();
        while(n!=0){
            sb.append(n%3);
            n /=3;
        }
        sb.reverse();
        int answer =0;
        for (int i = 0; i < sb.length(); i++) {
            answer += ((int)sb.charAt(i)-48)*Math.pow(3,i)  ;
        }
        return answer;
    }
}
