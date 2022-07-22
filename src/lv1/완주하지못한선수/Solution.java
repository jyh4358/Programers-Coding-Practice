package lv1.완주하지못한선수;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {

    // sort()를 이용한 풀이
    public String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }

    // Hash를 이용한 풀이
    public String solution2(String[] participant, String[] completion) {
        String answer = "";
        // 1. Hash map을 만든다
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        // 2. hash map을 뺀다.
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        // 3. value가 0이 아닌 마지막 주자를 찾는다. (keySet을 이용)
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        Solution sol = new Solution();
        System.out.println(sol.solution(participant, completion));
    }
}
