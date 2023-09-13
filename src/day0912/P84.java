package day0912;        // 타겟 넘버

public class P84 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println("solution(numbers,target) = " + solution(numbers, target));
    }
    public static int bfs(int[] numbers, int target, int depth) {       //depth 현재 탐색한 곳
        if (depth == numbers.length) {
            if (target == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        return bfs(numbers, target + numbers[depth], depth + 1) + bfs(numbers, target - numbers[depth], depth + 1); // 한 번은 + 한 번은 - 의 값을 구한다.
    }

    public static int solution(int[] numbers, int target) {
        int answer = 0;
        answer += bfs(numbers, target, 0);
        return answer;
    }
}
