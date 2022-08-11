package lv1.숫자문자열과영단어;

import java.util.*;

class Solution2 {
    public int solution(String s) {
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] alphabets = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
    }
}

// Integer.valueOf, Integer.parseInt
// 래퍼 클래스로 리턴하냐 기본 자료형으로 리턴하냐 차이
