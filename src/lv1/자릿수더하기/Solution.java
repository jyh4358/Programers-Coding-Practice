package lv1.자릿수더하기;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        int number = n;
        while (number > 0) {
            answer += number % 10;
            number /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(6) = " + solution.solution(123));

    }
}