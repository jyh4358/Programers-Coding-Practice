package lv1.진법뒤집기;


import java.util.ArrayList;

class Solution {

    static final int NUMBER = 3;
    public int solution(int n) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();
        while (n / NUMBER > 0) {
            list.add(n % NUMBER);
            n = n / NUMBER;
        }
        list.add(n);
        for (int i = 0; i < list.size(); i++) {
            answer += (int) Math.pow(NUMBER, list.size() - i - 1) * list.get(i);

        }


        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("solution.solution(45) = " + solution.solution(45));

    }
}
