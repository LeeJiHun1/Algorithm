package day0905;        //괄호 회전하기

import java.util.EmptyStackException;
import java.util.Stack;

public class P74 {
    public static void main(String[] args) {
        String s = "()[{}]"	 ;
        System.out.println(solution(s));
    }
    public static int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if(find(s)) answer++;
            s = s.substring(1)+s.charAt(0);
        }
        return answer;
    }

    public static boolean find(String s){
        Stack<Character> stack = new Stack<>();
        stack.push('0');
        try {
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case '[':
                        stack.push('[');
                        break;
                    case ']':
                        if (!stack.pop().equals('[')) return false;
                        break;
                    case '{':
                        stack.push('{');
                        break;
                    case '}':
                        if (!stack.pop().equals('{') ) return false;
                        break;
                    case '(':
                        stack.push('(');
                        break;
                    case ')':
                        if (!stack.pop().equals('(')) return false;
                        break;
                }
            }
            stack.pop();
        }catch (EmptyStackException e) {return false;};

        return stack.isEmpty();
    }
}
