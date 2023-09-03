package lv0.짝수의_합;

import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
//        case 1
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                System.out.println("i = " + i);
//                answer += i;
//            }
//        }

//        case 2
        answer = IntStream.rangeClosed(2, n)
                .filter(num -> num % 2 == 0)
                .sum();

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int answer = solution.solution(10);
        System.out.println("answer = " + answer);
    }
}
