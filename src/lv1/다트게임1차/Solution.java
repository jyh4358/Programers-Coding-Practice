package lv1.다트게임1차;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        String dart = "";
        char ch;
        for (int i = 0; i < dartResult.length(); i++) {
            ch = dartResult.charAt(i);
            if (ch >= '0' && ch <= '9') {
                dart += ch;
                continue;
            }
            if (ch == '*') {

            }
        }


        return answer;
    }
}