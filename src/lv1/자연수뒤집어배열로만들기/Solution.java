package lv1.자연수뒤집어배열로만들기;

class Solution {
    public int[] solution(long n) {

        String str = String.valueOf(n);
        char[] s = str.toCharArray();
        int[] answer = new int[str.length()];
        for(int i=str.length()-1;i>=0;i--) {
            answer[str.length()-1-i] = str.charAt(i)-'0';
        }
        return answer;
    }
}
