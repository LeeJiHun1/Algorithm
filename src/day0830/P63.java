package day0830;        //공원 산책

import java.util.Arrays;

public class P63 {
    public static void main(String[] args) {
        String[] park = {"SOO", "OXX", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};
        System.out.println(Arrays.toString(solution(park, routes)));

        String[] park2 = {"OSO", "OOO", "OXO", "OOO"};
        String[] routes2 = {"E 2", "S 3", "W 1"};
        System.out.println(Arrays.toString(solution(park2, routes2)));

    }

    public static int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        char[][] locate = new char[park.length][park[0].length()];
        int w = park[0].length();
        int h = park.length;
        int[] now = new int[0];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                locate[i][j] = park[i].charAt(j);
                if (locate[i][j] == 'S') {
                    now = new int[]{i, j};
                }
            }
        }
        for (String str : routes) {
            String[] strs = str.split(" ");
            int[] before = now;
            switch (strs[0]) {
                case "S":
                    now = moveE(locate, strs[1].charAt(0) - 48, now);
                    break;
                case "N":
                    now = moveW(locate, strs[1].charAt(0) - 48, now);
                    break;
                case "E":
                    now = moveS(locate, strs[1].charAt(0) - 48, now);
                    break;
                case "W":
                    now = moveN(locate, strs[1].charAt(0) - 48, now);
                    break;
            }
            if (now[0] > w || now[1] > h || now[0] < 0 || now[1] < 0) {
                now = before;
            }
        }
        return now;
    }

    public static int[] moveS(char[][] loca, int N, int[] now) {
        int x = now[0];
        int y = now[1];
        try {
            for (int i = 1; i <= N; i++) {
                if (loca[x][y + i] == 'X') {
                    return now;
                }
            }
            return new int[]{x, y + N};
        } catch (ArrayIndexOutOfBoundsException e) {
            return now;
        }
    }

    public static int[] moveN(char[][] loca, int N, int[] now) {
        int x = now[0];
        int y = now[1];
        try {
            for (int i = 1; i <= N; i++) {
                if (loca[x][y - i] == 'X') {
                    return now;
                }
            }
            return new int[]{x, y - N};
        } catch (ArrayIndexOutOfBoundsException e) {
            return now;
        }
    }

    public static int[] moveE(char[][] loca, int N, int[] now) {
        int x = now[0];
        int y = now[1];
        try {
            for (int i = 1; i <= N; i++) {
                if (loca[x + i][y] == 'X') {
                    return now;
                }
            }
            return new int[]{x + N, y};

        } catch (ArrayIndexOutOfBoundsException e) {
            return now;
        }
    }

    public static int[] moveW(char[][] loca, int N, int[] now) {
        int x = now[0];
        int y = now[1];
        try {
            for (int i = 1; i <= N; i++) {
                if (loca[x - i][y] == 'X') {
                    return now;
                }
            }
            return new int[]{x - N, y};
        } catch (ArrayIndexOutOfBoundsException e) {
            return now;
        }
    }
}
