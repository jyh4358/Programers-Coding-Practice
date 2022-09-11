package lv1.성격유형검사하기;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    private final String[] ARR = new String[]{"RT", "CF", "JM", "AN"};
    public String solution(String[] survey, int[] choices) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : ARR) {
            map.put(s, 0);
        }

        int[] numbers = Arrays.stream(choices).map(choice -> choice - 4).toArray();

        for (int i = 0; i < survey.length; i++) {
            if (map.containsKey(survey[i])) {
                map.put(survey[i], map.get(survey[i]) + numbers[i]);
            } else {
                char[] chars = survey[i].toCharArray();
                Arrays.sort(chars);
                String s = String.valueOf(chars);
                map.put(s, map.get(s) - numbers[i]);
            }
        }

        for (String s : map.keySet()) {
            if (map.get(s) <= 0) {
                answer += s.charAt(0);
            } else {
                answer += s.charAt(1);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});
    }
}
