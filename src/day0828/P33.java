package day0828;

public class P33 {
    public static void main(String[] args) {
        String t = "10203";
        String p = "15";
        System.out.println(solution(t,p));
    }
    public static int solution(String t, String p) {
        int answer = 0;
        int start = 0;
        int tlen = t.length();
        int len = p.length();
        while(start + len <= tlen){
            if(Long.parseLong(t.substring(start, start+len))<=Long.parseLong(p)){
                answer++;
            }
            start++;
        }
        return answer;
    }
}
