package lv1.서울에서김서방찾기;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";

        int i;
        for (i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                break;
            }
        }


        return "김서방은 " + i + "에 있다";
    }
}
