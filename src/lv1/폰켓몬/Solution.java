package lv1.폰켓몬;

import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        // 1. 종류 별로 Hash에 담기

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        // 2. 종류 별로 선택
        if (set.size() > nums.length / 2) {
            return nums.length / 2;
        }

        // 3. 리턴
        return set.size();
    }
}
