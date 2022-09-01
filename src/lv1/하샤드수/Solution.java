package lv1.하샤드수;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        String s = String.valueOf(x);
        String[] split = s.split("");

        int sum = 0;
        for (int i = 0; i < split.length; i++) {
            sum += Integer.valueOf(split[i]);
        }

        return x % sum == 0 ? true : false;
    }
}