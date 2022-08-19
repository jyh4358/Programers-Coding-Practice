package lv1.모의고사;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] answers) {
        int[] counts = new int[3];

        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < 40; i++) {
            if (student1[i % 5] == answers[i % 5]) {
                counts[0]++;
            }
            if (student2[i % 8] == answers[i % 5]) {
                counts[1]++;
            }
            if (student3[i % 10] == answers[i % 5]) {
                counts[2]++;
            }
        }

        int asInt = Arrays.stream(counts).max().getAsInt();
        int count = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == asInt) {
                count++;
            }
        }
        int[] answer = new int[count];
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == asInt) {
                answer[i] = i + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution(new int[]{1, 2, 3, 4, 5});

        for (int i : solution1) {
            System.out.println("i = " + i);
        }

    }
}
