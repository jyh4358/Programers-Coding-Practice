package lv1.정수제곱근판별;

class Solution {
    public long solution(long n) {

        long sqrt = (long) Math.sqrt(n);

        return sqrt * sqrt == n ? (long) Math.pow(sqrt, 2) : -1;
    }
}