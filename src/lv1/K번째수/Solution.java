package lv1.K번째수;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        System.out.println("answer.length = " + answer.length);

        for (int i = 0; i < commands.length; i++) {
            int[] arr = new int[commands[i][1] - commands[i][0] + 1];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = array[commands[i][0] - 1 + j];
            }
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2] - 1];
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});

        for (int i : solution1) {
            System.out.println("i = " + i);
        }
    }
}