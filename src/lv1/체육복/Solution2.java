package lv1.체육복;

import java.util.HashSet;

// 배열을 이용한 풀이
class Solution2 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n + 2];

        for (int l : lost) {
            student[l]--;
        }
        for (int r : reserve) {
            student[r]++;
        }

        for (int i = 1; i <= n; i++) {
            if (student[i] > 0) {
                if (student[i - 1] < 0) {
                    student[i]--;
                    student[i - 1]++;
                } else if (student[i + 1] < 0) {
                    student[i]--;
                    student[i + 1]++;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (student[i] >= 0) {
                answer++;
            }
        }

        return answer;

    }
}
