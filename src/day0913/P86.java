package day0913;            // 주차 요금 계산

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class P86 {
    public static void main(String[] args) throws ParseException {
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        System.out.println(solution(fees, records).toString());
    }

    public static ArrayList<Integer> solution(int[] fees, String[] records) throws ParseException {
        ArrayList<Integer> answer = new ArrayList<>();
        // fees 기본 시간, 기본 요금, 단위 시간, 단위 요금
        //          180     5000        10      600

        HashMap<Integer, Date> timeTable = new HashMap<>();
        DateFormat df = new SimpleDateFormat("HH:mm");
        HashMap<Integer, Integer> finaltable = new HashMap<>();
        for (String record : records) {
            String[] splitedRecord = record.split(" "); // 0 시간 1 차량번호 2 In or OUT
            if (Objects.equals(splitedRecord[2], "IN")) {
                timeTable.put(Integer.parseInt(splitedRecord[1]), df.parse(splitedRecord[0]));
            } else if (Objects.equals(splitedRecord[2], "OUT")) {
                Date Intime = timeTable.get(Integer.parseInt(splitedRecord[1]));
                Long differenceInMillis = df.parse(splitedRecord[0]).getTime() - timeTable.get(Integer.parseInt(splitedRecord[1])).getTime();
                if (finaltable.containsKey(Integer.parseInt(splitedRecord[1]))) {
                    finaltable.put((Integer.parseInt(splitedRecord[1])), finaltable.get((Integer.parseInt(splitedRecord[1]))) +(int) (differenceInMillis/(60*1000L)));
                }else {
                    finaltable.put((Integer.parseInt(splitedRecord[1])), (int) (differenceInMillis/(60*1000L)));
                }
                timeTable.remove(Integer.parseInt(splitedRecord[1]));
            }
        }
        for (Integer carnum : timeTable.keySet()) {
            Long differenceInMillis = df.parse("23:59").getTime() - timeTable.get(carnum).getTime();
            if (finaltable.containsKey(carnum)) {
                finaltable.put(carnum, finaltable.get(carnum) +(int) (differenceInMillis/(60*1000L)));
            }else {
                finaltable.put(carnum, (int) (differenceInMillis/(60*1000L)));
            }
        }
        int[] keyset = new int[finaltable.size()];
        int cnt = 0;
        for(Integer keys : finaltable.keySet()){
            keyset[cnt] = keys;
            cnt++;
        }
        Arrays.sort(keyset);
        for(int key : keyset){      //in 주차한 차량의 주차한 시간들
            int in = finaltable.get(key);
            int fee = 0;
            if(in < fees[0]){                       // 기본 시간보다 낮을 경우
                answer.add(fees[1]);                // 기본 요금 청구
            }else{
                in -= fees[0];                      // 기본시간을 빼고 나머지 계산
                double mon = Math.ceil((double)in/fees[2]) * fees[3];
                answer.add(fees[1]+(int)mon);
            }
        }
        return answer;
    }
}
