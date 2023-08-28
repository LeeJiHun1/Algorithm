package day0829;

public class P34 {
    public static void main(String[] args) {
        int[][] sizes = {{60,50}, {30,70},{60,30},{80,40}};
        System.out.println(solution(sizes));
    }
    public static int solution(int[][] sizes) {
        int answer = 0;
        //case1
        int w1 = 0;
        int h1 = 0;
        int w2 = 0;
        int h2 = 0;
        for (int i = 0; i < sizes.length; i++) {
            w1 = Math.max(w1, sizes[i][0]);
            h1 = Math.max(h1, sizes[i][1]);

            w2 = Math.max(w1, sizes[i][1]);
            h2 = Math.max(h1, sizes[i][0]);

            System.out.println(w1);
            System.out.println(h1);
            System.out.println(w2);
            System.out.println(h2);
            System.out.println();


            if(w1*h1 > w2*h2){
                w1 = w2;
                h1 = h2;
            }

        }
        answer = w1*h1;
        return answer;
    }
}
