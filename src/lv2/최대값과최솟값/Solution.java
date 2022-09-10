package lv2.최대값과최솟값;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";

        String[] numbers = s.split(" ");

        int max = Arrays.stream(numbers)
                .mapToInt(Integer::valueOf)
                .max()
                .getAsInt();

        int min = Arrays.stream(numbers)
                .mapToInt(Integer::valueOf)
                .min()
                .getAsInt();



        return min + " " + max;
    }
}

