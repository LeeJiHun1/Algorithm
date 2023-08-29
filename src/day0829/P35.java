package day0829;        //시저 암호

public class P35 {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 1;
        System.out.println(solution(s,n));
    }
    public static String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                sb.append(" ");
            }else if(s.charAt(i) <= 'Z') {
                sb.append((char)((s.charAt(i) + n) > 'Z' ? (s.charAt(i)+n)-26 : s.charAt(i) + n));
            }else
                sb.append((char)((s.charAt(i) + n) > 'z' ? (s.charAt(i)+n)-26 : s.charAt(i) + n));
        }
        answer = sb.toString();
        return answer;
    }
}
