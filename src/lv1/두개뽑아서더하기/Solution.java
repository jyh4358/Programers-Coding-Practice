package lv1.두개뽑아서더하기;

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        List<Integer> sumNumbers = new ArrayList<>(set);
        Collections.sort(sumNumbers);

        int[] answer = new int[sumNumbers.size()];
        for (int i = 0; i < sumNumbers.size(); i++) {
            answer[i] = sumNumbers.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution(new int[]{2, 1, 3, 4, 1});

        for (int i : solution1) {
            System.out.println("i = " + i);
        }
    }
}
