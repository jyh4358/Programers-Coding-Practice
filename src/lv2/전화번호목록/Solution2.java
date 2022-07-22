package lv2.전화번호목록;

import java.util.Arrays;

public class Solution2 {
    // 해쉬 문제이지만 Sort를 이용하여 간단하게 풀 수 있다.
    public boolean solution(String[] phone_book) {
        // 1. sort를 해준다.
        Arrays.sort(phone_book);

        // 2. 접두어가 있는지 확인한다.
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }


        // 3. 여기까지 오면 접두어가 없다.
        return true;
    }
}
