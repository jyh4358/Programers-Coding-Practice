package lv2.JadenCase문자열만들기;

import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String temp = "";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)!=' ') temp += s.charAt(i);
            else {
                if(temp.length()>0)
                    answer += temp.substring(0,1).toUpperCase()+temp.substring(1,temp.length()).toLowerCase();
                answer += " ";
                temp = "";
            }
        }
        if(temp.length()>0) answer += temp.substring(0,1).toUpperCase()+temp.substring(1,temp.length()).toLowerCase();
        return answer;
    }
}
