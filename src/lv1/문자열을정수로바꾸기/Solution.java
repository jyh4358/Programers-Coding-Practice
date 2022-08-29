package lv1.문자열을정수로바꾸기;

class Solution {
    public int solution(String s) {
        int answer = 0;

        answer = Integer.parseInt(s.substring(1));

        if (s.charAt(0) == '-') {
            answer = Integer.parseInt(s.substring(1)) * -1;
        } else {
            answer = Integer.parseInt(s);
        }

        return answer;
    }
}