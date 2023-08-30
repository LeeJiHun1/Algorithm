package day0830;        // 달리기 경주

import java.util.*;

public class P62 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution(players,callings)));
    }
    public static String[] solution(String[] players, String[] callings) {     // players 현재 플레이어 등수 대로, 해설자가 부른 이름
        String[] answer={};
        HashMap<String, Integer> now = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            now.put(players[i], i);
        }
        for (int i = 0; i < callings.length; i++) {
            int grade = now.get(callings[i]);

            String For = players[grade-1];
            players[grade-1] = callings[i];
            now.put(callings[i], grade-1 );

            players[grade] = For;
            now.put(For, grade);
        }
        return players;
    }
}
