package lv0.배열_원소의_길이;

import java.util.Arrays;

class Solution {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist)
                .mapToInt(String::length)
                .toArray();
    }

    public static void main(String[] args) {

    }
}
