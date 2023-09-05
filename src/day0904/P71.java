package day0904;    // N개의 최소공배수

public class P71 {
    public static void main(String[] args) {
        int[] arr = {2,6,8,14};
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        int CM = arr[0];
        for (int i = 1; i < arr.length; i++) {
            CM = find(CM,arr[i]);
            System.out.println(CM);
        }


        return CM;
    }

    public static int find(int a, int b){
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int M = 1;
        for (int i = 1; i <= min; i++) {
            if(max%i ==0 && min%i==0){
                M = i;
            }
        }
        return (a*b)/(M);
    }
}
