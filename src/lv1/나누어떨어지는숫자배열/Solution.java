package lv1.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if (list.size() == 0) {
            return new int[]{-1};
        }

        Collections.sort(list);

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
