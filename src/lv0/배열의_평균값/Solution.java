package lv0.배열의_평균값;

import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers)
                .average()
                .orElse(0);
    }

    public static void main(String[] args) {

    }
}
