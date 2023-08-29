package day0829;    //개인 정보 수집

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;

public class P61 {
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        System.out.println(Arrays.toString(solution(today, terms, privacies)));
        String today1 = "2020.01.01";
        String[] terms1 = {"Z 3", "D 5"};
        String[] privacies1 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        System.out.println(Arrays.toString(solution(today1, terms1, privacies1)));
    }
    public static int[] solution(String today, String[] terms, String[] privacies) {       //today 오늘 날짜, terms = 약관종류 유효기간, 날짜 약관 종류 파기해야할 데이터를 result에 추가
        int[] answer = new int[privacies.length];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd", Locale.US);
        LocalDate date = LocalDate.parse(today, formatter);
        int len = terms.length;
        char[] type = new char[len];
        int[] limit = new int[len];
        for (int i = 0; i < len; i++) {
            type[i] = terms[i].charAt(0);
            limit[i] = Integer.parseInt( terms[i].substring(2));
        }
        int cnt = 0;
        System.out.println(date);
        for (int i = 0; i < privacies.length; i++) {
            String[] after = privacies[i].split(" ");
            LocalDate privacydate = LocalDate.parse(after[0],formatter);
            for (int j = 0; j < len; j++) {
                if(type[j] == after[1].charAt(0)){
                    privacydate = privacydate.plusMonths(limit[j]);
                    System.out.println(i+1+" "+privacydate);
                    if(date.isAfter(privacydate) || date.isEqual(privacydate)){
                        answer[cnt] = i+1;
                        cnt++;
                    }
                }
            }
        }
        int[] fin = Arrays.copyOf(answer,cnt);
        return fin;
    }
}
