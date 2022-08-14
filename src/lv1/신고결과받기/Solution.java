package lv1.신고결과받기;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashMap<String, HashSet<String>> reportedMap = new HashMap<>();


        for (String re : report) {
            String[] str = re.split(" ");

            HashSet<String> reportSet = reportedMap.getOrDefault(str[1], new HashSet<String>());
            reportSet.add(str[0]);
            reportedMap.put(str[1], reportSet);
        }

        for (String key : reportedMap.keySet()) {
            if (reportedMap.get(key).size() > 1) {

            }
        }


        return answer;
    }

    class Airline {

    }
}
