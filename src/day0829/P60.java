package day0829;

import java.util.Arrays;

public class P60 {
    public static void main(String[] args) {
        String[] wallpaper = {".#...", "..#..", "...#."};
        System.out.println(Arrays.toString(solution(wallpaper)));
    }
    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];      // 0 = 제일 왼쪽 x 좌표 1 = 제일 위 좌표 2 = 제일 오른쪽 좌표 3 = 제일 아래 좌표
        answer[0] = 50;
        answer[1] = 50;
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j)=='#'){
                    System.out.println(i+" "+j);
                    answer[0] = Math.min(answer[0], i);
                    answer[1] = Math.min(answer[1], j);
                    answer[2] = Math.max(answer[2], i+1);
                    answer[3] = Math.max(answer[3], j+1);
                }
            }
        }

        return answer;
    }
}
