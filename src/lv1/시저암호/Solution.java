package lv1.시저암호;

class Solution {
    public String solution(String s, int n) {

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += n;
                if (chars[i] > 'Z') {
                    chars[i] -= 26;
                }
            }
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] += n;
                if (chars[i] > 'z') {
                    chars[i] -= 26;
                }
            }
        }


        return new String(chars);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ab = solution.solution("a B z", 4);
        System.out.println("ab = " + ab);
    }
}
