package day0912;        // k 진수에서 소수 개수 구하기

public class P85 {
    public static void main(String[] args) {
        int n = 110011;
        int k = 10;
        System.out.println(solution(n,k));
    }

    public static int solution(int n, int k) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            sb.append(n%k);
            n /=k;
        }
        String[] splstr = sb.reverse().toString().split("0");
        for(String str : splstr){
            if(!str.equals("1") && !str.equals("")) {
                if(checkprime(Long.parseLong(str))) answer++;
            }
        }
        return answer;
    }
    public static boolean checkprime(Long N){
        if(N>=2) {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if(N % i == 0){
                    return false;
                }
            }
        }else return false;
        return true;
    }
}
