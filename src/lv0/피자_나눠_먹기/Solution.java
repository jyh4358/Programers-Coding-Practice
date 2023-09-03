package lv0.피자_나눠_먹기;

class Solution {
    public int solution(int n) {
        int pizza = n / 7;
        return pizza + (n % 7 != 0 ? 1 : 0);
    }

}
