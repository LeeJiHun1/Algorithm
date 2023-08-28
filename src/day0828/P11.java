package day0828;

public class P11 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(solution(x));
    }
    public static boolean solution(int x) {
        boolean answer = true;
        String str = Integer.toString(x);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += (int)str.charAt(i)-48;
        }
        if(x%sum==0){
            return true;
        }else{
            return false;
        }
        //return answer;
    }
}
