package lv1.숫자문자열과영단어;

import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String s) {
        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] english = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        List<String> numberList = Arrays.asList(number);
        List<String> englishList = Arrays.asList(english);

        String stringAnswer = "";
        while (!s.isEmpty()) {
            for (int i = 0; i < number.length; i++) {
                if (s.startsWith(numberList.get(i))) {
                    stringAnswer += numberList.get(i);
                    s = s.substring(1);
                    break;
                } else if (s.startsWith(englishList.get(i))) {
                    stringAnswer += numberList.get(i);
                    s = s.substring(englishList.get(i).length());
                    break;
                }
            }

        }
        int answer = (int)Integer.valueOf(stringAnswer);

        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("2three45sixseven"));
    }
}
