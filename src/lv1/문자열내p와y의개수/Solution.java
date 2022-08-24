package lv1.문자열내p와y의개수;

class Solution {
    boolean solution(String s) {

        String lowerString = s.toLowerCase();

        int pCount = 0;
        int yCount = 0;
        for (int i = 0; i < lowerString.length(); i++) {
            if (lowerString.charAt(i) == 'p') {
                pCount++;
            }
            if (lowerString.charAt(i) == 'y') {
                yCount++;
            }
        }


        return pCount == yCount;
    }
}