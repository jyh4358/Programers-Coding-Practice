package lv1.없는숫자더하기;

import java.sql.Array;
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();

        for (int number : numbers) {
            list.add(number);
        }

        for (int i = 0; i < 10; i++) {
            if (!list.contains(i)) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("solution.solution(new int[]{1,2,3,4,6,7,8,0}) = " + solution.solution(new int[]{5, 8, 4, 0, 6, 7, 9}));
    }
}
