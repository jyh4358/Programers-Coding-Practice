package lv2.전화번호목록;

import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        // 1. HashMap을 만든다.
        HashMap<String, Integer> phoneMap = new HashMap<>();
        for (String phone : phone_book) {
            phoneMap.put(phone, 1);
        }

        // 2. 모든 전화번호의 접두어가 HashMap에 있는지 확인한다.

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                if (phoneMap.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }

        }

        // 3. 여기까지 오면 접두어가 없다.
        return true;
    }
}