package lv1.로또의최고순위와최저순위;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        int zeroCount = (int)Arrays.stream(lottos).filter(number -> number == 0).count();
        int count = 0;

        for (int number : lottos) {
            if (Arrays.stream(win_nums).anyMatch(winNumber -> winNumber == number)) {
                count++;
            }
        }

        int maxRank = 7 - (count + zeroCount);
        int minRank = 7 - count;

        if (maxRank > 6) {
            maxRank = 6;
        }
        if (minRank > 6) {
            minRank = 6;
        }
        return new int[]{maxRank, minRank};


    }
}