package lv1.정수내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(String s:list) {
            sb.append(s);
        }
        return Long.parseLong(sb.toString());
    }
}