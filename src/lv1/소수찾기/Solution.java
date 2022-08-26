package lv1.소수찾기;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                answer++;
            }
        }

        return answer;
    }

    public boolean isPrime(int number) {
        int lim = (int)Math.sqrt(number);

        for (int i = 2; i <= lim; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}