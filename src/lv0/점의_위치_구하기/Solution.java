package lv0.점의_위치_구하기;

class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        if (x * y > 0) {
            if (x > 0) {
                return 1;
            } else {
                return 3;
            }
        } else {
            if (x > 0) {
                return 4;
            } else {
                return 2;
            }
        }
    }

    public static void main(String[] args) {

    }
}
