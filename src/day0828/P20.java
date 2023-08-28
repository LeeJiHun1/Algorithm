package day0828;

public class P20 {
    public static void main(String[] args) {
        String s = "qwer";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        String answer = "";
        int len = s.length();
        if(len%2==0){
            answer = String.valueOf(s.charAt(len/2-1))+String.valueOf(s.charAt(len/2));
        }else{
            answer = String.valueOf(s.charAt(s.length()/2));
        }
        return answer;
    }

}
