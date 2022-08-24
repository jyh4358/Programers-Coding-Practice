package lv1.두정수사이의합;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = a;
        }

        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }
}