package lv2.위장;

import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }
        int answer = 1;

        Iterator<Integer> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            answer *= iterator.next().intValue() + 1;
        }

        return answer - 1;
    }
}
