package lv1.부족한금액계산하기;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;

        for (int i = 1; i <= count; i++) {
            answer -= i * price;
        }


        return answer > 0 ? 0 : -answer;
    }
}

