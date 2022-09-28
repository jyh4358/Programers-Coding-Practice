package lv2.캐시;

import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> cityList = new ArrayList<>();

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        for (int i = 0; i < cities.length; i++) {

            String city = cities[i].toUpperCase();

            if (cityList.contains(city)) {
                answer += 1;
                cityList.remove(city);
                cityList.add(city);
            } else {
                if (cityList.size() == cacheSize) {
                    cityList.remove(0);
                    cityList.add(city);
                } else {
                    cityList.add(city);
                }
                answer += 5;
            }
        }

        return answer;
    }
}