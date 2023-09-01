package day0901;

public class P65 {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        String[] spl = s.split(" ");
        int min = Integer.parseInt(spl[0]);
        int max = Integer.parseInt(spl[0]);
        for (String st : spl) {
            int str = Integer.parseInt(st);
            if(str > max){
                max = str;
            }else if(str < min){
                min = str;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(min+" "+max);
        return sb.toString();
    }
}
