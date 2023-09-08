package day0908;        // 행렬의 곱셈

import java.util.Arrays;

public class P78 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 4},
                {3, 2},
                {4, 1}};

        int[][] arr2 = {{3, 3},
                {3, 3}};

        System.out.println(Arrays.toString(solution(arr1, arr2)));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }


}
