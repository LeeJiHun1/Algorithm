package day0829;        //푸드 파이트 대회

public class P41 {
    public static void main(String[] args) {
        int[] food = {1,3,4,6};
        System.out.println(solution(food));
    }
    public static String solution(int[] food) {
        String answer = "";
        StringBuilder sb1 = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                sb1.append(i);
            }
        }
        sb1.reverse();
        StringBuilder sb2 = new StringBuilder(sb1.reverse());
        sb1.append(0);
        sb2.reverse();
        sb1.append(sb2);
        return sb1.toString();
    }

}
