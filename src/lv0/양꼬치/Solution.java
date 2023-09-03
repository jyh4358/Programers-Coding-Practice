package lv0.양꼬치;

class Solution {
    public int solution(int n, int k) {
        int serviceCount = n / 10;
        return n * 12000 + (k - serviceCount) * 2000;
    }

    public static void main(String[] args) {

    }
}
